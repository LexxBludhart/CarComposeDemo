package com.example.carcomposedemo.model.repository

import com.example.carcomposedemo.model.entity.Car
import kotlinx.coroutines.flow.Flow

typealias Cars = List<Car>

interface CarRepository {
    // these functions mirror SQL CRUD
    fun getCarsFromRoom(): Flow<Cars>

    fun getCarFromRoom(id: Int): Car

    fun addCarToRoom(car: Car)

    fun updateCarInRoom(car: Car)

    fun deleteCarFromRoom(car: Car)
}