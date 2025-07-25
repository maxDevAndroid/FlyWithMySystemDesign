package com.trivisiontech.flywithmysystemdesign.components.snackbar

import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

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

