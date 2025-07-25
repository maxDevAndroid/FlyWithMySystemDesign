package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppShapes

@Composable
fun AppExtendedFab(text: String, onClick: () -> Unit) {
    ExtendedFloatingActionButton(
        onClick = onClick,
        text = { Text(text) },
        icon = { Icon(Icons.Default.Add, contentDescription = null) },
        shape = AppShapes.large
    )
}