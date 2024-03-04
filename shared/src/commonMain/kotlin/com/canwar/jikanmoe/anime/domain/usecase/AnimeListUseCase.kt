package com.canwar.jikanmoe.anime.domain.usecase

import com.canwar.jikanmoe.anime.domain.repository.AnimeRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class AnimeListUseCase : KoinComponent {

    private val repository: AnimeRepository by inject()

    suspend operator fun invoke() = repository.getAnimeList();
}