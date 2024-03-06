package com.canwar.jikanmoe.android.features.navigation.manga.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.canwar.jikanmoe.android.MyApplicationTheme

@Composable
fun MangaScreen () {
    Text(text = "Manga Screen")
}

@Preview
@Composable
private fun HomeScreenPreview() {
    MyApplicationTheme {
        MangaScreen()
    }
}