package com.example.carcomposedemo.view.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextModel(
    carModel: String
) {
    Text(text = carModel, color = Color.LightGray, fontSize = 24.sp)
}