package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.app.model.Case4Model
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import javax.inject.Inject

@HiltViewModel
class Case4ViewModel @Inject constructor(
    private val model: Case4Model
) : ViewModel() {
    companion object {
        val TAG = Case4ViewModel::class.simpleName
    }

    fun timestamp(): Instant = model.timestamp()

    fun update(): Instant {
        val instant = model.update()

        Log.v(TAG, "#update return : $instant")
        return instant
    }
}