package com.github.hemoptysisheart.ditestapplication.app.configuration

import com.github.hemoptysisheart.ditestapplication.app.model.Case1Model
import com.github.hemoptysisheart.ditestapplication.app.model.Case3Model
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
    fun provideCase1Model() = Case1Model()

    @Provides
    fun provideCase3Model() = Case3Model()
}