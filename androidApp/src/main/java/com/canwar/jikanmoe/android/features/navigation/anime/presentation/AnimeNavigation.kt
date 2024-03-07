package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import org.koin.androidx.compose.koinViewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue


const val ANIME_ROUTE = "anime"

fun NavGraphBuilder.animeScreen() {
    composable(
        route = ANIME_ROUTE
    ) {
        val viewModel : AnimeViewModel = koinViewModel()
        val animeList by viewModel.animeList.collectAsState()

        AnimeScreen(
            animeList = animeList.toList()
        )
    }
}