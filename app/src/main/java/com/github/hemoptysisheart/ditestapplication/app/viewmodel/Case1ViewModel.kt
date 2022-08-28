package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.app.model.Case1Model
import dagger.hilt.android.lifecycle.HiltViewModel
import java.time.format.DateTimeFormatter
import javax.inject.Inject

@HiltViewModel
class Case1ViewModel @Inject constructor(
    private val case1Model: Case1Model
) : ViewModel() {
    companion object {
        val TAG = Case1ViewModel::class.simpleName
    }

    fun text(): String {
        Log.w(TAG, "#text : testModel=$case1Model")

        val text = DateTimeFormatter.ISO_INSTANT.format(case1Model.instant())
        Log.v(TAG, "#text return : $text")
        return text
    }
}
