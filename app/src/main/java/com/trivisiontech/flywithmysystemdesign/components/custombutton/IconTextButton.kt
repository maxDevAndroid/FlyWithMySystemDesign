package com.trivisiontech.flywithmysystemdesign.components.custombutton

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun IconTextButton(icon: @Composable () -> Unit, text: String, onClick: () -> Unit) {
    Button(onClick = onClick, shape = RoundedCornerShape(8.dp)) {
        icon()
        Spacer(modifier = Modifier.width(8.dp))
        Text(text)
    }
}