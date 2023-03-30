package com.example.carcomposedemo.view

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.carcomposedemo.viewmodel.CarsViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun UpdateCarScreen(
    viewModel: CarsViewModel = hiltViewModel(),
    carId: Int,
    navigateBack: () -> Unit
) {

}