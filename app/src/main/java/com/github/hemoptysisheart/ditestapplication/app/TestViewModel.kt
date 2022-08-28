package com.github.hemoptysisheart.ditestapplication.app

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val testModel: TestModel
) : ViewModel() {
    companion object {
        val TAG = TestViewModel::class.simpleName
    }

    fun text(): String {
        Log.w(TAG, "#text : testModel=$testModel")

        val text = DateTimeFormatter.ISO_INSTANT.format(testModel.instant())
        Log.v(TAG, "#text return : $text")
        return text
    }
}