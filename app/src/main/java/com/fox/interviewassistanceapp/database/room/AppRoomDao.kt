package com.fox.interviewassistanceapp.database.room

import androidx.lifecycle.LiveData
import androidx.room.*
import com.fox.interviewassistanceapp.models.Question

@Dao
interface AppRoomDao {

    @Query("SELECT * FROM questions_table")
    fun getAllQuestions(): LiveData<List<Question>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(question: Question)

    @Delete
    suspend fun delete(question: Question)

}