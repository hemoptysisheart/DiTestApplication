package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import java.time.Instant
import javax.inject.Inject

@HiltViewModel
class SubComponentViewModel @Inject constructor() : ViewModel() {
    companion object {
        val TAG = SubComponentViewModel::class.simpleName
    }

    val timestamp = MutableStateFlow<Instant>(Instant.now())

    fun refresh() {
        val now = Instant.now()
        Log.v(TAG, "#refresh : now=$now")
        timestamp.value = now
    }
}