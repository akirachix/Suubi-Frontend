package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.brendakhamali.suubi_frontend.databinding.ActivityLoansBinding

class loansActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoansBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoansBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginon.setOnClickListener {
            val intent = Intent(this, loginActivity::class.java)
            startActivity(intent)
        }
        binding.signcheck.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
