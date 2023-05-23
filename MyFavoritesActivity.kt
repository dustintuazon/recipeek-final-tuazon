package com.labactivity.recipeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ActivityMyFavoritesBinding
import com.labactivity.recipeek.databinding.FavoriteRecipeLayoutBinding

class MyFavoritesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMyFavoritesBinding
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.favoritesList
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val items = listOf(
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By UncleRoger", R.drawable.star,"(1.1k)"),
            Item(R.drawable.img_5,"Cast-Iron Steak", "By Julia Moskin", R.drawable.star,"(494)"),
            Item(R.drawable.lasagna,"Lasagna", "By JamieOliver", R.drawable.star,"(20)"),
            Item(R.drawable.img,"Creamy Macaroni and Cheese", "By Julia Moskin", R.drawable.star,"(14.2k)"),
        )

        recyclerView.adapter = FavoriteRecipeAdapter(items)

        binding.backBtn.setOnClickListener {
            this.finish()
        }
    }
}