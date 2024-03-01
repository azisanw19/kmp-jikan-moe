package com.canwar.jikanmoe.anime.data

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
data class AnimeListResponse @OptIn(ExperimentalSerializationApi::class) constructor(
    @JsonNames("pagination")
    val pagination: Pagination,
    @JsonNames("data")
    val data: List<AnimeResponse>
)

@Serializable
data class Pagination @OptIn(ExperimentalSerializationApi::class) constructor(
    @JsonNames("last_visible_page")
    val lastVisiblePage: Int,
    @JsonNames("has_next_page")
    val hasNextPage: Boolean,
    @JsonNames("current_page")
    val currentPage: Int
)

@Serializable
data class AnimeResponse @OptIn(ExperimentalSerializationApi::class) constructor(
    @JsonNames("mal_id")
    val id: Int,
    @JsonNames("synopsis")
    val synopsis: String,
)