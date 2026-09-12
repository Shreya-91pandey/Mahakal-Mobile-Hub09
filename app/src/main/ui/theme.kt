package com.mahakal.mobilehub.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PurplePrimary,
    secondary = PinkAccent,
    background = CreamBackground,
    surface = CardWhite,
    onPrimary = LightText,
    onSecondary = LightText,
    onBackground = DarkText,
    onSurface = DarkText
)

@Composable
fun MahakalMobileHubTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
