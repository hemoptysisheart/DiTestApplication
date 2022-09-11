package com.github.hemoptysisheart.ditestapplication.app.ui.compose

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
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.Case5ViewModel

@Composable
fun Case5SubComponent(viewModel: Case5ViewModel = viewModel()) {
    var counter by remember { mutableStateOf(viewModel.counter) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$counter")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text = stringResource(id = R.string.label_refresh))
        }
    }
}

@Composable
@Preview
fun Case5SubComponentPreview() {
    Case5SubComponent()
}
