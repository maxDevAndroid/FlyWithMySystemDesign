package com.trivisiontech.flywithmysystemdesign.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.ui.Modifier

object AppAnimations {
    val fast = 100
    val medium = 300
    val slow = 600
}
fun Modifier.fadeInOut(duration: Int = AppAnimations.medium): Modifier {
    return this.then(Modifier.animateContentSize(animationSpec = tween(duration)))
}