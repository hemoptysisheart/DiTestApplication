package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.R
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.Case4ViewModel
import java.time.format.DateTimeFormatter

private const val TAG = "Case4SubComponent"

@Composable
fun Case4SubComponent(viewModel: Case4ViewModel = viewModel()) {
    var timestamp by remember { mutableStateOf(viewModel.timestamp()) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = DateTimeFormatter.ISO_INSTANT.format(timestamp))
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            timestamp = viewModel.update()
            Log.i(TAG, "#refresh.onClick : timestamp=$timestamp")
        }) {
            Text(text = stringResource(R.string.label_refresh))
        }
    }
}

@Composable
@Preview
fun Case4SubComponentPreview() {
    Case4SubComponent()
}
