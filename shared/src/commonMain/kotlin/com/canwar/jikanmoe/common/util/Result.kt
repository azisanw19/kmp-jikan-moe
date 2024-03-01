package com.canwar.jikanmoe.common.util

sealed class Result <T> (
    val data: T? = null,
    val message: String? = null,
) {
    class Error<T>(data: T?, message: String) : Result<T>(data = data, message = message)
    class Success<T>(data: T) : Result<T>(data = data)
}