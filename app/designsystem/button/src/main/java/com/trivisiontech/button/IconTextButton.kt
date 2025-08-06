package com.trivisiontech.button

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.icons.AppFilledIcons
import com.trivisiontech.theme.AppTheme

@Composable
fun IconTextButton(icon: @Composable () -> Unit, text: String, onClick: () -> Unit) {
    Button(onClick = onClick, shape = RoundedCornerShape(8.dp)) {
        icon()
        Spacer(modifier = Modifier.width(8.dp))
        Text(text)
    }
}

@Preview(showBackground = true)
@Composable
fun IconTextButtonPreview() {
    AppTheme {
        IconTextButton(
            icon = {
                Icon(
                    imageVector = AppFilledIcons.Home,
                    contentDescription = "Home",
                    modifier = Modifier
                        .size(18.dp)
                        .clickable { }
                        .padding(start = 4.dp)
                )
            },
            text = "IconTextButton",
            onClick = {}
        )
    }
}