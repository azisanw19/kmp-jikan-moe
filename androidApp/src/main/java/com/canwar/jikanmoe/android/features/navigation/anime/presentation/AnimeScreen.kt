package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.canwar.jikanmoe.android.MyApplicationTheme
import com.canwar.jikanmoe.anime.domain.model.AnimeResultData

@Composable
fun AnimeScreen (
    animeList: List<AnimeResultData>,
) {
    LazyColumn {
        itemsIndexed(animeList) { _, item ->
            Text(text = item.synopsis ?: "No synopsis")
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MyApplicationTheme {
        AnimeScreen(
            animeList = emptyList()
        )
    }
}