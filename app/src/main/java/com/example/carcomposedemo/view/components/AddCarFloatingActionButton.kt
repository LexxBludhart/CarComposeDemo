package com.example.carcomposedemo.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.carcomposedemo.R

@Composable
fun AddCarFloatingActionButton(openDialog: () -> Unit) {
    FloatingActionButton(
        onClick = openDialog,
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(imageVector = Icons.Default.Add, contentDescription = stringResource(id = R.string.action_add_car))
    }
}