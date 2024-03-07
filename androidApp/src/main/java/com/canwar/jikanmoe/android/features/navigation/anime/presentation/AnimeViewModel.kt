package com.canwar.jikanmoe.android.features.navigation.anime.presentation

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.canwar.jikanmoe.anime.domain.model.AnimeResultData
import com.canwar.jikanmoe.anime.domain.usecase.AnimeListUseCase
import com.canwar.jikanmoe.common.util.Result
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class AnimeViewModel(
    private val animeListUseCase: AnimeListUseCase
) : ViewModel() {

    var isLoading = MutableStateFlow(false)
        private set

    var animeList = MutableStateFlow<List<AnimeResultData>>(emptyList())
        private set

    var error = MutableStateFlow<String?>(null)
        private set


    init {
        fetchAnimeList()
    }

    fun fetchAnimeList() {
        Log.d("AnimeViewModel", "fetchAnimeList: ")
        viewModelScope.launch {
            isLoading.value = true
            when (val result = animeListUseCase()) {
                is Result.Success -> {
                    animeList.emit(result.data!!)
                    Log.d("AnimeViewModel", "fetchAnimeList: ${result.data}")
                }
                is Result.Error -> {
                    error.emit(result.message)
                    Log.d("AnimeViewModel", "fetchAnimeList: ${result.message}")

                }
            }
            isLoading.emit(false)
        }
    }

}