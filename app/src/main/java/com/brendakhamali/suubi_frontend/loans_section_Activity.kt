package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivityLoansSectionBinding

class loans_section_Activity : AppCompatActivity() {
    lateinit var binding: ActivityLoansSectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoansSectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loan.setOnClickListener {
            val intent = Intent(this, loan_checkActivity::class.java)
            startActivity(intent)
        }
           binding.states.setOnClickListener {
                val intent = Intent(this, firststatements::class.java)
               startActivity(intent)

           }
        binding.saving.setOnClickListener {
            val intent = Intent(this, savingpageAvtivity::class.java)
            startActivity(intent)

        }
        }
    }
