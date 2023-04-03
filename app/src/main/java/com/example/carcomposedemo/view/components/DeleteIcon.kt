package com.example.carcomposedemo.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import com.example.carcomposedemo.constants.Constants.DELETE_CAR

@Composable
fun DeleteIcon(deleteCar: () -> Unit) {
    IconButton(onClick = deleteCar) {
        Icon(imageVector = Icons.Default.Delete, contentDescription = DELETE_CAR)
    }
}