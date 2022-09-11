package com.github.hemoptysisheart.ditestapplication.model

import android.content.SharedPreferences
import com.github.hemoptysisheart.ditestapplication.domain.Case5Domain
import javax.inject.Inject

class Case5Model @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()
) : Case5Domain {
    companion object {
        val TAG = Case5Model::class.simpleName

        private val KEY_COUNTER = "$TAG/counter"
    }

    override val counter: Int
        get() = sharedPreferences.getInt(KEY_COUNTER, 0)

    override fun increaseCounter(): Int {
        var rv = counter + 1

        editor.putInt(KEY_COUNTER, rv)
        editor.apply()

        return rv
    }
}