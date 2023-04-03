package com.example.carcomposedemo.view.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextYear(
    carYear: String
) {
    Text(text = carYear, color = Color.DarkGray, fontSize = 24.sp)
}