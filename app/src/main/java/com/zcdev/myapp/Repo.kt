package com.zcdev.myapp

import com.zcdev.myapp.Poko.User
import javax.inject.Inject

class Repo @Inject constructor(){

   // private val validateDatabase: DataBase = DataBase()


    fun getAll():MutableList<User>{
        return database()
    }

    fun database():MutableList<User>{
        return mutableListOf(
            User(1,"Mohamed"),
            User(2,"Zakaria"),
            User(3,"Youcef")
        )
    }

}