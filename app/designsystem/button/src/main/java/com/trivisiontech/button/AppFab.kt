package com.trivisiontech.button

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppShapes
import com.trivisiontech.theme.AppTheme


@Composable
fun AppFab(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick, shape = AppShapes.large) {
        Icon(Icons.Default.Add, contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun AppFabPreview() {
    AppTheme {
        AppFab(
            onClick = {}
        )
    }
}