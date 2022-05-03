package com.fox.interviewassistanceapp.utilits

import android.os.Message
import android.widget.Toast

fun showToast(message: String) {
    Toast.makeText(APP_ACTIVITY,message,Toast.LENGTH_SHORT).show()
}