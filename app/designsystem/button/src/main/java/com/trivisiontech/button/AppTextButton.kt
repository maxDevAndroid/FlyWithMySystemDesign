package com.trivisiontech.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppSpacing
import com.trivisiontech.theme.AppTheme
import com.trivisiontech.typography.AppTypography

@Composable
fun AppTextButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    TextButton(onClick = onClick, modifier = modifier) {
        Text(text, style = AppTypography.labelMedium)
    }
}


@Preview(showBackground = true)
@Composable
fun AppTextButtonPreview() {
    AppTheme {
        AppTextButton(
            text = "AppTextButton",
            onClick = {},
            modifier = Modifier.padding(AppSpacing.small)
        )
    }
}