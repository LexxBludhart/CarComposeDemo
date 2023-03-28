package com.example.carcomposedemo.model.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.carcomposedemo.model.dao.CarDao
import com.example.carcomposedemo.model.entity.Car

@Database(entities = [Car::class], version = 1, exportSchema = false)
abstract class CarDatabase : RoomDatabase() {
    abstract fun carDao(): CarDao
}