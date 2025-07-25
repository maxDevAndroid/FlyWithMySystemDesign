package com.trivisiontech.flywithmysystemdesign.components.custombutton.ratiobutton

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.trivisiontech.flywithmysystemdesign.tokens.AppSpacing

@Composable
fun AppRadio(selected: Boolean, onClick: () -> Unit, label: String? = null) {
    Row(modifier = Modifier.padding(AppSpacing.small)) {
        RadioButton(selected = selected, onClick = onClick)
        label?.let { Text(it, modifier = Modifier.padding(start = AppSpacing.small)) }
    }
}