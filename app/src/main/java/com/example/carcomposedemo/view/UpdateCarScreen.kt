package com.example.carcomposedemo.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.carcomposedemo.view.components.UpdateCarContent
import com.example.carcomposedemo.view.components.UpdateCarTopBar
import com.example.carcomposedemo.viewmodel.CarsViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dagger.hilt.android.lifecycle.HiltViewModel

@Destination
@Composable
fun UpdateCarScreen(
    navigator: DestinationsNavigator,
    viewModel: CarsViewModel = hiltViewModel(),
    carId: Int,
) {

    LaunchedEffect(Unit) {
        viewModel.getCar(carId)
    }

    Scaffold(
        topBar = { UpdateCarTopBar(navigator = navigator) },
        content = { padding ->
            UpdateCarContent(
                padding = padding,
                car = viewModel.currentCar,
                updateMake = { make -> viewModel.updateMake(make) },
                updateModel = { model -> viewModel.updateModel(model) },
                updateYear = { year -> viewModel.updateYear(year) },
                updateColor = { color -> viewModel.updateColor(color) },
                updateCar = { car -> viewModel.updateCar(car) },
                navigator = navigator
            )
        }
    )
}