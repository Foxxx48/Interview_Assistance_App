package com.fox.interviewassistanceapp.presentations.screens.add_question_card

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.databinding.FragmentAddQuestionCardBinding
import com.fox.interviewassistanceapp.models.QuestionModel
import com.fox.interviewassistanceapp.utilits.APP_ACTIVITY
import com.fox.interviewassistanceapp.utilits.showToast


class Add_question_card : Fragment() {

    private var _binding: FragmentAddQuestionCardBinding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: AddQuestionCardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddQuestionCardBinding.inflate(layoutInflater,container,false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()
    }

    private fun initialization() {
        mViewModel = ViewModelProvider(this).get(AddQuestionCardViewModel::class.java)

        mBinding.btnAddQuestion.setOnClickListener {
            val name = mBinding.inputQuestionText.text.toString()
            val text = mBinding.inputAnswerText.text.toString()
                if (name.isEmpty()) {
                    showToast(getString(R.string.toast_enter_question_name))
                } else {
                    mViewModel.insert(QuestionModel(question = name, answer = text)) {
                        APP_ACTIVITY.mNavController.navigate(R.id.action_add_question_card_to_fragment_frame_3_2)
                    }
                }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}