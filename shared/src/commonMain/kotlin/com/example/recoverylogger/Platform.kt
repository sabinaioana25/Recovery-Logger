package com.example.recoverylogger

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
