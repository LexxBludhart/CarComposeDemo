package com.example.carcomposedemo.view.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.carcomposedemo.constants.Constants.NO_VALUE
import com.example.carcomposedemo.model.entity.Car
import kotlinx.coroutines.job
import com.example.carcomposedemo.R

@Composable
fun AddCardAlertDialog(
    isDialogOpen: Boolean,
    closeDialog: () -> Unit,
    addCar: (car: Car) -> Unit
) {
    if (isDialogOpen) {
        var make by remember { mutableStateOf(NO_VALUE) }
        var model by remember { mutableStateOf(NO_VALUE) }
        var year by remember { mutableStateOf(NO_VALUE) }
        var color by remember { mutableStateOf(NO_VALUE) }

        val focusRequester = FocusRequester()

        AlertDialog(
            onDismissRequest = closeDialog,
            title = { Text(text = stringResource(R.string.action_add_car)) },
            text = {
                   Column {
                       TextField(
                           value = make,
                           onValueChange = { make = it },
                           placeholder = { Text(text = stringResource(R.string.placeholder_car_make)) },
                           modifier = Modifier.focusRequester(focusRequester)
                       )

                       LaunchedEffect(Unit) {
                           coroutineContext.job.invokeOnCompletion {
                               focusRequester.requestFocus()
                           }
                       }

                       Spacer(modifier = Modifier.height(16.dp))
                       TextField(
                           value = model,
                           onValueChange = { model = it},
                           placeholder = { Text(text = stringResource(id = R.string.placeholder_car_model)) }
                           )
                       Spacer(modifier = Modifier.height(16.dp))
                       TextField(
                           value = year,
                           onValueChange = { year = it } ,
                           placeholder = { Text(text = stringResource(id = R.string.placeholder_car_year)) }
                           )
                       Spacer(modifier = Modifier.height(16.dp))
                       TextField(
                           value = color,
                           onValueChange = { color = it },
                           placeholder = { Text(text = stringResource(id = R.string.placeholder_car_color)) }
                           )
                   }
            },
            confirmButton = { TextButton(onClick = {
                val car = Car(0, make, model, year, color)
                addCar(car)
                closeDialog()
            }) {
             Text(text = stringResource(id = R.string.button_add))
            }},
            dismissButton = { TextButton(onClick = closeDialog) {
                Text(text = stringResource(id = R.string.button_dismiss))
            }}
        )
    }
}