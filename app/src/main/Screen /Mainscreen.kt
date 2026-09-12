package com.mahakal.mobilehub.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MainScreen() {
    var selectedTab by remember { mutableStateOf(0) }

    val tabs = listOf(
        TabItem("Home", Icons.Default.Home),
        TabItem("Shop", Icons.Default.ShoppingCart),
        TabItem("Repair", Icons.Default.Build),
        TabItem("Account", Icons.Default.Person)
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                tabs.forEachIndexed { index, tab ->
                    NavigationBarItem(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        icon = { Icon(tab.icon, contentDescription = tab.title) },
                        label = { Text(tab.title) }
                    )
                }
            }
        }
    ) { padding ->
        when (selectedTab) {
            0 -> HomeScreen(Modifier = Modifier.padding(padding))
            1 -> ShopScreen(modifier = Modifier.padding(padding))
            2 -> RepairScreen(modifier = Modifier.padding(padding))
            3 -> AccountScreen(modifier = Modifier.padding(padding))
        }
    }
}

data class TabItem(val title: String, val icon: ImageVector)
