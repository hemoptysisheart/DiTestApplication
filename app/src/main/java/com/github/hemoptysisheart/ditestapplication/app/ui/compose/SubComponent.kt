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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.SubComponentViewModel
import java.time.format.DateTimeFormatter

const val TAG = "SubComponent"

@Composable
fun SubComponent(viewModel: SubComponentViewModel = viewModel()) {
    val timestamp = remember { mutableStateOf(viewModel.timestamp) }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = DateTimeFormatter.ISO_INSTANT.format(timestamp.value),
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            timestamp.value = viewModel.refresh()
            Log.v(TAG, "refresh.onClick : viewModel=$viewModel")
        }) {
            Text(text = "REFRESH", fontSize = 24.sp)
        }
    }
}

@Composable
@Preview
fun SubComponentPreview() {
    SubComponent()
}