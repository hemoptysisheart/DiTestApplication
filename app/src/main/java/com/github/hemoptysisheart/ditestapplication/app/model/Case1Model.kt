package com.github.hemoptysisheart.ditestapplication.app.model

import java.time.Instant
import java.time.temporal.ChronoUnit

class Case1Model {
    fun instant() = Instant.now().truncatedTo(ChronoUnit.MILLIS)
}
