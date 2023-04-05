package com.example.carcomposedemo.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.carcomposedemo.R

@Composable
fun DeleteIcon(deleteCar: () -> Unit) {
    IconButton(onClick = deleteCar) {
        Icon(imageVector = Icons.Default.Delete, contentDescription = stringResource(id = R.string.action_delete_car))
    }
}