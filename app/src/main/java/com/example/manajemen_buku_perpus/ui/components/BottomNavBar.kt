package com.example.manajemen_buku_perpus.ui.components

import com.example.manajemen_buku_perpus.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Payment
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.manajemen_buku_perpus.ui.components.Screen


@Composable
fun BottomNavBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier,
    ) {
        val itemNavs = listOf(
            ItemNav(
                name = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            ItemNav(
                name = stringResource(R.string.menu_pinjam),
                icon = Icons.Default.DateRange,
                screen = Screen.Peminjaman
            ),
            ItemNav(
                name = stringResource(R.string.menu_return),
                icon = Icons.Default.CheckCircle,
                screen = Screen.Pengembalian,

                ),
        )
        itemNavs.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.name
                    )
                },
                label = { Text(item.name
                ) },
                selected = false,
                onClick = {
                    navController.navigate(item.screen.route) {
                        // popUpTo berfungsi saat tombol back ditekan, dia akan langsung ke halaman awal (startDestination)
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }

                }
            )
        }
    }
}


data class ItemNav(
    val name: String,
    val icon: ImageVector,
    val screen: Screen
)