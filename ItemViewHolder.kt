package com.labactivity.recipeek

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.recipeek.databinding.ItemLayoutBinding

class ItemViewHolder(private val binding:ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: Item) {
        binding.recipeImgView.setImageDrawable(binding.recipeImgView.context.getDrawable(item.recipePicture))
        binding.recipeNameTxtView.text = item.recipeName
        binding.creatorTxtView.text = item.creator
        binding.ratingImgView.setImageDrawable(binding.ratingImgView.context.getDrawable(item.rating))
        binding.ratingTxtView.text = item.ratingNumber
    }
}