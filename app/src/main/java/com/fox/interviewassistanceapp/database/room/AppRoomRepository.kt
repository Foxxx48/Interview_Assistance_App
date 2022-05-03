package com.fox.interviewassistanceapp.database.room

import androidx.lifecycle.LiveData
import com.fox.interviewassistanceapp.database.DatabaseRepository
import com.fox.interviewassistanceapp.models.QuestionModel

class AppRoomRepository(private val appRoomDao: AppRoomDao):DatabaseRepository {
    override val allQuestions: LiveData<List<QuestionModel>>
        get() = appRoomDao.getAllQuestions()

    override suspend fun insert(questionModel: QuestionModel, onSuccess: () -> Unit) {
        appRoomDao.insert(questionModel)
        onSuccess()
    }
    override suspend fun delete(questionModel: QuestionModel, onSuccess: () -> Unit) {
        appRoomDao.delete(questionModel)
        onSuccess()
    }
}