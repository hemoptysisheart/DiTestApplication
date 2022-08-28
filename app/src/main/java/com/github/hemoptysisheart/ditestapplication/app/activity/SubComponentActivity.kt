package com.github.hemoptysisheart.ditestapplication.app.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.hemoptysisheart.ditestapplication.app.ui.compose.SubComponent
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme

class SubComponentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    SubComponentLayout()
                }
            }
        }
    }
}

@Composable
fun SubComponentLayout() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "SubComponent")
        SubComponent()
    }
}

@Preview(showBackground = true)
@Composable
fun SubComponentPreview() {
    DiTestApplicationTheme {
        SubComponentLayout()
    }
}