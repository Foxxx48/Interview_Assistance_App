package com.fox.interviewassistanceapp.presentations.screens.frame3_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fox.interviewassistanceapp.R
import com.fox.interviewassistanceapp.models.QuestionModel
import kotlinx.android.synthetic.main.question_card_expandable.view.*

class Frame_3_2_Adapter : RecyclerView.Adapter<Frame_3_2_Adapter.Frame_3_2_Holder>() {

    private var mListQuestions = emptyList<QuestionModel>()

    class Frame_3_2_Holder(view: View) : RecyclerView.ViewHolder(view) {
        val nameQuestion: TextView = view.item_card_text_question_card_expandable
        val textAnswer: TextView = view.item_card_text_answer_card_expandable

        val arrow : ImageButton = view.arrow_button

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Frame_3_2_Holder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.question_card_expandable, parent, false
        )
        return Frame_3_2_Holder(view)
    }

    override fun onBindViewHolder(holder: Frame_3_2_Holder, position: Int) {
        holder.nameQuestion.text = mListQuestions[position].question
        holder.textAnswer.text = mListQuestions[position].answer

        holder.arrow.
    }

    override fun getItemCount(): Int = mListQuestions.size

    fun setList(list: List<QuestionModel>) {
        mListQuestions = list
        notifyDataSetChanged()
    }
}