package com.trivisiontech.tooltip

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.theme.AppTheme

@SuppressLint("ReturnFromAwaitPointerEventScope")
@Composable
fun AppTooltip(
    tooltipText: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    var visible by remember { mutableStateOf(false) }

    Box(
        modifier = modifier.pointerInput(Unit) {
            awaitPointerEventScope {
                while (true) {
                    val event = awaitPointerEvent()
                    val isEnter = event.changes.any { it.pressed }
                    visible = isEnter
                }
            }
        }
    ) {
        content()

        if (visible) {
            Surface(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(4.dp),
                shape = RoundedCornerShape(8.dp),
                tonalElevation = 6.dp,
                shadowElevation = 6.dp
            ) {
                Text(
                    text = tooltipText,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppTooltip() {
    AppTheme {
        Box(modifier = Modifier.size(120.dp)) {
            AppTooltip(tooltipText = "Tooltip explicativo") {
                Text("Passe o mouse aqui")
            }
        }
    }
}
