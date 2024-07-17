package com.brendakhamali.suubi_frontend

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.brendakhamali.suubi_frontend.databinding.ActivityLoginBinding

class loginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUpTextView.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }

        binding.checkLogin.setOnClickListener {
            validateRegistration()
        }

    }

    private fun validateRegistration() {
        var formErr = false
        clearErrors()

        val monthlyDeduction = binding.sacco.text.toString()
        if (monthlyDeduction.isBlank()) {
            formErr = true
            binding.sacco.error = "Monthly Deduction is required"
        }

        val password = binding.etconPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.etconPassword.error = "Password is required"
        }

        if (!formErr) {
            // Proceed with registration or login
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }
    }

    private fun clearErrors() {
        binding.sacco.error = null
        binding.etconPassword.error = null
    }
}


