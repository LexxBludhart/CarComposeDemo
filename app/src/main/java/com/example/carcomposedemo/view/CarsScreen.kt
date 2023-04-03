package com.example.carcomposedemo.view

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.carcomposedemo.view.components.AddCarFloatingActionButton
import com.example.carcomposedemo.view.components.AddCardAlertDialog
import com.example.carcomposedemo.view.components.CarsContent
import com.example.carcomposedemo.view.components.CarsTopBar
import com.example.carcomposedemo.viewmodel.CarsViewModel

@Composable
fun CarsScreen(
    viewModel: CarsViewModel = hiltViewModel(),
    navigateToUpdateCarScreen: (carId: Int) -> Unit
) {
    val cars by viewModel.cars.collectAsState(initial = emptyList())

    Scaffold(
        topBar = { CarsTopBar() },
        floatingActionButton = { AddCarFloatingActionButton(openDialog = { viewModel.openDialog() }) },
        content = { CarsContent(
            padding = it,
            cars = cars,
            deleteCar = { car -> viewModel.deleteCar(car) },
            navigateToUpdateCarScreen = navigateToUpdateCarScreen
        )
            AddCardAlertDialog(
                isDialogOpen = viewModel.isDialogOpen,
                closeDialog = { viewModel.closeDialog() },
                addCar = { car -> viewModel.addCar(car) }
            )
        }
    )
}