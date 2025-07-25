package com.trivisiontech.flywithmysystemdesign.components.sheets

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomSheet(content: @Composable ColumnScope.() -> Unit) {
    ModalBottomSheet(onDismissRequest = {}, content = content)
}