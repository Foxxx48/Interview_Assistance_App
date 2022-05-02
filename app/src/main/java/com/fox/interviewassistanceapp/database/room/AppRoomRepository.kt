package com.fox.interviewassistanceapp.database.room

import androidx.lifecycle.LiveData
import com.fox.interviewassistanceapp.database.DatabaseRepository
import com.fox.interviewassistanceapp.models.Question

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {
    override val allQuestions: LiveData<List<Question>>
        get() = appRoomDao.getAllQuestions()

    override suspend fun insert(question: Question, onSuccess: () -> Unit) {
        appRoomDao.insert(question)
    }

    override suspend fun delete(question: Question, onSuccess: () -> Unit) {
        appRoomDao.delete(question)
    }
}