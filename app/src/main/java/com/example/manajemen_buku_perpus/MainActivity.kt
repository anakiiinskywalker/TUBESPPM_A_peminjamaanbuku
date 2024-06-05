package com.example.manajemen_buku_perpus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.manajemen_buku_perpus.ui.screens.MainScreen
import com.example.manajemen_buku_perpus.ui.theme.ManajemenBukuPerpusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManajemenBukuPerpusTheme {
                Surface(
                    color = MaterialTheme.colors.background,
                ) {
                    ManajemenBukuPerpusApp()
                }
            }
        }
    }
}