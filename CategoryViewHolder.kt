package com.labactivity.recipeek

import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.CategoryLayoutBinding

class CategoryViewHolder(private val binding:CategoryLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(categoryItem: CategoryItem){
        binding.categoryBtn.text = categoryItem.category
    }
}