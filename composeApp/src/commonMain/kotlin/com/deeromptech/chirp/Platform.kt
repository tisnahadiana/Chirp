package com.deeromptech.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform