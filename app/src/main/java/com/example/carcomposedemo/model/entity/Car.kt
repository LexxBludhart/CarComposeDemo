package com.example.carcomposedemo.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.carcomposedemo.constants.Constants.CAR_TABLE

@Entity(tableName = CAR_TABLE)
data class Car(

    @PrimaryKey(autoGenerate = true) val id: Int, // generates an id for us.
    val make: String,
    val model: String,
    val year: String,
    val color: String
)