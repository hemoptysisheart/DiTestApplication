package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.domain.Case5Domain
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Case5ViewModel @Inject constructor(
    private val model: Case5Domain
) : ViewModel() {
    companion object {
        val TAG = Case5ViewModel::class.simpleName
    }

    val counter: Int
        get() {
            val rv = model.counter
            Log.v(TAG, "#counter return : $rv")
            return rv
        }
}
