package com.example.manajemen_buku_perpus.ui.components

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Peminjaman : Screen("peminjaman")
    object Pengembalian : Screen("pengembalian")
}