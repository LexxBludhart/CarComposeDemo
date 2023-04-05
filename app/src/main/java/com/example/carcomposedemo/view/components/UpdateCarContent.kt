package com.example.carcomposedemo.view.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.carcomposedemo.model.entity.Car
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.example.carcomposedemo.R

@Composable
fun UpdateCarContent(
    padding: PaddingValues,
    car: Car,
    updateMake: (make: String) -> Unit,
    updateModel: (model: String) -> Unit,
    updateYear: (year: String) -> Unit,
    updateColor: (color: String) -> Unit,
    updateCar: (car: Car) -> Unit,
    navigator: DestinationsNavigator
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        TextField(
            value = car.make,
            onValueChange = { make ->
                updateMake(make)
            },
            placeholder = { Text(text = stringResource(id = R.string.placeholder_car_make)) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.model,
            onValueChange = { model ->
                updateModel(model)
            },
            placeholder = { Text(text = stringResource(id = R.string.placeholder_car_model)) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.year,
            onValueChange = { year ->
                updateYear(year)
            },
            placeholder = { Text(text = stringResource(id = R.string.placeholder_car_year)) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.color,
            onValueChange = { color ->
                updateColor(color)
            },
            placeholder = { Text(text = stringResource(id = R.string.placeholder_car_color)) }
        )
        
        Button(
            onClick = { updateCar(car) 
            navigator.popBackStack()
            }) 
        {
            Text(text = stringResource(id = R.string.button_update))   
        }
    }
}