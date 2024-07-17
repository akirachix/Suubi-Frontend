package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivityOnsavingBinding

class onsaving : AppCompatActivity() {
    lateinit var binding: ActivityOnsavingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityOnsavingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.setupTitle.setOnClickListener{
            val intent = Intent(this, savingcheck::class.java)
            startActivity(intent)
        }
        binding.imgHome.setOnClickListener {
            val intent = Intent(this, loans_section_Activity::class.java)
            startActivity(intent)
        }
    }
}