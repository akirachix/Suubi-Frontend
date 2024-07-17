package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityStatementsBinding

class activity_statements : AppCompatActivity() {

    lateinit var binding: ActivityStatementsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatementsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener{
            validateRegistration()
        }

    }






private fun validateRegistration() {
    var formErr = false
    clearErrors()

    val year = binding.firstTil.text.toString()
    if (year.isBlank()) {
        formErr = true
        binding.firstTil.error = "Enter YY"
    }

    val month = binding.secondTIL.text.toString()
    if (month.isBlank()) {
        formErr = true
        binding.secondTIL.error = "Enter MM"
    }

    val day= binding.ThirdTIL.text.toString()
    if (day.isBlank()) {
        formErr = true
        binding.ThirdTIL.error = "Enter DD"
    }

    if (!formErr) {
        val intent = Intent(this, report_layout::class.java)
        startActivity(intent)
    }
}

private fun clearErrors() {
    binding.firstTil.error = null
    binding.secondTIL.error = null
    binding.ThirdTIL.error = null
}
}


