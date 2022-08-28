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
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.Case3ViewModel
import java.time.format.DateTimeFormatter

@Composable
fun Case3SubComponent(viewModel: Case3ViewModel = viewModel()) {
    val TAG = "Case3SubComponent"
    var instant by remember { mutableStateOf(viewModel.refresh()) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = DateTimeFormatter.ISO_INSTANT.format(instant))
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {
            instant = viewModel.refresh()
            Log.v(TAG, "#refresh.onClick : instant=$instant")
        }) {
            Text(text = stringResource(R.string.label_refresh))
        }
    }
}

@Composable
@Preview
private fun Case3SubComponentPreview() {
    Case3SubComponent()
}
