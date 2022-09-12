package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.hemoptysisheart.ditestapplication.R

@Composable
fun GroupedSettings() {
    Column(Modifier.fillMaxSize()) {
        Text(
            text = stringResource(R.string.setting_auth),
            modifier = Modifier
                .background(color = Color.LightGray)
                .fillMaxWidth()
                .padding(4.dp)
        )
        AuthSettingComponent()
    }
}

@Composable
@Preview
fun GroupedSettingsPreview() {
    GroupedSettings()
}