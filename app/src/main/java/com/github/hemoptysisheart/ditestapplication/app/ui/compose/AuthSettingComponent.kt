package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.AuthSettingViewModel

private const val TAG = "AuthSettingComponent"

@Composable
fun AuthSettingComponent(viewModel: AuthSettingViewModel = viewModel()) {
    val oidcAuthorized by remember { mutableStateOf(viewModel.oidcAuthorized) }
    Column(modifier = Modifier.fillMaxSize()) {
        SettingSummary(
            label = stringResource(R.string.setting_auth_oidc),
            summary = if (oidcAuthorized) {
                stringResource(R.string.setting_auth_oidc_authorized)
            } else {
                stringResource(id = R.string.setting_auth_oidc_unauthorized)
            },
            onClick = {
                Log.i(TAG, "#auth.onClick open auth setting.")
            }
        )
    }
}

@Composable
@Preview
fun AuthSettingComponentPreview() {
    AuthSettingComponent()
}