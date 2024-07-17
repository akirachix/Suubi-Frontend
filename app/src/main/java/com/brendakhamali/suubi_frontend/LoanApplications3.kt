package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityLoanApplications3Binding

class LoanApplications3 : AppCompatActivity() {
    lateinit var binding: ActivityLoanApplications3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoanApplications3Binding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnnext3.setOnClickListener {
            validateRegistration()
        }


    }
    private fun validateRegistration() {
        var formErr = false
        clearErrors()

        val monthlyDeduction = binding.lastBtn.text.toString()
        if (monthlyDeduction.isBlank()) {
            formErr = true
            binding.lastBtn.error = "Monthly Deduction is required"
        }
        if (!formErr) {
//        // Proceed with registration or login
            val intent = Intent(this, LoanApplication4::class.java)
            startActivity(intent)
//    }
        }

    }

    fun clearErrors() {
        binding.lastBtn.error = null

    }  }
