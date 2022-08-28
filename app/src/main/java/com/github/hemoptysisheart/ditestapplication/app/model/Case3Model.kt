package com.github.hemoptysisheart.ditestapplication.app.model

import android.util.Log
import java.time.Instant

class Case3Model {
    companion object {
        val TAG = Case3Model::class.simpleName
    }

    var instant: Instant = Instant.now()
        private set

    fun refresh(): Instant {
        instant = Instant.now()
        Log.v(TAG, "#refresh return : $instant")
        return instant
    }

    override fun toString() = "$TAG(instant=$instant)"
}