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
import com.github.hemoptysisheart.ditestapplication.app.ui.compose.Case3SubComponent
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * 1. Activity -> Compose -> Compose -> ViewModel -> Model
 * 2. 유저 인터렉션으로 ViewModel을 거쳐 Model 속성값 변경.
 */
@AndroidEntryPoint
class Case3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Case3Layout()
                }
            }
        }
    }
}

@Composable
fun Case3Layout() {
    Column(Modifier.fillMaxSize()) {
        Text(text = stringResource(R.string.activity_case3_title))
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = stringResource(R.string.activity_case3_description))
        Case3SubComponent()
    }
}

@Preview(showBackground = true)
@Composable
fun Case3LayoutPreview() {
    DiTestApplicationTheme {
        Case3Layout()
    }
}