package com.github.hemoptysisheart.ditestapplication.app.viewmodel

import androidx.lifecycle.ViewModel
import com.github.hemoptysisheart.ditestapplication.domain.OidcAuthSetting
import com.github.hemoptysisheart.ditestapplication.model.SettingsModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthSettingViewModel @Inject constructor(
    private val settingsModel: SettingsModel
) : ViewModel() {
    companion object {
        val TAG = AuthSettingViewModel::class.simpleName
    }

    private val auth: OidcAuthSetting = settingsModel.auth

    var oidcAuthorized: Boolean = false
        get() = !auth.idToken.isNullOrEmpty()
        private set

    override fun toString() = "$TAG(auth=$auth)"
}
