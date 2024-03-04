package com.canwar.jikanmoe.anime.data

import com.canwar.jikanmoe.anime.domain.repository.AnimeRepository
import com.canwar.jikanmoe.anime.domain.model.AnimeResultData
import com.canwar.jikanmoe.common.util.DispatcherProvider
import com.canwar.jikanmoe.common.util.Result
import kotlinx.coroutines.withContext

internal class AnimeRepositoryImpl(
    private val dispatcher: DispatcherProvider,
    private val animeService: AnimeService,
) : AnimeRepository {
    override suspend fun getAnimeList(): Result<List<AnimeResultData>> {
        return withContext(dispatcher.io) {
            try {
                val response = animeService.getAnimeList()
                if (response.data.isEmpty()) {
                    Result.Error(
                        message = "No anime found",
                    )
                } else {
                    val animeList = response.data.map { it.toAnimeResultData() }
                    Result.Success(
                        data = animeList,
                    )
                }
            } catch (e: Exception) {
                Result.Error(
                    message = "Ooops! Something went wrong",
                )
            }
        }
    }
}