package com.example.carcomposedemo.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.carcomposedemo.view.components.UpdateCarContent
import com.example.carcomposedemo.view.components.UpdateCarTopBar
import com.example.carcomposedemo.viewmodel.CarsViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun UpdateCarScreen(
    viewModel: CarsViewModel = hiltViewModel(),
    carId: Int,
    navigateBack: () -> Unit
) {

    LaunchedEffect(Unit) {
        viewModel.getCar(carId)
    }

    Scaffold(
        topBar = { UpdateCarTopBar(navigateBack) },
        content = { padding ->
            UpdateCarContent(
                padding = padding,
                car = viewModel.currentCar,
                updateMake = { make -> viewModel.updateMake(make) },
                updateModel = { model -> viewModel.updateModel(model) },
                updateYear = { year -> viewModel.updateYear(year) },
                updateColor = { color -> viewModel.updateColor(color) },
                updateCar = { car -> viewModel.updateCar(car) },
                navigateBack = navigateBack
            )
        }
    )
}