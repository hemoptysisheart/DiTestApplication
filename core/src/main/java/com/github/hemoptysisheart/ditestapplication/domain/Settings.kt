package com.github.hemoptysisheart.ditestapplication.domain

/**
 * 애플리케이션 전체의 설정.
 */
interface Settings {
    /**
     * OIDC 인증 관련 설정.
     */
    val auth: OidcAuthSetting
}