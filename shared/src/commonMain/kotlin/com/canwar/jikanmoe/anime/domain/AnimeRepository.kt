package com.canwar.jikanmoe.anime.domain

import com.canwar.jikanmoe.anime.domain.model.AnimeResultData
import com.canwar.jikanmoe.common.util.Result

internal interface AnimeRepository {

    suspend fun getAnimeList(): Result<List<AnimeResultData>>

}