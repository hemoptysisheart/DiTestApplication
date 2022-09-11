package com.github.hemoptysisheart.ditestapplication.app.model

import java.time.Instant
import java.time.temporal.ChronoUnit

class Case1Model {
    companion object {
        val TAG = Case1Model::class.simpleName
    }

    fun instant(): Instant = Instant.now().truncatedTo(ChronoUnit.MILLIS)

    override fun toString() = "$TAG(instant=${instant()})"
}
