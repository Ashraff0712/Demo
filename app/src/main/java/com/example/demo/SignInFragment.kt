package com.example.demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SignInFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("fragment","onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("fragment","onCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
        Log.d("fragment","onCreateView")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("fragment","onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("fragment","onDetach")
    }


}