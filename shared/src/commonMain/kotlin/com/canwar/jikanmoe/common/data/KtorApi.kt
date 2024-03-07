package com.canwar.jikanmoe.common.data

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.http.ContentType
import io.ktor.http.URLProtocol
import io.ktor.http.contentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

private const val BASE_URL = "api.jikan.moe"
private val pathBaseUrl = listOf("v4")

internal abstract class KtorApi {

    val client = HttpClient {
        /**
         * for logging requests and responses
         * */
        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.ALL
        }
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    fun HttpRequestBuilder.endpoint(vararg path: String) {
        url {
            protocol = URLProtocol.HTTPS
            host = BASE_URL
            pathSegments = pathBaseUrl + path
            contentType(ContentType.Application.Json)
        }
    }
}