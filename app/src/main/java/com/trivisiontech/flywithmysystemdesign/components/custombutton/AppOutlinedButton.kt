package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppShapes
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTypography


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