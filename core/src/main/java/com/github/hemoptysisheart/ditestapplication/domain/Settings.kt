package com.github.hemoptysisheart.ditestapplication.domain

import android.net.Uri

/**
 * 애플리케이션 전체의 설정.
 */
interface Settings {
    /**
     * OIDC 인증 관련 설정.
     */
    val auth: OidcAuthSetting

    /**
     * OIDC 초기 인증정보 저장.
     */
    fun initOidc(authorizeUrl: Uri, refreshToken: String)
}