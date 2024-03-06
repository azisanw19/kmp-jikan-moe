package com.canwar.jikanmoe.android.features.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.canwar.jikanmoe.android.features.navigation.anime.presentation.ANIME_GRAPH_ROUTE
import com.canwar.jikanmoe.android.features.navigation.anime.presentation.animeGraph
import com.canwar.jikanmoe.android.features.navigation.manga.presentation.mangaGraph

const val NAVIGATION_BAR_HOST_ROUTE = "navigation_bar_host"

fun NavGraphBuilder.navigateBarHost(
    navController: NavHostController,
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
                startDestination = ANIME_GRAPH_ROUTE,
                modifier = Modifier.padding(padding)
            ) {
                animeGraph()

                mangaGraph()

            }
        }

    }
}