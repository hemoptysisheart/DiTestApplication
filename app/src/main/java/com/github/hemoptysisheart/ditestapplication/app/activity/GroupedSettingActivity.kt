package com.github.hemoptysisheart.ditestapplication.app.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.ui.compose.GroupedSettings
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme

class GroupedSettingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    GroupedSetting()
                }
            }
        }
    }
}

@Composable
fun GroupedSetting() {
    Column {
        Text(text = stringResource(id = R.string.activity_grouped_setting_title))
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = R.string.activity_grouped_setting_description))
        GroupedSettings()
    }
}

@Preview(showBackground = true)
@Composable
fun GroupedSettingPreview() {
    DiTestApplicationTheme {
        GroupedSetting()
    }
}