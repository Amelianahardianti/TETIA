package com.example.amelteti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.content.Intent
import com.example.amelteti.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.butLogin.setOnClickListener{
            startActivity(Intent(this,HomeActivity::class.java))
        }
        binding.tvHaventAccount.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

    }
}