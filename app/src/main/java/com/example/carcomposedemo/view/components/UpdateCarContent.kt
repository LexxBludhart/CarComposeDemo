package com.example.carcomposedemo.view.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.example.carcomposedemo.constants.Constants.CAR_COLOR
import com.example.carcomposedemo.constants.Constants.CAR_MAKE
import com.example.carcomposedemo.constants.Constants.CAR_MODEL
import com.example.carcomposedemo.constants.Constants.CAR_YEAR
import com.example.carcomposedemo.constants.Constants.UPDATE
import com.example.carcomposedemo.model.entity.Car

@Composable
fun UpdateCarContent(
    padding: PaddingValues,
    car: Car,
    updateMake: (make: String) -> Unit,
    updateModel: (model: String) -> Unit,
    updateYear: (year: String) -> Unit,
    updateColor: (color: String) -> Unit,
    updateCar: (car: Car) -> Unit,
    navigateBack: () -> Unit
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
            placeholder = { Text(text = CAR_MAKE) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.model,
            onValueChange = { model ->
                updateModel(model)
            },
            placeholder = { Text(text = CAR_MODEL) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.year,
            onValueChange = { year ->
                updateYear(year)
            },
            placeholder = { Text(text = CAR_YEAR) }
        )
        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = car.color,
            onValueChange = { color ->
                updateColor(color)
            },
            placeholder = { Text(text = CAR_COLOR) }
        )
        
        Button(
            onClick = { updateCar(car) 
            navigateBack()
            }) 
        {
            Text(text = UPDATE)   
        }
    }
}