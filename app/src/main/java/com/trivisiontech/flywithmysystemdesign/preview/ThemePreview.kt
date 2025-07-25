package com.trivisiontech.flywithmysystemdesign.preview

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.flywithmysystemdesign.components.custombutton.AppButton
import com.trivisiontech.flywithmysystemdesign.components.indicator.AppLoadingIndicator
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTheme

@Preview(showBackground = true)
@Composable
fun LightThemePreview() {
    AppTheme(darkTheme = false) {
        Column(modifier = Modifier.padding(16.dp)) {
            AppButton(text = "Light Button", onClick = {})
            Spacer(modifier = Modifier.height(16.dp))
            AppLoadingIndicator(visible =true)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DarkThemePreview() {
    AppTheme(darkTheme = true) {
        Column(modifier = Modifier.padding(16.dp)) {
            AppButton(text = "Dark Button", onClick = {})
            Spacer(modifier = Modifier.height(16.dp))
            AppLoadingIndicator(true)
        }
    }
}
