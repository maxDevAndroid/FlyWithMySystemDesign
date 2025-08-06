package com.trivisiontech.checkbox

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trivisiontech.theme.AppSpacing
import com.trivisiontech.theme.AppTheme

@Composable
fun AppCheckbox(checked: Boolean, onCheckedChange: (Boolean) -> Unit, label: String? = null) {
    Row(modifier = Modifier.padding(AppSpacing.small)) {
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
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
fun AppCardPreview() {
    AppTheme {
        AppCheckbox(checked = true, onCheckedChange = {}, label = "AppCard Title")
    }
}