package com.example.yariapp.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.yariapp.R
import com.example.yariapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       binding.apply {
           btnLogin.setOnClickListener {
               val intent =Intent(this@MainActivity, LoginActivity::class.java)
               startActivity(intent)
               finish()
           }
           btnRegister.setOnClickListener {
               val intent = Intent(this@MainActivity, RegisterActivity::class.java)
               startActivity(intent)
               finish()
           }
       }



        /* //
       Check if the user is logged in
        val sharedPreferences = getSharedPreferences("USER_CREDENTIALS", MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("ISLOGGEDIN", false)
        if (!isLoggedIn) {
            navigateToSignUp()
        }*/
    }


    private fun navigateToSignUp() {

    }
}