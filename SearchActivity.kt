package com.labactivity.recipeek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.searchItems
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val recipeItems = listOf(
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By UncleRoger", R.drawable.star,"(1.2k)"),
            Item(R.drawable.img,"Creamy Macaroni and Cheese", "By Julia Moskin", R.drawable.star,"(14.2k)"),
            Item(R.drawable.img_3,"Omelet", "By Melissa Clark", R.drawable.star,"(479)"),
            Item(R.drawable.img_8,"Smoky Bacon Cheddar Breakfast Hash", "By The Modern Proper", R.drawable.star,"(3)"),
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By Google", R.drawable.star,"(3)"),
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By Jollibee", R.drawable.star,"(473)"),
        )

        recyclerView.adapter = ItemAdapter(recipeItems)

        binding.backBtn.setOnClickListener {
            this.finish()
        }

        binding.searchBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Search Recipes",Toast.LENGTH_SHORT).show()
        }

        binding.categoriesBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Choose Categories",Toast.LENGTH_SHORT).show()
        }

        binding.breakfastCategBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Search recipes with Breakfast Tags",Toast.LENGTH_SHORT).show()
        }

        binding.filterBtn.setOnClickListener {
            Toast.makeText(applicationContext,"Filter Recipes",Toast.LENGTH_SHORT).show()
        }
    }
}