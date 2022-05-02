package com.fox.interviewassistanceapp.database

import androidx.lifecycle.LiveData
import com.fox.interviewassistanceapp.domain.models.QuestionModel
import com.fox.interviewassistanceapp.models.Question

interface DatabaseRepository {
    val allQuestions:LiveData<List<Question>>
    suspend fun insert(question: Question, onSuccess:()-> Unit)
    suspend fun delete(question: Question, onSuccess:()-> Unit)
}