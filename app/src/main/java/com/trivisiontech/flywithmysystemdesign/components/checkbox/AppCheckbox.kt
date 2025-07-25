package com.trivisiontech.flywithmysystemdesign.components.checkbox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trivisiontech.flywithmysystemdesign.tokens.AppSpacing

@Composable
fun AppCheckbox(checked: Boolean, onCheckedChange: (Boolean) -> Unit, label: String? = null) {
    Row(modifier = Modifier.padding(AppSpacing.small)) {
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
        label?.let { Text(it, modifier = Modifier.padding(start = AppSpacing.small)) }
    }
}