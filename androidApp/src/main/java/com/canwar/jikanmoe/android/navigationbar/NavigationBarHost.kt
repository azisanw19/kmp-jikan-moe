package com.canwar.jikanmoe.android.navigationbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

const val NAVIGATION_BAR_HOST_ROUTE = "navigation_bar_host"

fun NavGraphBuilder.navigateBarHost(
    navController: NavHostController,
    startDestination: String,
) {
    composable(
        route = NAVIGATION_BAR_HOST_ROUTE
    ) { entry ->

        Scaffold(
            bottomBar = {
                NavigationBar(navController = navController)
            }
        ) { padding ->
            NavHost(
                navController = navController,
                startDestination = startDestination,
                modifier = Modifier.padding(padding)
            ) {

            }
        }

    }
}