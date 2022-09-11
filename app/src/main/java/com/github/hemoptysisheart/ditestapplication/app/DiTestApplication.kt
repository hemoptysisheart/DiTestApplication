package com.github.hemoptysisheart.ditestapplication.app

import android.app.Application
import android.util.Log
import com.github.hemoptysisheart.ditestapplication.app.model.Case1Model
import com.github.hemoptysisheart.ditestapplication.app.model.Case3Model
import com.github.hemoptysisheart.ditestapplication.app.model.Case4Model
import com.github.hemoptysisheart.ditestapplication.domain.Case5Domain
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class DiTestApplication : Application() {
    companion object {
        val TAG = DiTestApplication::class.simpleName
    }

    @Inject
    lateinit var case1Model: Case1Model

    @Inject
    lateinit var case3Model: Case3Model

    @Inject
    lateinit var case4Model: Case4Model

    @Inject
    lateinit var case5Domain: Case5Domain

    override fun onCreate() {
        Log.i(TAG, "#onCreate start.")
        super.onCreate()

        Log.i(TAG, "#onCreate : case1Model=$case1Model")
        Log.i(TAG, "#onCreate : case3Model=$case3Model")
        Log.i(TAG, "#onCreate : case4Model=$case4Model")
        Log.i(TAG, "#onCreate : case5Domain=$case5Domain")
    }
}