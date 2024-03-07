package com.canwar.jikanmoe.anime.data

import com.canwar.jikanmoe.anime.domain.repository.AnimeRepository
import com.canwar.jikanmoe.anime.domain.model.AnimeResultData
import com.canwar.jikanmoe.common.data.BaseRepository
import com.canwar.jikanmoe.common.util.DispatcherProvider
import com.canwar.jikanmoe.common.util.Result

internal class AnimeRepositoryImpl(
    dispatcher: DispatcherProvider,
    private val animeService: AnimeService,
) : BaseRepository(dispatcher), AnimeRepository {
    override suspend fun getAnimeList(): Result<List<AnimeResultData>> =
        getStateOf(
            response = { animeService.getAnimeList() },
            success = { response ->
                if (response.data == null) {
                    Result.Error(
                        message = "Data is null",
                    )
                } else {
                    val animeList = response.data.map { it.toAnimeResultData() }
                    Result.Success(
                        data = animeList,
                    )
                }
            },
            error = { e ->
                Result.Error(
                    message = e.message ?: "Oops, we could not send your request, try later!",
                )
            },
        )
}