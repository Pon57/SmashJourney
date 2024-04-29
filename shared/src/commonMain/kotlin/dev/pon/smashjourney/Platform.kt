package dev.pon.smashjourney

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform