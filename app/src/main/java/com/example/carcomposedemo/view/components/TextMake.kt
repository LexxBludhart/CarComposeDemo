package com.example.carcomposedemo.view.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextMake(
    carMake: String
) {
    Text(text = carMake, color = Color.Red, fontSize = 36.sp)
}