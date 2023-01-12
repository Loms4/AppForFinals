package com.example.appforfinals

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class Register : Fragment() {
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var loginTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.registration, container, false)

        emailEditText = view.findViewById(R.id.et_email)
        passwordEditText = view.findViewById(R.id.et_password)
        confirmPasswordEditText = view.findViewById(R.id.et_confirm_password)
        registerButton = view.findViewById(R.id.btn_register)
        loginTextView = view.findViewById(R.id.tv_login)

        registerButton.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val confirmPassword = confirmPasswordEditText.text.toString()
            if (isValidEmail(email) && isValidPassword(password, confirmPassword)) {
                // Use Firebase Authentication or any other authentication library to create a new user
                // using the email and password
                // Handle errors if any
            } else {
                // Show an error message
            }
        }

        loginTextView.setOnClickListener {
            // Use the Navigation component or an Intent to navigate to the authorization fragment
        }

        return view
    }

    private fun isValidEmail(email: String): Boolean {
        // Validate email
        return true
    }

    private fun isValidPassword(password: String, confirmPassword: String): Boolean {
       //validate password
        return true

    }
}

