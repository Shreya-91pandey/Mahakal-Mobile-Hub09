package com.mahakal.mobilehub.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ShopScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text("All Products", fontSize = 22.sp, fontWeight = FontWeight.Bold)
            Text("Indore: COD + 2 Hour Delivery | All India: Prepaid Only", style = MaterialTheme.typography.bodySmall)
        }

        items(6) {
            ProductCard(
                name = "Sample Mobile ${it + 1}",
                price = "₹${(12000 + it * 3000)}"
            )
        }
    }
}

@Composable
fun ProductCard(name: String, price: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(name, fontWeight = FontWeight.Medium)
                Text(price, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.Bold)
            }
            Button(onClick = { }) {
                Text("View")
            }
        }
    }
}
