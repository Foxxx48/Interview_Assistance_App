package com.fox.interviewassistanceapp.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fox.interviewassistanceapp.models.QuestionModel

@Dao
interface AppRoomDao {

    @Query("SELECT * FROM questions_table")
    fun getAllQuestions(): LiveData<List<QuestionModel>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(questionModel: QuestionModel)

    @Delete
    suspend fun delete(questionModel: QuestionModel)

}