package com.canwar.jikanmoe.di

import com.canwar.jikanmoe.anime.data.AnimeRepositoryImpl
import com.canwar.jikanmoe.anime.data.AnimeService
import com.canwar.jikanmoe.anime.domain.repository.AnimeRepository
import com.canwar.jikanmoe.anime.domain.usecase.AnimeListUseCase
import com.canwar.jikanmoe.common.util.provideDispatcher
import org.koin.dsl.module

private val animeModule = module {
    single<AnimeRepository> { AnimeRepositoryImpl(get(), get()) }
    factory { AnimeService() }
    factory { AnimeListUseCase() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

fun getSharedModules() = listOf(animeModule, utilityModule)