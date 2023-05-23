package com.labactivity.recipeek

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.core.view.get
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(){
    private lateinit var binding: ActivityHomeBinding
    private lateinit var recyclerViewCategory: RecyclerView
    private lateinit var recyclerViewPopular: RecyclerView
    private lateinit var recyclerViewNew: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        recyclerViewCategory = binding.categoryList
        recyclerViewCategory.layoutManager = GridLayoutManager(this, 2,LinearLayoutManager.HORIZONTAL, false)

        val categoryItems = listOf(
            CategoryItem("Breakfast"),
            CategoryItem("Dinner"),
            CategoryItem("Lunch"),
            CategoryItem("Main Dish"),
            CategoryItem("Side Dish"),
            CategoryItem("Dessert"),
            CategoryItem("Appetizer"),
            CategoryItem("Snack"),
            CategoryItem("Salad"),
        )
        recyclerViewCategory.adapter = CategoryAdapter(categoryItems)


        recyclerViewPopular = binding.popularList
        recyclerViewPopular.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)


        val items = listOf(
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By UncleRoger", R.drawable.star,"(30.6k)"),
            Item(R.drawable.img,"Creamy Macaroni and Cheese", "By Julia Moskin", R.drawable.star,"(14.2k)"),
            Item(R.drawable.lasagna,"Lasagna", "By JamieOliver", R.drawable.star,"(2k)"),
            Item(R.drawable.img_1,"Takeout-Style Sesame Noodles", "by Sam Sifton", R.drawable.star,"(9k)"),
            Item(R.drawable.img_2,"Roasted Salmon Glazed With Brown Sugar and Mustard", "By Sam Sifton", R.drawable.star,"(12.7k)"),
        )
        recyclerViewPopular.adapter = ItemAdapter(items)




        recyclerViewNew = binding.newRecipeItems
        recyclerViewNew.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)


        val itemsPopular = listOf(

            Item(R.drawable.img_3,"Omelet", "By Melissa Clark", R.drawable.star,"(479)"),
            Item(R.drawable.img_4,"Cacio e Pepe", "By Mark Bittman", R.drawable.star,"(709)"),
            Item(R.drawable.img_5,"Cast-Iron Steak", "By Julia Moskin", R.drawable.star,"(494)"),
        )
        recyclerViewNew.adapter = ItemAdapter(itemsPopular)


        binding.createBtn.setOnClickListener {
            val intent = Intent(this, AddRecipeActivity::class.java)
            startActivity(intent)
        }

        binding.profileBtn.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
        }

        binding.searchBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Search recipes", Toast.LENGTH_SHORT).show()
        }

        binding.breakfastBtn.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        binding.recipeCardView.setOnClickListener {
            val intent = Intent(this, RecipeDetailsActivity::class.java)
            startActivity(intent)
        }
    }
}