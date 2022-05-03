package com.fox.interviewassistanceapp.presentations.screens.add_question_card

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fox.interviewassistanceapp.models.QuestionModel
import com.fox.interviewassistanceapp.utilits.REPOSITORY
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddQuestionCardViewModel(application: Application) : AndroidViewModel(application) {
    fun insert(questionModel: QuestionModel, onSuccess: () -> Unit) =
        viewModelScope.launch (Dispatchers.Main) {
            REPOSITORY.insert(questionModel) {
                onSuccess()
            }
        }

}
