package com.github.hemoptysisheart.ditestapplication.model

import android.content.SharedPreferences
import com.github.hemoptysisheart.ditestapplication.domain.OidcAuthSetting
import com.github.hemoptysisheart.ditestapplication.domain.Settings
import com.github.hemoptysisheart.ditestapplication.model.domain.OidcAuthSettingImpl
import javax.inject.Inject

class SettingsModel @Inject constructor(
    private val sharedPreferences: SharedPreferences,
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()
) : Settings {
    companion object {
        val TAG = SettingsModel::class.simpleName
    }

    override val auth: OidcAuthSetting
        get() {
            val group = OidcAuthSettingImpl(sharedPreferences, editor)
            if (!group.initialized) {
                group.initialize()
            }
            return group
        }
}