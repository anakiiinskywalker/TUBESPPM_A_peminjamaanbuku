package com.example.manajemen_buku_perpus

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.manajemen_buku_perpus.ui.components.BottomNavBar
import com.example.manajemen_buku_perpus.ui.components.Screen
import com.example.manajemen_buku_perpus.ui.screens.MainScreen
import com.example.manajemen_buku_perpus.ui.screens.PengembalianBuku
import com.example.manajemen_buku_perpus.ui.screens.PinjamBuku


@Composable
fun ManajemenBukuPerpusApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {

    val scaffoldState = rememberScaffoldState()
    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavBar(navController)
        }


    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(paddingValues)
        ) {
            composable(Screen.Home.route) {
                MainScreen()
            }
            composable(Screen.Peminjaman.route) {
                PinjamBuku()
            }
            composable(Screen.Pengembalian.route) {
                PengembalianBuku()
            }

        }


    }
}