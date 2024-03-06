package com.canwar.jikanmoe.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.canwar.jikanmoe.android.features.navigation.NAVIGATION_BAR_HOST_ROUTE
import com.canwar.jikanmoe.android.features.navigation.navigateBarHost

@Composable
fun JikanMoeNavigation() {
    val navigationController = rememberNavController()
    val navigationBarController = rememberNavController()

    NavHost(
        navController = navigationController,
        startDestination = NAVIGATION_BAR_HOST_ROUTE,
    ) {

        navigateBarHost(
            navController = navigationBarController,
        )

    }
}