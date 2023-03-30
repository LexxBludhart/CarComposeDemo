package com.example.carcomposedemo.view

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.example.carcomposedemo.viewmodel.CarsViewModel

@Composable
fun CarsScreen(
    viewModel: CarsViewModel = hiltViewModel(),
    navigateToUpdateCarScreen: (carId: Int) -> Unit
) {

}