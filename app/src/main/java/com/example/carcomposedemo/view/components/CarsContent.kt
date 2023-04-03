package com.example.carcomposedemo.view.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.carcomposedemo.model.entity.Car
import com.example.carcomposedemo.model.repository.Cars

@Composable
fun CarsContent(
    padding: PaddingValues,
    cars: Cars,
    deleteCar: (car: Car) -> Unit,
    navigateToUpdateCarScreen: (carId: Int) -> Unit
) {
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(padding)) {
        items(items = cars) {
            CarCard(
                car = it,
                deleteCar = { deleteCar(it) }, 
                navigateTpUpdateScreen = navigateToUpdateCarScreen)
        }
    }
}