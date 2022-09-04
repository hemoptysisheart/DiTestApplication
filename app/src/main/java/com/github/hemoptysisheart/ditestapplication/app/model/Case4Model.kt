package com.github.hemoptysisheart.ditestapplication.app.model

import android.content.SharedPreferences
import android.util.Log
import java.time.Instant
import java.time.temporal.ChronoUnit.MILLIS

class Case4Model(
    private val sharedPreferences: SharedPreferences
) {
    companion object {
        val TAG = Case4Model::class.simpleName

        const val KEY_TIMESTAMP = "Case4Model.timestamp"
    }

    private val editor = sharedPreferences.edit()

    fun timestamp(): Instant = Instant.ofEpochMilli(sharedPreferences.getLong(KEY_TIMESTAMP, 0L))

    fun update(): Instant {
        val pre = Instant.ofEpochMilli(sharedPreferences.getLong(KEY_TIMESTAMP, 0L))
        Log.v(TAG, "#update : pre=$pre")

        val now = Instant.now().truncatedTo(MILLIS)
        editor.putLong(KEY_TIMESTAMP, now.toEpochMilli())
        editor.apply()

        Log.v(TAG, "#update return : $now")
        return now
    }

    override fun toString() = "$TAG(sharedPreferences=$sharedPreferences, editor=$editor)"
}