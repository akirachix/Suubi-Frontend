package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//import com.akirachix.suubi_solution.databinding.ActivityLoanApplicattion2Binding
import com.brendakhamali.suubi_frontend.databinding.ActivityLoanApplication4Binding

class LoanApplication4 : AppCompatActivity() {
    lateinit var binding: ActivityLoanApplication4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityLoanApplication4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnImg.setOnClickListener{
            var intent=Intent(this,loans_section_Activity::class.java)
            startActivity(intent)
        }


    }
}