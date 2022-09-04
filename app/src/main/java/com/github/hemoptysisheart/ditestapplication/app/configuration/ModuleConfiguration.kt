package com.github.hemoptysisheart.ditestapplication.app.configuration

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.github.hemoptysisheart.ditestapplication.app.model.Case1Model
import com.github.hemoptysisheart.ditestapplication.app.model.Case3Model
import com.github.hemoptysisheart.ditestapplication.app.model.Case4Model
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ModuleConfiguration {
    companion object {
        val TAG = ModuleConfiguration::class.simpleName
    }

    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context): SharedPreferences {
        Log.i(TAG, "#provideSharedPreferences args : context=$context")

        val sharedPreferences = EncryptedSharedPreferences.create(
            context,
            "com.github.hemoptysisheart.ditestapplication.encryptedSharedPreferences",
            MasterKey.Builder(context)
                .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                .build(),
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )

        Log.i(TAG, "#provideSharedPreferences return : $sharedPreferences")
        return sharedPreferences
    }

    @Provides
    fun provideCase1Model() = Case1Model()

    @Provides
    fun provideCase3Model() = Case3Model()

    @Provides
    fun provideCase4Model(sharedPreferences: SharedPreferences) = Case4Model(sharedPreferences)
}