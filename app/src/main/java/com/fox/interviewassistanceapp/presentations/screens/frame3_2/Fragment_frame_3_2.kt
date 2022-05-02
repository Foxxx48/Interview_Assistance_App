package com.fox.interviewassistanceapp.presentations.screens.frame3_2

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.lifecycle.ViewModelProvider
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.databinding.FragmentFrame32Binding
import com.fox.interviewassistanceapp.databinding.FragmentFrame3Binding
import com.fox.interviewassistanceapp.presentations.screens.frame3.FragmentFrame3ViewModel


class Fragment_frame_3_2 : Fragment() {

    private var _binding: FragmentFrame32Binding? = null
    private val mBinding get() = _binding!!
    private lateinit var mViewModel: FragmentFrame3_2ViewModel

    lateinit var arrow: ImageButton
    lateinit var hiddenView: LinearLayout
    lateinit var cardView: CardView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFrame32Binding.inflate(layoutInflater,container,false)
        return mBinding.root


    }

    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this).get(FragmentFrame3_2ViewModel::class.java)

        cardView = mBinding.
//        cardView = findViewById(R.id.item_card_text_question_card_expandable)
        arrow = findViewById(R.id.arrow_button)
        hiddenView = findViewById(R.id.hidden_view)

        arrow.setOnClickListener {
            // If the CardView is already expanded, set its visibility
            //  to gone and change the expand less icon to expand more.
            if (hiddenView.getVisibility() == View.VISIBLE) {

                // The transition of the hiddenView is carried out
                //  by the TransitionManager class.
                // Here we use an object of the AutoTransition
                // Class to create a default transition.
                TransitionManager.beginDelayedTransition(
                    cardView,
                    AutoTransition()
                )
                hiddenView.setVisibility(View.GONE)
                arrow.setImageResource(R.drawable.ic_baseline_expand_more_24)
            } else {
                TransitionManager.beginDelayedTransition(
                    cardView,
                    AutoTransition()
                )
                hiddenView.setVisibility(View.VISIBLE)
                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }
    }
}