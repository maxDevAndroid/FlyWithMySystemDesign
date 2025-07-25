package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTypography

@Composable
fun AppTextButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    TextButton(onClick = onClick, modifier = modifier) {
        Text(text, style = AppTypography.labelMedium)
    }
}