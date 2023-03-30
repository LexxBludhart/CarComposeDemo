package com.example.carcomposedemo.navigation

import com.example.carcomposedemo.constants.Constants


sealed class Destinations(val route: String) {
    object CarsDestination: Destinations(Constants.CARS_SCREEN)

    object UpdateCarDestination: Destinations(Constants.UPDATE_CAR_SCREEN)
}