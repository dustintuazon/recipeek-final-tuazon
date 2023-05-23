package com.labactivity.recipeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipeek.databinding.ActivityLoginBinding
import com.labactivity.recipeek.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var username = "user"
        var password = "1234"

        var showPassword = false

        binding.loginBtn.setOnClickListener {
            var usernameInput:String = binding.usernameEditTxt.text.toString()
            var passwordInput:String = binding.passwordEditTxt.text.toString()

            if(showPassword){
                Toast.makeText(applicationContext,"Username is: user and password is: 1234", Toast.LENGTH_LONG).show()
                showPassword = false
            }

            if(usernameInput == "" || passwordInput == ""){
                Toast.makeText(applicationContext,"Please Enter username or password.", Toast.LENGTH_LONG).show()
            }
            else if(usernameInput == username && passwordInput == password){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                this.finish()
            }
            else{
                Toast.makeText(applicationContext,"Wrong username or password", Toast.LENGTH_SHORT).show()
            }
        }

        binding.forgotpasswordBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Forgot password prompt", Toast.LENGTH_SHORT).show()

            if(!showPassword){
                Toast.makeText(applicationContext,"Click login", Toast.LENGTH_SHORT).show()
                showPassword = true
            }
        }

        binding.registerBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Register account prompt", Toast.LENGTH_SHORT).show()
        }
    }
}