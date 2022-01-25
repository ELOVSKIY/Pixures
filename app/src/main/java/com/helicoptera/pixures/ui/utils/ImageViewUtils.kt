package com.helicoptera.pixures.ui.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.CircleCropTransformation
import com.helicoptera.pixures.R

@BindingAdapter("url")
fun ImageView.setImage(url: String){
    this.load(url) {
        placeholder(R.drawable.outline_folder_24)
        transformations(CircleCropTransformation())
    }
}