package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.canwar.jikanmoe.android.MyApplicationTheme

@Composable
fun AnimeScreen () {
    Text(text = "Anime Screen")
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MyApplicationTheme {
        AnimeScreen()
    }
}