package com.example.carcomposedemo.view.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.example.carcomposedemo.constants.Constants.CARS_SCREEN

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarsTopBar() {
    TopAppBar(title = { Text(text = CARS_SCREEN) })
}