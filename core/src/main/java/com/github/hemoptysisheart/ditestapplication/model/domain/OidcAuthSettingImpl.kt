package com.github.hemoptysisheart.ditestapplication.model.domain

import android.content.SharedPreferences
import android.util.Log
import com.github.hemoptysisheart.ditestapplication.domain.OidcAuthSetting

class OidcAuthSettingImpl(
    private val sharedPreferences: SharedPreferences,
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()
) : OidcAuthSetting {
    companion object {
        val TAG = OidcAuthSettingImpl::class.simpleName

        private const val PREFIX = "OidcAuthSetting"
        const val KEY_GROUP_INITIALIZED = "$PREFIX.initialized"
        const val KEY_REFRESH_TOKEN = "$PREFIX.refreshToken"
    }

    var initialized: Boolean = false
        get() = sharedPreferences.getBoolean(KEY_GROUP_INITIALIZED, false)
        private set

    override var refreshToken: String?
        get() = sharedPreferences.getString(KEY_REFRESH_TOKEN, null)
        set(value) {
            // TODO Validation.
            editor.putString(KEY_REFRESH_TOKEN, value)
            editor.apply()
        }

    override var idToken: String? = null

    override var accessToken: String? = null

    override fun refresh() {
        if (refreshToken.isNullOrEmpty()) {
            throw IllegalStateException("refresh token is null or empty.")
        }

        Log.i(TAG, "#refresh request to exchange refresh token to id token & access token.")

        idToken = "dummy.id.token"
        accessToken = "dummy-access-token"
        Log.i(TAG, "#refresh complete : idToken='$idToken', accessToken='$accessToken'")
    }

    /**
     * 인증정보를 저장하는 것이 아닌, 인증정보를 저장할 필드를 초기화하는 용도.
     *
     * @return `this`
     */
    fun initialize() {
        editor.putBoolean(KEY_GROUP_INITIALIZED, true)
        editor.putString(KEY_REFRESH_TOKEN, null)
        editor.apply()
    }

    override fun toString() =
        "$TAG(initialized=$initialized, refreshToken=$refreshToken, idToken=$idToken, accessToken=$accessToken)"
}