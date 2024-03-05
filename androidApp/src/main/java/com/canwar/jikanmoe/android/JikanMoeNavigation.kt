package com.canwar.jikanmoe.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun JikanMoeNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "",
    ) {

    }
}