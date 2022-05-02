package com.fox.interviewassistanceapp.presentations.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.fox.interviewassistanceapp.database.room.AppRoomDatabase
import com.fox.interviewassistanceapp.database.room.AppRoomRepository
import com.fox.interviewassistanceapp.utilits.REPOSITORY
import com.fox.interviewassistanceapp.utilits.TYPE_ROOM

class FragmentFrame1ViewModel(application: Application): AndroidViewModel(application) {
    private val mContext = application

    fun initDatabase(type:String,onSuccess:()->Unit) {
        when(type){
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
        }

    }
}
