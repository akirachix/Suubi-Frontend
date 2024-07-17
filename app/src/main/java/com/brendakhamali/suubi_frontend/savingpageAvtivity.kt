package com.brendakhamali.suubi_frontend

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.brendakhamali.suubi_frontend.databinding.ActivitySavingpageAvtivityBinding

//import com.akirachix.suubi_solution.databinding.ActivityStatementsBinding

class savingpageAvtivity : AppCompatActivity() {
    lateinit var binding: ActivitySavingpageAvtivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivitySavingpageAvtivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.setupSavingsButton.setOnClickListener{
            val intent = Intent(this, savingcheck::class.java)
            startActivity(intent)
        }
    }
}



//