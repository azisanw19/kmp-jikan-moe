package com.canwar.jikanmoe.android.features.navigation.manga.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

const val MANGA_GRAPH_ROUTE = "manga-graph"

fun NavGraphBuilder.mangaGraph() {
    navigation(
        startDestination = MANGA_ROUTE,
        route = MANGA_GRAPH_ROUTE
    ) {
        mangaScreen()
    }
}