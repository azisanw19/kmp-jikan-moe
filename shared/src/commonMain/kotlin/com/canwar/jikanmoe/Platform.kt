package com.canwar.jikanmoe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform