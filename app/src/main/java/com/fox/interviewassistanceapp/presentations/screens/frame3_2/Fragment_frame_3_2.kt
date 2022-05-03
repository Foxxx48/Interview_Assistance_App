package com.fox.interviewassistanceapp.presentations.screens.frame3_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.databinding.FragmentFrame32Binding
import com.fox.interviewassistanceapp.models.QuestionModel
import com.fox.interviewassistanceapp.utilits.APP_ACTIVITY
import com.fox.interviewassistanceapp.utilits.TYPE_ROOM


class Fragment_frame_3_2 : Fragment() {

    private var _binding: FragmentFrame32Binding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: FragmentFrame3_2ViewModel
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var mAdapter: Frame_3_2_Adapter
    private lateinit var mObserverList: Observer<List<QuestionModel>>

    private lateinit var arrow: ImageButton
//    private lateinit var hiddenView: LinearLayout
//    private lateinit var cardView: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFrame32Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        initialization()

    }

    private fun initialization() {
        mAdapter = Frame_3_2_Adapter()
        mRecyclerView = mBinding.recyclerviewFragmentFrame32
        mRecyclerView.adapter = mAdapter

        mObserverList = Observer {
            val list = it.asReversed()
            mAdapter.setList(list)
        }

        mViewModel = ViewModelProvider(this).get(FragmentFrame3_2ViewModel::class.java)
        mViewModel.allQuestion.observe(this,mObserverList)

        mBinding.btnAddQuestion.setOnClickListener {
            APP_ACTIVITY.mNavController.navigate(
                R.id.action_fragment_frame_3_2_to_add_question_card
            )
        }

        mBinding.
    }


//        cardView = findViewById(R.id.item_card_text_question_card_expandable)
//        arrow = findViewById(R.id.arrow_button)
//        hiddenView = findViewById(R.id.hidden_view)
//
//        arrow.setOnClickListener {
//            // If the CardView is already expanded, set its visibility
//            //  to gone and change the expand less icon to expand more.
//            if (hiddenView.getVisibility() == View.VISIBLE) {
//
//                // The transition of the hiddenView is carried out
//                //  by the TransitionManager class.
//                // Here we use an object of the AutoTransition
//                // Class to create a default transition.
//                TransitionManager.beginDelayedTransition(
//                    cardView,
//                    AutoTransition()
//                )
//                hiddenView.setVisibility(View.GONE)
//                arrow.setImageResource(R.drawable.ic_baseline_expand_more_24)
//            } else {
//                TransitionManager.beginDelayedTransition(
//                    cardView,
//                    AutoTransition()
//                )
//                hiddenView.setVisibility(View.VISIBLE)
//                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
//            }
//        }
//    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        mViewModel.allQuestion.removeObserver(mObserverList)
        mRecyclerView.adapter = null
    }
}