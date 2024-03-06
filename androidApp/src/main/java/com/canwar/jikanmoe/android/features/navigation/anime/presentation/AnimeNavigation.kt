package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val ANIME_ROUTE = "anime"

fun NavGraphBuilder.animeScreen() {
    composable(
        route = ANIME_ROUTE
    ) {
        AnimeScreen()
    }
}