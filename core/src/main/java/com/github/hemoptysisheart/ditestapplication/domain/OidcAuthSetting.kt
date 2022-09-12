package com.github.hemoptysisheart.ditestapplication.domain

/**
 * OIDC 인증정보.
 */
interface OidcAuthSetting {
    /**
     * OIDC Refresh token.
     * 리프레시 토큰을 발행하지 않은 경우엔 `null`.
     */
    var refreshToken: String?

    /**
     * OIDC ID token.
     *
     * 리프레시 해서 유효한 토큰을 발급받지 않은 경우 `null`.
     */
    var idToken: String?

    /**
     * OIDC Access token.
     *
     * 리프레시 해서 유효한 토큰을 발급받지 않은 경우 `null`.
     */
    var accessToken: String?

    /**
     * 리프레시 토큰을 유효한 ID 토큰과 액세스 토큰으로 교환하기.
     */
    fun refresh()
}