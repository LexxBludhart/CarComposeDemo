package com.example.carcomposedemo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.carcomposedemo.constants.Constants
import com.example.carcomposedemo.model.entity.Car
import com.example.carcomposedemo.model.repository.CarRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarsViewModel @Inject constructor(private val repo: CarRepository): ViewModel() {
    val cars = repo.getCarsFromRoom()
    var car by mutableStateOf(
        Car(0, Constants.NO_VALUE, Constants.NO_VALUE, Constants.NO_VALUE, Constants.NO_VALUE))
        private set
}