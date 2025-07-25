package com.trivisiontech.flywithmysystemdesign.components.card

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.trivisiontech.flywithmysystemdesign.tokens.AppSpacing

@Composable
fun AppCard(title: String, content: String) {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        modifier = Modifier
            .fillMaxWidth()
            .padding(AppSpacing.medium)
    ) {
        Column(modifier = Modifier.padding(AppSpacing.large)) {
            Text(title, style = MaterialTheme.typography.titleLarge)
            Spacer(Modifier.height(AppSpacing.small))
            Text(content, style = MaterialTheme.typography.bodyMedium)

        }
    }
}






