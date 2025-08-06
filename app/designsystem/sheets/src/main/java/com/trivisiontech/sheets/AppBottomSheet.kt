package com.trivisiontech.sheets

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomSheet(content: @Composable ColumnScope.() -> Unit) {
    ModalBottomSheet(onDismissRequest = {}, content = content)
}

@Preview(showBackground = true)
@Composable
fun AppBottomSheetWrapperPreview() {
    AppBottomSheet {
        Text("Conteúdo do BottomSheet")
        Spacer(modifier = Modifier.height(8.dp))
        Button(onClick = {}) {
            Text("Ação")
        }
    }
}