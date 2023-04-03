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
import androidx.compose.ui.unit.dp
import com.example.carcomposedemo.constants.Constants.ADD_CAR
import com.example.carcomposedemo.constants.Constants.CAR_COLOR
import com.example.carcomposedemo.constants.Constants.CAR_MAKE
import com.example.carcomposedemo.constants.Constants.CAR_MODEL
import com.example.carcomposedemo.constants.Constants.CAR_YEAR
import com.example.carcomposedemo.constants.Constants.DISMISS
import com.example.carcomposedemo.constants.Constants.NO_VALUE
import com.example.carcomposedemo.model.entity.Car
import kotlinx.coroutines.job

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
            title = { Text(text = ADD_CAR) },
            text = {
                   Column {
                       TextField(
                           value = make,
                           onValueChange = { make = it },
                           placeholder = { Text(text = CAR_MAKE) },
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
                           placeholder = { Text(text = CAR_MODEL) }
                           )
                       Spacer(modifier = Modifier.height(16.dp))
                       TextField(
                           value = year,
                           onValueChange = { year = it } ,
                           placeholder = { Text(text = CAR_YEAR) }
                           )
                       Spacer(modifier = Modifier.height(16.dp))
                       TextField(
                           value = color,
                           onValueChange = { color = it },
                           placeholder = { Text(text = CAR_COLOR) }
                           )
                   }
            },
            confirmButton = { TextButton(onClick = {
                val car = Car(0, make, model, year, color)
                addCar(car)
                closeDialog()
            }) {
             Text(text = ADD_CAR)
            }},
            dismissButton = { TextButton(onClick = closeDialog) {
                Text(text = DISMISS)
            }}
        )
    }
}