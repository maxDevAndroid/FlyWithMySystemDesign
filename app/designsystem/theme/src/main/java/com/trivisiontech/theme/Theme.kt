package com.trivisiontech.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.trivisiontech.typography.AppTypography

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = DarkColors.Primary,
            onPrimary = DarkColors.OnPrimary,
            secondary = DarkColors.Secondary,
            background = DarkColors.Background,
            surface = DarkColors.Surface,
            error = DarkColors.Error,
            outline = DarkColors.Outline
        )
    } else {
        lightColorScheme(
            primary = LightColors.Primary,
            onPrimary = LightColors.OnPrimary,
            secondary = LightColors.Secondary,
            background = LightColors.Background,
            surface = LightColors.Surface,
            error = LightColors.Error,
            outline = LightColors.Outline
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}
