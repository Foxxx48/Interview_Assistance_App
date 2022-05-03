package com.fox.interviewassistanceapp.database

import androidx.lifecycle.LiveData
import com.fox.interviewassistanceapp.models.QuestionModel

interface DatabaseRepository {
    val allQuestions:LiveData<List<QuestionModel>>
    suspend fun insert(questionModel: QuestionModel, onSuccess:()-> Unit)
    suspend fun delete(questionModel: QuestionModel, onSuccess:()-> Unit)
}