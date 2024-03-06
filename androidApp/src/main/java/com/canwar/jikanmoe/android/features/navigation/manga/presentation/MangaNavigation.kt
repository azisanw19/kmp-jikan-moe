package com.canwar.jikanmoe.android.features.navigation.manga.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val MANGA_ROUTE = "manga"

fun NavGraphBuilder.mangaScreen() {
    composable(
        route = MANGA_ROUTE
    ) {
        MangaScreen()
    }
}