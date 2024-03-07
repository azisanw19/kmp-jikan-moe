package com.canwar.jikanmoe.anime.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AnimeListResponse(
    @SerialName("pagination")
    val pagination: Pagination?,
    @SerialName("data")
    val data: List<AnimeResponse>?
)

@Serializable
data class Pagination(
    @SerialName("last_visible_page")
    val lastVisiblePage: Int?,
    @SerialName("has_next_page")
    val hasNextPage: Boolean?,
    @SerialName("current_page")
    val currentPage: Int?
)

@Serializable
data class AnimeResponse(
    @SerialName("mal_id")
    val malId: Int?,
    @SerialName("synopsis")
    val synopsis: String?,
)