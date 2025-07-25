package com.trivisiontech.flywithmysystemdesign.components.animation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.runtime.Composable

@Composable
fun AnimatedNavigationContent(
    currentScreen: String,
    content: @Composable (String) -> Unit
) {
    AnimatedContent(
        targetState = currentScreen,
        transitionSpec = {
            fadeIn(tween(300)) + slideInHorizontally { it } with
                    fadeOut(tween(300)) + slideOutHorizontally { -it }
        }, label = ""
    ) { screen ->
        content(screen)
    }
}
