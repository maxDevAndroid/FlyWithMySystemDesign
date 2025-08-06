package com.trivisiontech.button

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppTheme
import com.trivisiontech.typography.AppTypography


@Composable
fun AppElevatedButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedButton(onClick = onClick, modifier = modifier) {
        Text(text, style = AppTypography.labelMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun AppElevatedButtonPreview() {
    AppTheme {
        AppElevatedButton(
            text = "Test App Elevated Button",
            onClick = {}
        )
    }
}