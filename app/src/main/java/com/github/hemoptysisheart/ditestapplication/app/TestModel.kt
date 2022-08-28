package com.github.hemoptysisheart.ditestapplication.app

import java.time.Instant
import java.time.temporal.ChronoUnit

class TestModel {
    fun instant() = Instant.now().truncatedTo(ChronoUnit.MILLIS)
}
