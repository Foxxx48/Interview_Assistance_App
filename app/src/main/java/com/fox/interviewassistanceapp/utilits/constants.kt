package com.fox.interviewassistanceapp.utilits

import com.fox.interviewassistanceapp.database.DatabaseRepository
import com.fox.interviewassistanceapp.presentations.MainActivity

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY:DatabaseRepository
const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"