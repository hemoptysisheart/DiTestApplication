package com.github.hemoptysisheart.ditestapplication.domain

import java.time.Instant

interface Case5Domain {
    val counter: Int

    val timestamp: Instant

    fun increaseCounter(): Int
}