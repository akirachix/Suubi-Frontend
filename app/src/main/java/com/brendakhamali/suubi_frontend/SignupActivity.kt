package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textlogin.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)

        }
//        binding.button2.setOnClickListener {
//            validateRegistration()
        binding.signup.setOnClickListener {
            validateRegistration()
        }
    }

    fun validateRegistration() {
        var formErr = false
        clearErrors()

        val email = binding.emailEditText.text.toString()
        if (email.isBlank()) {
            formErr = true
            binding.emailEditText.error = "First name is required"
        }

        val sacco2= binding.sacco2.text.toString()
        if (sacco2.isBlank()) {
            formErr = true
            binding.sacco2.error = "Last name is required"
        }

        val sacco1= binding.sacco1.text.toString()
        if (sacco1.isBlank()) {
            formErr = true
            binding.sacco1.error = "Email is required"
        } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            formErr = true
            binding.sacco1.error = "Invalid email format"
        }

        val sacco = binding.sacco.text.toString()
        if (sacco.isBlank()) {
            formErr = true
            binding.sacco.error = "ID is required"
        }

        val password = binding.etconPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.etconPassword.error = "Password is required"
        } else if (password.length < 8) {
            formErr = true
            binding.etconPassword.error = "Password must be at least 8 characters long"
        }

        val confirmPassword = binding.etcoPassword.text.toString()
        if (confirmPassword.isBlank()) {
            formErr = true
            binding.etcoPassword.error = "Confirm password is required"
        } else if (password != confirmPassword) {
            formErr = true
            binding.etcoPassword.error = "Passwords do not match"
        }

        if (!formErr) {
            // proceed to registration
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }

    }


    fun clearErrors(){
        binding.emailEditText.error=null
        binding.sacco2.error=null
        binding.sacco1.error=null
        binding.sacco.error=null
        binding.etcoPassword.error=null
        binding.etconPassword.error=null
    }
}