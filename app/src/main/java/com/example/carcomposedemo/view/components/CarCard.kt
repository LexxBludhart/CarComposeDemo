package com.example.carcomposedemo.view.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.carcomposedemo.model.entity.Car

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarCard(
    car: Car,
    deleteCar: () -> Unit,
    navigateTpUpdateScreen: (carId: Int) -> Unit
    ) {
    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(
                start = 8.dp,
                end = 8.dp,
                top = 8.dp,
                bottom = 4.dp
            )
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        onClick = { navigateTpUpdateScreen(car.id) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                TextMake(carMake = car.make)
                TextModel(carModel = car.model)
                TextYear(carYear = car.year)
                TextColor(carColor = car.color)

            }
            Spacer(modifier = Modifier.weight(1f))
            DeleteIcon(deleteCar)
        }
    }
}