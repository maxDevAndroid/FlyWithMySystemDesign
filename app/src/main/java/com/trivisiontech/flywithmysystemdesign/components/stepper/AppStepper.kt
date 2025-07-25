package com.trivisiontech.flywithmysystemdesign.components.stepper

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
import com.trivisiontech.flywithmysystemdesign.ui.theme.AppTheme

@Composable
fun AppStepper(
    totalSteps: Int,
    currentStep: Int,
    onStepClick: ((Int) -> Unit)? = null
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        for (step in 1..totalSteps) {
            val isActive = step <= currentStep
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(
                        if (isActive) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(
                            alpha = 0.2f
                        )
                    )
                    .clickable(enabled = onStepClick != null) { onStepClick?.invoke(step) },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "$step",
                    color = if (isActive) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            if (step != totalSteps) {
                Spacer(
                    modifier = Modifier
                        .weight(1f)
                        .height(2.dp)
                        .background(
                            color = if (step < currentStep) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(
                                alpha = 0.2f
                            )
                        )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAppStepper() {
    AppTheme {
        var currentStep by remember { mutableStateOf(2) }
        Surface(modifier = Modifier.padding(16.dp)) {
            AppStepper(totalSteps = 5, currentStep = currentStep) { clickedStep ->
                currentStep = clickedStep
            }
        }
    }
}