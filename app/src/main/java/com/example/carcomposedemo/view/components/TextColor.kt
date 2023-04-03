package com.example.carcomposedemo.view.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextColor(
    carColor: String
) {
    Text(text = carColor, color = Color.DarkGray, fontSize = 24.sp)
}