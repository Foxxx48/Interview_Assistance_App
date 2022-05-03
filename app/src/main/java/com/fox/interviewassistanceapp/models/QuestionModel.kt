package com.fox.interviewassistanceapp.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions_table")
data class QuestionModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo
    val question: String = "",
    @ColumnInfo
    val answer: String = ""
)
