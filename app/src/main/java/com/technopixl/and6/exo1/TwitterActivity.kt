package com.technopixl.and6.exo1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.AttributeSet
import android.util.Patterns
import android.view.View
import com.technopixl.and6.exo1.databinding.ActivityTwitterBinding

class TwitterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTwitterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTwitterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.twitterLoginButton.setOnClickListener{
         if( isValidEmail(binding.twitterEditTextEmailAddress.text)==true){

         }
            else{

         }
        }
    }
    fun isValidEmail(target: CharSequence): Boolean {
        return if (TextUtils.isEmpty(target)) {
            false
        } else {
            Patterns.EMAIL_ADDRESS.matcher(target).matches()
        }
    }


}