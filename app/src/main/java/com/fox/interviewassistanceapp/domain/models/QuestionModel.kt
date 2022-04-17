package com.fox.interviewassistanceapp.domain.models

data class QuestionModel (val id: Int, val question: String, val answer: String) {
    override fun toString(): String {
        return super.toString()
    }

}