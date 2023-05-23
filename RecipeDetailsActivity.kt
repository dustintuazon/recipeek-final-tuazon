package com.labactivity.recipeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipeek.databinding.ActivityRecipeDetailsBinding

class RecipeDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipeDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recipeDetailsImg.setImageDrawable(binding.recipeDetailsImg.context.getDrawable(R.drawable.egg_fried_rice))
        binding.recipeNameDetails.text = getText(R.string.recipe_name)
        binding.recipeDetailsDetails.text = (getText(R.string.minute_recipe))
        binding.recipeDetailsDetails.append(" "+getText(R.string.two_serving))
        binding.categoryDetailsBtn.text = getText(R.string.breakfast_category)
        binding.ingredientsDetailsTxt.text = getText(R.string.ingredients_fried_rice)
        binding.directionsDirectionsTxt.text = getText(R.string.directions_fried_rice)




        binding.backBtn.setOnClickListener {
            this.finish()
        }

        binding.categoryDetailsBtn.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        binding.searchBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Search recipes", Toast.LENGTH_SHORT).show()
        }

        var btnColored = false
        binding.recipeHeartDetailsBtn.setOnClickListener {
            if(!btnColored){
                Toast.makeText(applicationContext,"Added to Favorites",Toast.LENGTH_SHORT).show()
                binding.recipeHeartDetailsBtn.backgroundTintList = getColorStateList(R.color.light_red)
                btnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Removed from Favorites",Toast.LENGTH_SHORT).show()
                binding.recipeHeartDetailsBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                btnColored = false
            }
        }

    }
}