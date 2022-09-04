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
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * 1. Activity -> Compose -> Compose -> ViewModel -> Model -> SharedPreference
 * 2. `SharedPreferences`를 사용한 데이터 변경.
 */
@AndroidEntryPoint
class Case4Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Case4Layout()
                }
            }
        }
    }
}

@Composable
fun Case4Layout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = stringResource(R.string.activity_case4_title))
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = stringResource(R.string.activity_case4_description))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DiTestApplicationTheme {
        Case4Layout()
    }
}