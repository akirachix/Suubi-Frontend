package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityFirststatementsBinding


class firststatements : AppCompatActivity() {
    lateinit var binding: ActivityFirststatementsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirststatementsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStatement.setOnClickListener{
            val intent = Intent(this, activity_statements::class.java)
            startActivity(intent)
        }
        binding.btnReport.setOnClickListener{
            val intent = Intent(this, activity_statements::class.java)
            startActivity(intent)
        }
        binding.idHome.setOnClickListener {
           val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }

    }
}