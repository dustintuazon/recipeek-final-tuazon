package com.labactivity.recipeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipeek.databinding.ActivityAboutUsBinding

class AboutUsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            this.finish()
        }

        binding.fbBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Redirect to FaceBook", Toast.LENGTH_SHORT).show()
        }

        binding.igBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Redirect to Instagram", Toast.LENGTH_SHORT).show()
        }

        binding.twtrBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Redirect to Twitter", Toast.LENGTH_SHORT).show()
        }
    }
}