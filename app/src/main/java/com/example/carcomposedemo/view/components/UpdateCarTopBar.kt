package com.example.carcomposedemo.view.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.carcomposedemo.constants.Constants.UPDATE_CAR_SCREEN
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpdateCarTopBar(
    navigator: DestinationsNavigator
) {
    TopAppBar(
        title = { Text(text = UPDATE_CAR_SCREEN) },
        navigationIcon = {
            IconButton( onClick = { navigator.popBackStack() })
            {
                 Icon(
                     imageVector = Icons.Outlined.ArrowBack,
                     contentDescription = null // TODO: Get a real one here...
                 )
            }
        }
    )
}