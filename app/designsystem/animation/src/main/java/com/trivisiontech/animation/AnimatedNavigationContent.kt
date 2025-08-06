package com.trivisiontech.animation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable

@Composable
fun AnimatedNavigationContent(
    currentScreen: String,
    content: @Composable (String) -> Unit
) {
    AnimatedContent(
        targetState = currentScreen,
        transitionSpec = {
            (fadeIn(tween(300)) + slideInHorizontally { it }).togetherWith(fadeOut(tween(300)) + slideOutHorizontally { -it })
        }, label = ""
    ) { screen ->
        content(screen)
    }
}
