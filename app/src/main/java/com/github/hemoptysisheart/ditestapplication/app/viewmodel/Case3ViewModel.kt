package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.app.model.Case3Model
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import javax.inject.Inject

@HiltViewModel
class Case3ViewModel @Inject constructor(
    private val model: Case3Model
) : ViewModel() {
    companion object {
        val TAG = Case3ViewModel::class.simpleName
    }

    fun refresh(): Instant {
        val instant = model.refresh()
        Log.v(TAG, "#refresh : model=$model")
        return instant
    }

    override fun toString() = "$TAG(model=$model)"
}
