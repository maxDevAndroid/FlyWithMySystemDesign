package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppShapes


@Composable
fun AppFab(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick, shape = AppShapes.large) {
        Icon(Icons.Default.Add, contentDescription = null)
    }
}