package com.labactivity.recipeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.labactivity.recipeek.databinding.ActivityAddRecipeBinding

class AddRecipeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAddRecipeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            this.finish()
        }

        binding.addImgBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Add recipe image",Toast.LENGTH_SHORT).show()
        }

        var breakfastBtnColored = false
        binding.breakfastCategoryBtn.setOnClickListener {
            if(!breakfastBtnColored){
            Toast.makeText(applicationContext,"Selected Breakfast category",Toast.LENGTH_SHORT).show()
            binding.breakfastCategoryBtn.backgroundTintList = getColorStateList(R.color.light_red)
            breakfastBtnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Unselected Breakfast category",Toast.LENGTH_SHORT).show()
                binding.breakfastCategoryBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                breakfastBtnColored = false
            }
        }

        var lunchBtnColored = false
        binding.lunchCategoryBtn.setOnClickListener {
            if(!lunchBtnColored){
                Toast.makeText(applicationContext,"Selected Lunch category",Toast.LENGTH_SHORT).show()
                binding.lunchCategoryBtn.backgroundTintList = getColorStateList(R.color.light_red)
                lunchBtnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Unselected Lunch category",Toast.LENGTH_SHORT).show()
                binding.lunchCategoryBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                lunchBtnColored = false
            }
        }

        var dinnerBtnColored = false
        binding.dinnerCategoryBtn.setOnClickListener {
            if(!dinnerBtnColored){
                Toast.makeText(applicationContext,"Selected Dinner category",Toast.LENGTH_SHORT).show()
                binding.dinnerCategoryBtn.backgroundTintList = getColorStateList(R.color.light_red)
                dinnerBtnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Unselected Dinner category",Toast.LENGTH_SHORT).show()
                binding.dinnerCategoryBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                dinnerBtnColored = false
            }
        }

        var maindishBtnColored = false
        binding.mainDishCategoryBtn.setOnClickListener {
            if(!maindishBtnColored){
                Toast.makeText(applicationContext,"Selected Main Dish category",Toast.LENGTH_SHORT).show()
                binding.mainDishCategoryBtn.backgroundTintList = getColorStateList(R.color.light_red)
                maindishBtnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Unselected Main Dish category",Toast.LENGTH_SHORT).show()
                binding.mainDishCategoryBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                maindishBtnColored = false
            }
        }

        var sidedishBtnColored = false
        binding.sideDishCategoryBtn.setOnClickListener {
            if(!sidedishBtnColored){
                Toast.makeText(applicationContext,"Selected Side Dish category",Toast.LENGTH_SHORT).show()
                binding.sideDishCategoryBtn.backgroundTintList = getColorStateList(R.color.light_red)
                sidedishBtnColored = true
            }
            else{
                Toast.makeText(applicationContext,"Unselected Side Dish category",Toast.LENGTH_SHORT).show()
                binding.sideDishCategoryBtn.backgroundTintList = getColorStateList(R.color.light_gray)
                sidedishBtnColored = false
            }
        }

        binding.addIngredientBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Add Ingredients",Toast.LENGTH_SHORT).show()
        }

        binding.addDirectionsBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Add Directions",Toast.LENGTH_SHORT).show()
        }

        binding.saveRecipeBtn.setOnClickListener {
            var recipeName: String = binding.recipeNameEditTxt.text.toString()

            Toast.makeText(applicationContext,"Saved $recipeName recipe",Toast.LENGTH_SHORT).show()
        }
    }
}