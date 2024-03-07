package com.canwar.jikanmoe.common.data

import kotlinx.coroutines.withContext
import com.canwar.jikanmoe.common.util.DispatcherProvider
import com.canwar.jikanmoe.common.util.Result

internal abstract class BaseRepository(
    private val dispatcher: DispatcherProvider,
) {
    protected suspend fun <T, R> getStateOf(
        response: suspend () -> T,
        success: (response: T) -> Result<R>,
        error: (e: Exception) -> Result<R>,
    ): Result<R> {
        return withContext(dispatcher.io) {
            try {
                val result = response()
                success(result)
            } catch (e: Exception) {
                error(e)
            }
        }
    }

}