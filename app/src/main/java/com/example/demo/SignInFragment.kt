package com.example.demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_sign_in.*

class SignInFragment : Fragment() {

    lateinit var viewModel: SignInViewModel
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("fragment", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("fragment", "onCreate")


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)


        Log.d("fragment", "onCreateView")


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("fragment", "onViewCreated")
        val userName: TextInputEditText
        userName = view.findViewById(R.id.UserName)
        val button: Button
        button = view.findViewById(R.id.btn)
        val dispTV :TextView
        dispTV = view.findViewById(R.id.displayTV)
        viewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        viewModel.str.observe(this, Observer {
            dispTV.text = it
        })

        button.setOnClickListener{
            viewModel.storeUsername(userName.text.toString())
            dispTV.visibility = View.VISIBLE
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("fragment", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("fragment", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("fragment", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("fragment", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("fragment", "onDetach")
    }


}