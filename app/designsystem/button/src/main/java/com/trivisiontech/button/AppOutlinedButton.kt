package com.trivisiontech.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.theme.AppShapes
import com.trivisiontech.typography.AppTypography


@Composable
fun AppOutlinedButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    OutlinedButton(
        onClick = onClick,
        shape = AppShapes.medium,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary),
        modifier = modifier
    ) {
        Text(text, style = AppTypography.labelMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun AppOutlinedButtonPreview() {
    com.trivisiontech.theme.AppTheme {
        AppOutlinedButton(text = "Preview", onClick = {})
    }
}