package com.example.appforfinals.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.appforfinals.R

class PassResetFragment: Fragment(R.layout.fragment_passreset){
    private lateinit var emailEditText: EditText
    private lateinit var resetPasswordButton: Button

    override fun c

        emailEditText = view.findViewById(R.id.et_email)
        resetPasswordButton = view.findViewById(R.id.btn_reset_password)

        resetPasswordButton.setOnClickListener {
            val email = emailEditText.text.toString()
            if (isValidEmail(email)) {
                // Use Firebase Authentication to send password reset email
                // Handle errors if any
            } else {
                // Show an error message
            }
        }

        return view
    }

    private fun isValidEmail(email: String): Boolean {
        // Validate email
        return true
    }
}
