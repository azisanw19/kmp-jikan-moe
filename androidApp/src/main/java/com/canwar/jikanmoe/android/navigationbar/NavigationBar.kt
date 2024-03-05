package com.canwar.jikanmoe.android.navigationbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationBar(navController: NavController) {
    val state = rememberNavigationBarState(navController)

    NavigationBar {

    }
}

@Preview
@Composable
private fun NavigationBarPreview() {
    MaterialTheme {
        NavigationBar(rememberNavController())
    }
}