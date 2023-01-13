package com.example.appforfinals.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.appforfinals.R

class LoginFragment : Fragment(R.layout.fragment_login_layout) {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_login_layout, container, false)


        emailEditText = view.findViewById(R.id.et_email)
        passwordEditText = view.findViewById(R.id.et_password)
        loginButton = view.findViewById(R.id.btn_login)
        registerTextView = view.findViewById(R.id.tv_register)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            // Use Firebase Authentication or any other authentication library to sign in the user
            // using the email and password
            // Handle errors if any
        }

        registerTextView.setOnClickListener {
            // Use the Navigation component or an Intent to navigate to the registration fragment
        }
    return view}
}
