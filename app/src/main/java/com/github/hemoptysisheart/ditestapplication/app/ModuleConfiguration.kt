package com.github.hemoptysisheart.ditestapplication.app

import android.util.Log
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
    fun provideTestModel(): TestModel {
        val model = TestModel()
        Log.v(TAG, "#provideTestModel return : $model")
        return model
    }
}