package com.trivisiontech.chips

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppTagChip(
    text: String,
    selected: Boolean = false,
    onClick: (() -> Unit)? = null,
    onClose: (() -> Unit)? = null
) {
    val backgroundColor =
        if (selected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surfaceVariant
    val contentColor =
        if (selected) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant

    Surface(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .clickable(enabled = onClick != null) { onClick?.invoke() }
            .padding(horizontal = 8.dp, vertical = 4.dp),
        color = backgroundColor,
        contentColor = contentColor
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text, fontSize = 14.sp)
            onClose?.let {
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "Close",
                    modifier = Modifier
                        .size(18.dp)
                        .clickable { it.invoke() }
                        .padding(start = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppTagChip() {
    MaterialTheme {
        var selected by remember { mutableStateOf(false) }
        Column {
            AppTagChip(
                text = "Tag Chip",
                selected = selected,
                onClick = { selected = !selected },
                onClose = { /* close */ })
            Spacer(Modifier.height(16.dp))
            AppTagChip(text = "Assist Chip", selected = false, onClick = { /* do something */ })
        }
    }
}
