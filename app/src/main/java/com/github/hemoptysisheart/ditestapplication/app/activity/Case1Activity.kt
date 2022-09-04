package com.github.hemoptysisheart.ditestapplication.app.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.ui.theme.DiTestApplicationTheme
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.Case1ViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Activity -> Compose -> ViewModel -> Model 의존성을 가지고 모델이 제공하는 값을 화면에 출력하기.
 */
@AndroidEntryPoint
class Case1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiTestApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Case1Layout()
                }
            }
        }
    }
}

@Composable
fun Case1Layout(viewModel: Case1ViewModel = viewModel()) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = stringResource(R.string.activity_case1_title))
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = stringResource(R.string.activity_case1_description))
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = viewModel.text())
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Case1Preview() {
    DiTestApplicationTheme {
        Case1Layout()
    }
}