package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityFirstLoanApplicationBinding


class first_loan_application : AppCompatActivity() {
    private lateinit var binding:ActivityFirstLoanApplicationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstLoanApplicationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnnext.setOnClickListener {
            validateRegistration()
        }
    }

    private fun validateRegistration() {
        var formErr = false
        clearErrors()

        val monthlyDeduction = binding.enterjob.text.toString()
        if (monthlyDeduction.isBlank()) {
            formErr = true
            binding.enterjob.error = "Enter monthly deduction"
        }

        val fullName = binding.fullname.text.toString()
        if (fullName.isBlank()) {
            formErr = true
            binding.fullname.error = "Enter full name"
        }

        val placeOfResidence = binding.placeresidence.text.toString()
        if (placeOfResidence.isBlank()) {
            formErr = true
            binding.placeresidence.error = "Enter place of residence"
        }

        if (!formErr) {
            val intent = Intent(this, LoanApplicattion2::class.java)
            startActivity(intent)
        }
    }

    private fun clearErrors() {
        binding.enterjob.error = null
        binding.fullname.error = null
        binding.placeresidence.error = null
    }
}