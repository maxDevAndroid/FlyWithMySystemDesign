package com.trivisiontech.button

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppShapes
import com.trivisiontech.theme.AppTheme

@Composable
fun AppExtendedFab(text: String, onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        text = { Text(text) },
        icon = { Icon(Icons.Default.Add, contentDescription = null) },
        shape = AppShapes.large
    )
}

@Preview(showBackground = true)
@Composable
fun AppExtendedFabPreview() {
    AppTheme {
        AppExtendedFab(
            text = "Test App Extended Button",
            onClick = {}
        )
    }
}