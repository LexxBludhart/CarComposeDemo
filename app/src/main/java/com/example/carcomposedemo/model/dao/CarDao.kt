package com.example.carcomposedemo.model.dao

import androidx.room.*
import com.example.carcomposedemo.constants.Constants.CAR_TABLE
import com.example.carcomposedemo.model.entity.Car
import com.example.carcomposedemo.model.repository.Cars

import kotlinx.coroutines.flow.Flow

@Dao
interface CarDao {
    @Query("SELECT * FROM $CAR_TABLE ORDER BY id_ASC") // gets a list of cars
    fun getCars(): Flow<Cars>

    @Query("SELECT * FROM $CAR_TABLE WHERE id = :id") // gets one car
    fun getCar(id: Int): Car

    @Insert(onConflict = OnConflictStrategy.IGNORE) // adding an car to the database
    fun addCar(car: Car)

    @Update
    fun updateCar(car: Car) // Update

    @Delete
    fun delete(car: Car) // Delete
}