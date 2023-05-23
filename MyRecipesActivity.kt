package com.labactivity.recipeek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ActivityMyRecipesBinding

class MyRecipesActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMyRecipesBinding
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.myRecipesItems
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val recipeItems = listOf(
            Item(R.drawable.img_7,"Chicken Adobo", "By Me", R.drawable.zero_star,"(0)"),
            Item(R.drawable.img_9,"Beef Nilaga", "By Me", R.drawable.zero_star,"(0)"),
            Item(R.drawable.img_10,"Menudo with Raisins", "By Me", R.drawable.zero_star,"(0)"),
            )

        recyclerView.adapter = ItemAdapter(recipeItems)

        binding.backBtn.setOnClickListener {
            this.finish()
        }
    }
}