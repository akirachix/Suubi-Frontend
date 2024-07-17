package com.brendakhamali.suubi_frontend

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivitySavingcheckBinding

class savingcheck : AppCompatActivity() {
    lateinit var binding: ActivitySavingcheckBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding=ActivitySavingcheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.check.setOnClickListener{
            val intent = Intent(this, onsaving::class.java)
            startActivity(intent)
        }
    }
}