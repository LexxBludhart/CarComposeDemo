package com.example.carcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.carcomposedemo.ui.theme.CarComposeDemoTheme
import com.example.carcomposedemo.view.NavGraphs
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.NavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarComposeDemoTheme {
                // TODO: Put this back after invalidating cache and rebuilding
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}
