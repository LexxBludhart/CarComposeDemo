package com.example.carcomposedemo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.carcomposedemo.constants.Constants.CAR_ID
import com.example.carcomposedemo.view.CarsScreen
import com.example.carcomposedemo.navigation.Destinations.UpdateCarDestination
import com.example.carcomposedemo.view.UpdateCarScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Destinations.CarsDestination.route
    ) {
        composable(route = Destinations.CarsDestination.route) {
            CarsScreen(navigateToUpdateCarScreen = { carId ->
                navController.navigate("${UpdateCarDestination.route}/${carId}")
            })
        }

        // TODO: Check to see if the other way of CAR_ID works here...${CAR_ID}
        composable(route = "${UpdateCarDestination.route}/{$CAR_ID}",
            arguments = listOf(
                navArgument(CAR_ID) {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val carId = backStackEntry.arguments?.getInt(CAR_ID) ?: 0
            UpdateCarScreen(carId = carId, navigateBack = { navController.popBackStack() })
        }
    }
}