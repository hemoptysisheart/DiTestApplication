package com.github.hemoptysisheart.ditestapplication.app.ui.compose

import android.util.Log
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private const val TAG = "SettingSummary"

/**
 * 설정 항목으로 표시하는 UI로, 클릭하면 해당 설정 항목으로 이동한다.
 *
 * @param
 */
@Composable
fun SettingSummary(label: String, summary: String? = null, onClick: () -> Unit = { Log.v(TAG, "#onClick") }) {
    Log.v(TAG, "#$TAG args : label=$label, summary=$summary, onClick=$onClick")

    // TODO Check label, summary length.

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Text(label)
        Spacer(Modifier.weight(1.0F))
        if (null != summary) {
            Text(text = summary, color = Color.LightGray, fontSize = 10.sp)
        }
    }
}

@Composable
@Preview
fun SettingSummaryPreview() {
    SettingSummary("설정 항목 이름", "설정 요약")
}