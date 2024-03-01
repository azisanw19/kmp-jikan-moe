package com.canwar.jikanmoe.anime.data

import com.canwar.jikanmoe.common.data.KtorApi
import io.ktor.client.call.body
import io.ktor.client.request.get

internal class AnimeService : KtorApi() {

    suspend fun getAnimeList() : AnimeListResponse = client.get {
        endpoint(path = "top/anime/1")
    }.body()
}