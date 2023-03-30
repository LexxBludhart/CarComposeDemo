package com.example.carcomposedemo.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.carcomposedemo.constants.Constants
import com.example.carcomposedemo.model.entity.Car
import com.example.carcomposedemo.model.repository.CarRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CarsViewModel @Inject constructor(private val repo: CarRepository): ViewModel() {

    val cars = repo.getCarsFromRoom()

    var currentCar by mutableStateOf(
        Car(0, Constants.NO_VALUE, Constants.NO_VALUE, Constants.NO_VALUE, Constants.NO_VALUE))
        private set

    var isDialogOpen by mutableStateOf(false)

    fun getCar(id: Int) = viewModelScope.launch(Dispatchers.IO) {
        currentCar = repo.getCarFromRoom(id)
    }

    fun addCar(car: Car) = viewModelScope.launch(Dispatchers.IO) {
        repo.addCarToRoom(car)
    }

    fun updateCar(car: Car) = viewModelScope.launch(Dispatchers.IO) {
        repo.updateCarInRoom(car)
    }

    fun deleteCar(car: Car) = viewModelScope.launch(Dispatchers.IO) {
        repo.deleteCarFromRoom(car)
    }

    fun updateMake(make: String) {
        currentCar = currentCar.copy(make = make)
    }

    fun updateModel(model: String) {
        currentCar = currentCar.copy(model = model)
    }

    fun updateYear(year: String) {
        currentCar = currentCar.copy(year = year)
    }

    fun updateColor(color: String) {
        currentCar = currentCar.copy(color = color)
    }

    fun openDialog() {
        isDialogOpen = true
    }

    fun closeDialog() {
        isDialogOpen = false
    }
}