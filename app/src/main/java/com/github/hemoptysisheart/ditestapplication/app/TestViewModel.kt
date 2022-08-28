package com.github.hemoptysisheart.ditestapplication.app

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val testModel: TestModel
) : ViewModel() {
    companion object {
        val FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    }

    fun text() = FORMATTER.format(testModel.instant())
}