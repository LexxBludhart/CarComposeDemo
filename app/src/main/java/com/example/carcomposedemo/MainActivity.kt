package com.example.carcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.carcomposedemo.navigation.NavGraph
import com.example.carcomposedemo.ui.theme.CarComposeDemoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarComposeDemoTheme {
                NavGraph(navController = rememberNavController())
            }
        }
    }
}
