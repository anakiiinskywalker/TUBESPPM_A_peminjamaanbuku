package com.example.manajemen_buku_perpus.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

//private val DarkColorPalette = darkColors(
//    primary = BrandColor,
//    primaryVariant = BrandColor,
//    secondary = BrandColor
//)

private val LightColorPalette = lightColors(
    primary = BrandColor,
    primaryVariant = BrandColor,
    secondary = BrandColor

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ManajemenBukuPerpusTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
//    val colors = if (darkTheme) {
//        DarkColorPalette
//    } else {
//        LightColorPalette
//    }

    MaterialTheme(
//        colors = colors,
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}