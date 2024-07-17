package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivityLoanApplicattion2Binding

class LoanApplicattion2 : AppCompatActivity() {
    lateinit var binding: ActivityLoanApplicattion2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoanApplicattion2Binding.inflate(layoutInflater)
        setContentView(binding.root)


         binding.btnnext2.setOnClickListener{
//             var intent=Intent(this,LoanApplications3::class.java)
//             startActivity(intent)
             validateRegistration()
         }
//        binding.viewcheck.setOnClickListener{
////            validateRegistration()
//        }

}




private fun validateRegistration() {
    var formErr = false
    clearErrors()

    val monthlyDeduction = binding.onsecondfirstface.text.toString()
    if (monthlyDeduction.isBlank()) {
        formErr = true
        binding.onsecondfirstface.error = "Monthly Deduction is required"
    }

    val password1 = binding.onsecondsecondface.text.toString()
    if (password1.isBlank()) {
        formErr = true
        binding.onsecondsecondface.error = "Password is required"
    }

    val password = binding.onsecondthirdface.text.toString()
    if (password.isBlank()) {
        formErr = true
        binding.onsecondthirdface.error = "Password is required"
    }

    if (!formErr) {
        // Proceed with registration or login
        val intent = Intent(this, LoanApplications3::class.java)
        startActivity(intent)
    }
}

private fun clearErrors() {
    binding.onsecondfirstface.error = null
    binding.onsecondsecondface.error = null
    binding.onsecondthirdface.error = null
}
}


