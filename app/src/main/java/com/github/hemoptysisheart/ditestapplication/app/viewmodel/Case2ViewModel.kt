package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import javax.inject.Inject

@HiltViewModel
class Case2ViewModel @Inject constructor() : ViewModel() {
    companion object {
        val TAG = Case2ViewModel::class.simpleName
    }

    var timestamp = Instant.now()

    fun refresh(): Instant {
        timestamp = Instant.now()

        Log.v(TAG, "#refresh return : $timestamp")
        return timestamp
    }

    override fun toString() = "$TAG(timestamp=$timestamp)"
}