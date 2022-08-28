package com.github.hemoptysisheart.ditestapplication.app.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LauncherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    LauncherCompose()
                }
            }
        }
    }
}

@Composable
fun LauncherCompose() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { context.startActivity(Intent(context, Case1Activity::class.java)) }) {
            Text(text = stringResource(R.string.activity_case1_title))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { context.startActivity(Intent(context, Case2Activity::class.java)) }) {
            Text(text = stringResource(R.string.activity_case2_title))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { context.startActivity(Intent(context, Case3Activity::class.java)) }) {
            Text(text = stringResource(R.string.activity_case3_title))
        }
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = { context.startActivity(Intent(context, Case4Activity::class.java)) }) {
            Text(text = stringResource(R.string.activity_case4_title))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LauncherComposePreview() {
    DiTestApplicationTheme {
        LauncherCompose()
    }
}