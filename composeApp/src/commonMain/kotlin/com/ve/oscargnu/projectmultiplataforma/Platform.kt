package com.ve.oscargnu.projectmultiplataforma

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform