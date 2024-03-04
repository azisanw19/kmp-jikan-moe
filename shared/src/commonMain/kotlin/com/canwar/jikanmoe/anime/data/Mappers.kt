package com.canwar.jikanmoe.anime.data

import com.canwar.jikanmoe.anime.domain.model.AnimeResultData

internal fun AnimeResponse.toAnimeResultData(): AnimeResultData {
    return AnimeResultData(
        id = id,
        synopsis = synopsis,
    )
}