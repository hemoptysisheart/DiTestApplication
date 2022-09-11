package com.github.hemoptysisheart.ditestapplication.model

import android.content.SharedPreferences
import com.github.hemoptysisheart.ditestapplication.domain.Case5Domain
import java.time.Instant
import java.time.temporal.ChronoUnit
import javax.inject.Inject

class Case5Model @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()
) : Case5Domain {
    companion object {
        val TAG = Case5Model::class.simpleName

        private val KEY_COUNTER = "$TAG/counter"
        private val KEY_TIMESTAMP = "$TAG/timestamp"
    }

    override val counter: Int
        get() = sharedPreferences.getInt(KEY_COUNTER, 0)

    override val timestamp: Instant
        get() = Instant.ofEpochMilli(sharedPreferences.getLong(KEY_TIMESTAMP, 0L))

    override fun increaseCounter(): Int {
        val timestamp = Instant.now().truncatedTo(ChronoUnit.MILLIS)
        val rv = counter + 1

        editor.putInt(KEY_COUNTER, rv)
        editor.putLong(KEY_TIMESTAMP, timestamp.toEpochMilli())
        editor.apply()

        return rv
    }

    override fun toString() = "$TAG(counter=$counter, timestamp=$timestamp)"
}