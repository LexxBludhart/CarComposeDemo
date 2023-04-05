package com.example.carcomposedemo.utilities

import androidx.compose.ui.graphics.Color

object TextUtils {
    fun getColorForName(colorName: String) = when {
        colorName.lowercase().contains("red") -> Color.Red
        colorName.lowercase().contains("green") -> Color.Green
        colorName.lowercase().contains("blue") -> Color.Blue
        colorName.lowercase().contains("black") -> Color.Black
        colorName.lowercase().contains("cyan") -> Color.Cyan
        colorName.lowercase().contains("yellow") -> Color.Yellow
        colorName.lowercase().contains("magenta") -> Color.Magenta
        colorName.lowercase().contains("burgundy") -> Color.Magenta
        colorName.lowercase().contains("white") -> Color.White
        colorName.lowercase().contains("gray") -> Color.Gray
        colorName.lowercase().contains("silver") -> Color.Gray
        else -> Color.LightGray
    }
}