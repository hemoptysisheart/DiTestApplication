package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.domain.Case5Domain
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.Instant
import javax.inject.Inject

@HiltViewModel
class Case5ViewModel @Inject constructor(
    private val model: Case5Domain
) : ViewModel() {
    companion object {
        val TAG = Case5ViewModel::class.simpleName
    }

    var counter: Int = model.counter
        get() = model.counter
        private set

    var timestamp: Instant = model.timestamp
        get() = model.timestamp
        private set

    fun increase() {
        model.increaseCounter()
    }

    override fun toString() = "$TAG(model=$model)"
}
