package com.fox.interviewassistanceapp.presentations

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.fox.interviewassistanceapp.R


class MainActivity : AppCompatActivity() {

    lateinit var arrow: ImageButton
    lateinit var hiddenView: LinearLayout
    lateinit var cardView: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardView = findViewById(R.id.item_card_text_question_card_expandable)
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