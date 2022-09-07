package com.technopixl.and6.exo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.technopixl.and6.exo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.facebookButton.setOnClickListener{
            val intent = Intent(this,FacebookActivity::class.java)
            startActivity(intent)
        }
        binding.twitterButton.setOnClickListener{
            val intent = Intent(this,TwitterActivity::class.java)
            startActivity(intent)
        }
        binding.bloggiesButton.setOnClickListener{
            val intent = Intent(this,BloggiesActivity::class.java)
            startActivity(intent)
        }
    }
}