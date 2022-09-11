package com.github.hemoptysisheart.ditestapplication.domain

/**
 * OIDC 인증정보.
 */
interface OidcAuthSetting {
    var refreshToken: String

    var idToken: String?

    var accessToken: String?

    fun refresh()
}