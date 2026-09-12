package com.mahakal.mobilehub.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RepairScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Mobile Repair Services", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        ServiceCard("Screen Replacement", "Starting ₹999")
        ServiceCard("Battery Replacement", "Starting ₹799")
        ServiceCard("Software Issue", "Starting ₹399")
        ServiceCard("Water Damage", "Starting ₹1499")
    }
}

@Composable
fun ServiceCard(title: String, price: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(title, fontWeight = FontWeight.SemiBold)
            Text(price, color = MaterialTheme.colorScheme.primary)
        }
    }
}
