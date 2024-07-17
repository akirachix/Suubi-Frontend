package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityLoanCheckBinding


class loan_checkActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoanCheckBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoanCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applyloan.setOnClickListener{
            val intent = Intent(this,first_loan_application::class.java)
            startActivity(intent)
        }
    }
}