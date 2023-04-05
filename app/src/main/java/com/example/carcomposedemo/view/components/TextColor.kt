package com.example.carcomposedemo.view.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.carcomposedemo.utilities.TextUtils

@Composable
fun TextColor(
    carColor: String
) {
    Text(text = carColor, color = TextUtils.getColorForName(colorName = carColor), fontSize = 24.sp)
}