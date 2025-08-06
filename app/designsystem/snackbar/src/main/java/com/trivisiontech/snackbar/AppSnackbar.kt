package com.trivisiontech.snackbar

import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppSnackbar(message: String, actionLabel: String? = null, onAction: (() -> Unit)? = null) {
    Snackbar(
        action = {
            actionLabel?.let {
                TextButton(onClick = { onAction?.invoke() }) {
                    Text(it)
                }
            }
        }
    ) {
        Text(message)
    }
}

@Preview(showBackground = true)
@Composable
fun AppSnackbarDirectPreview() {
    AppSnackbar(
        message = "Item adicionado com sucesso",
        actionLabel = "Desfazer",
        onAction = {}
    )
}
