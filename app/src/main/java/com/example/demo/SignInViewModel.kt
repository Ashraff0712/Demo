package com.example.demo

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInViewModel : ViewModel() {
    val str = MutableLiveData<String> ()
    fun storeUsername(User: String){
          str.value = User

    }

}