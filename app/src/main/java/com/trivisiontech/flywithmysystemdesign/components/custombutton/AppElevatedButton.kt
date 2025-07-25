package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTypography


@Composable
fun AppElevatedButton(text: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    ElevatedButton(onClick = onClick, modifier = modifier) {
        Text(text, style = AppTypography.labelMedium)
    }
}