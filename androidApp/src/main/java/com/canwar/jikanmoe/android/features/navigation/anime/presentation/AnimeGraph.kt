package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

const val ANIME_GRAPH_ROUTE = "anime-graph"

fun NavGraphBuilder.animeGraph() {
    navigation(
        startDestination = ANIME_ROUTE,
        route = ANIME_GRAPH_ROUTE
    ) {
        animeScreen()
    }
}