package com.trivisiontech.card

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trivisiontech.theme.AppTheme

@Composable
fun RevealCard(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val elevation by animateDpAsState(targetValue = if (expanded) 12.dp else 4.dp, label = "")
    val alpha by animateFloatAsState(targetValue = if (expanded) 1f else 0.9f, label = "")

    Card(
        modifier = modifier
            .fillMaxWidth()
            .graphicsLayer(alpha = alpha)
            .clickable {
                expanded = !expanded
                onClick()
            },
        elevation = CardDefaults.cardElevation(elevation)
    ) {
        Column(Modifier.padding(16.dp), content = content)
    }
}

@Preview(showBackground = true)
@Composable
fun RevealCardPreview() {
    AppTheme {
        RevealCard(modifier = Modifier, onClick = {}, content = {})
    }
}
