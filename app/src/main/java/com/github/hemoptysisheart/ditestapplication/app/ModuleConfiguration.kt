package com.github.hemoptysisheart.ditestapplication.app

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ModuleConfiguration {
    @Provides
    fun provideTestModel() = TestModel()
}