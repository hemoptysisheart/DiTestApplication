package com.github.hemoptysisheart.ditestapplication.app.configuration

import android.util.Log
import com.github.hemoptysisheart.ditestapplication.app.model.Case1Model
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ModuleConfiguration {
    companion object {
        val TAG = ModuleConfiguration::class.simpleName
    }

    @Provides
    fun provideTestModel(): Case1Model {
        val model = Case1Model()
        Log.v(TAG, "#provideTestModel return : $model")
        return model
    }
}