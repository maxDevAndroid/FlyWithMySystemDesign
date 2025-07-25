package com.trivisiontech.flywithmysystemdesign.components.animation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trivisiontech.flywithmysystemdesign.components.card.RevealCard
import kotlinx.coroutines.delay

@Composable
fun StaggeredList(
    items: List<String>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        itemsIndexed(items) { index, item ->
            val delayMillis = index * 100
            var visible by remember { mutableStateOf(false) }
            LaunchedEffect(Unit) {
                delay(delayMillis.toLong())
                visible = true
            }
            AnimatedVisibility(
                visible = visible,
                enter = fadeIn(animationSpec = tween(500)) + slideInVertically { it / 2 }
            ) {
                RevealCard(modifier = Modifier.padding(8.dp)) {
                    Text(item, style = MaterialTheme.typography.bodyLarge)
                }
            }
        }
    }
}
