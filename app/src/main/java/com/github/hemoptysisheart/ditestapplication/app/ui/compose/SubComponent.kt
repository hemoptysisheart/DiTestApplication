package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.hemoptysisheart.ditestapplication.app.viewmodel.SubComponentViewModel
import java.time.format.DateTimeFormatter

@Composable
fun SubComponent(viewModel: SubComponentViewModel = viewModel()) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = DateTimeFormatter.ISO_INSTANT.format(viewModel.timestamp.value), fontSize = 24.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = { viewModel.refresh() }) {
            Text(text = "REFRESH", fontSize = 24.sp)
        }
    }
}

@Composable
@Preview
fun SubComponentPreview() {
    SubComponent()
}