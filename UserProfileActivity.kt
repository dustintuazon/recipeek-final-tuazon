package com.labactivity.recipeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipeek.databinding.ActivityUserProfileBinding

class UserProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            this.finish()
        }

        binding.editProfileBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Edit your profile", Toast.LENGTH_SHORT).show()
        }

        binding.recipesBtn.setOnClickListener {
            val intent = Intent(this, MyRecipesActivity::class.java)
            startActivity(intent)
        }

        binding.favoritesBtn.setOnClickListener {
            val intent = Intent(this, MyFavoritesActivity::class.java)
            startActivity(intent)
        }

        binding.historyBtn.setOnClickListener {
            val intent = Intent(this, ViewedRecipesActivity::class.java)
            startActivity(intent)
        }

        binding.addRecipeBtn.setOnClickListener {
            val intent = Intent(this, AddRecipeActivity::class.java)
            startActivity(intent)
        }

        binding.aboutUsBtn.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }

        binding.rateUsBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Rate us 5 stars", Toast.LENGTH_SHORT).show()
        }

        binding.feedbackBtn.setOnClickListener {
            Toast.makeText(applicationContext, "Report Bugs", Toast.LENGTH_SHORT).show()
        }
    }
}