package com.canwar.jikanmoe.android.features.navigation

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.canwar.jikanmoe.android.MyApplicationTheme
import com.canwar.jikanmoe.android.features.navigation.anime.presentation.ANIME_GRAPH_ROUTE
import com.canwar.jikanmoe.android.features.navigation.manga.presentation.MANGA_GRAPH_ROUTE

@Composable
fun NavigationBar(navController: NavController) {
    val state = rememberNavigationBarState(navController)

    NavigationBar {
        val isAnimeSelected by state.isRouteSelected(ANIME_GRAPH_ROUTE)
            .collectAsState(initial = false)
        NavigationBarItem(
            selected = isAnimeSelected,
            onClick = {
                Log.d("Anime Clicked", "Anime Clicked")
                state.openRoute(ANIME_GRAPH_ROUTE)
            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            }
        )

        val isMangaSelected by state.isRouteSelected(MANGA_GRAPH_ROUTE)
            .collectAsState(initial = false)
        NavigationBarItem(
            selected = isMangaSelected,
            onClick = {
                Log.d("Manga Clicked", "Manga Clicked")
                state.openRoute(MANGA_GRAPH_ROUTE)
            },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            }
        )
    }
}

@Preview
@Composable
private fun NavigationBarPreview() {
    MyApplicationTheme {
        NavigationBar(rememberNavController())
    }
}