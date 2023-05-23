package com.labactivity.recipeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ActivityViewedRecipesBinding

class ViewedRecipesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityViewedRecipesBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewedRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.viewedList
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)


        val items = listOf(
            Item(R.drawable.egg_fried_rice,"Egg Fried Rice", "By UncleRoger", R.drawable.star,"(30.6k)"),
            Item(R.drawable.img,"Creamy Macaroni and Cheese", "By Julia Moskin", R.drawable.star,"(14.2k)"),
            Item(R.drawable.lasagna,"Lasagna", "By JamieOliver", R.drawable.star,"(2k)"),
            Item(R.drawable.img_1,"Takeout-Style Sesame Noodles", "by Sam Sifton", R.drawable.star,"(9k)"),
            Item(R.drawable.img_2,"Roasted Salmon Glazed With Brown Sugar and Mustard", "By Sam Sifton", R.drawable.star,"(12.7k)"),
            Item(R.drawable.img_3,"Omelet", "By Melissa Clark", R.drawable.star,"(479)"),
            Item(R.drawable.img_4,"Cacio e Pepe", "By Mark Bittman", R.drawable.star,"(709)"),
            Item(R.drawable.img_5,"Cast-Iron Steak", "By Julia Moskin", R.drawable.star,"(494)"),
        )

        recyclerView.adapter = ItemAdapter(items)

        binding.backBtn.setOnClickListener {
            this.finish()
        }
    }
}