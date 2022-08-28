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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.app.TestViewModel
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    TestCompose()
                }
            }
        }
    }
}

@Composable
fun TestCompose(viewModel: TestViewModel = viewModel()) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = viewModel.text())
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            context.startActivity(Intent(context, SubComponentActivity::class.java))
        }) {
            Text(text = "SubComponent")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TestComposePreview() {
    DiTestApplicationTheme {
        TestCompose()
    }
}