package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val fragmentManager: FragmentManager = supportFragmentManager
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//
//        val signInFragment = SignInFragment()
//
//        fragmentTransaction.add(R.id.signIn,signInFragment)
//        fragmentTransaction.commit()
        Log.d("Message", "Main Activity onCreate")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "Main Activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "Main Activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "Main Activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "Main Activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "Main Activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "Main Activity onRestart")
    }


}