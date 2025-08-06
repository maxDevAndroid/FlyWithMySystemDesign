package com.trivisiontech.button

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppSpacing
import com.trivisiontech.theme.AppTheme

@Composable
fun AppRadio(selected: Boolean, onClick: () -> Unit, label: String? = null) {
    Row(modifier = Modifier.padding(AppSpacing.small)) {
        RadioButton(selected = selected, onClick = onClick)
        label?.let {
            Text(
                it,
                modifier = Modifier
                    .padding(start = AppSpacing.small)
                    .align(Alignment.CenterVertically)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppRadioPreview() {
    AppTheme {
        AppRadio(selected = true, onClick = {}, label = "App Radio")
    }
}