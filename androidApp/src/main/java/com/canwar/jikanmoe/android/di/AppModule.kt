package com.canwar.jikanmoe.android.di

import com.canwar.jikanmoe.android.features.navigation.anime.presentation.AnimeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { AnimeViewModel(get()) }
}