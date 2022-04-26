package com.zcdev.myapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zcdev.myapp.Poko.User
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class ViewModel @Inject constructor(private val repo: Repo) :
    ViewModel() {

    private val userMutableLiveData=MutableLiveData<List<User>>()
     val userLiveData:LiveData<List<User>> =userMutableLiveData


    init {
        userMutableLiveData.value=repo.getAll()
    }
}