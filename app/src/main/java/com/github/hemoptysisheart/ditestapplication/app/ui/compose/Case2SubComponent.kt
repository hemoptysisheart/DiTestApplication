package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.Case2ViewModel
import java.time.format.DateTimeFormatter

private const val TAG = "Case2SubComponent"

@Composable
fun Case2SubComponent(viewModel: Case2ViewModel = viewModel()) {
    val timestamp = remember { mutableStateOf(viewModel.timestamp) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = DateTimeFormatter.ISO_INSTANT.format(timestamp.value))
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            timestamp.value = viewModel.refresh()
            Log.v(TAG, "refresh.onClick : viewModel=$viewModel")
        }) {
            Text(text = stringResource(R.string.label_refresh))
        }
    }
}

@Composable
@Preview
fun Case2SubComponentPreview() {
    Case2SubComponent()
}
