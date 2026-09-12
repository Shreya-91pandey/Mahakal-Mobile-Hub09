package com.mahakal.mobilehub.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahakal.mobilehub.ui.theme.PurplePrimary
import com.mahakal.mobilehub.ui.theme.OrangeOffer

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Mahakal Mobile Hub",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = PurplePrimary
            )
            Text(
                text = "Indore • 2 Hour Delivery Available",
                fontSize = 14.sp,
                color = OrangeOffer
            )
        }

        item {
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = OrangeOffer)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Special Offer", color = androidx.compose.ui.graphics.Color.White, fontWeight = FontWeight.Bold)
                    Text("New & Refurbished Mobiles • Best Price Guaranteed", color = androidx.compose.ui.graphics.Color.White)
                }
            }
        }

        item {
            Text("Categories", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                CategoryChip("Smartphones")
                CategoryChip("Refurbished")
                CategoryChip("Accessories")
            }
        }

        item {
            Text("Popular Mobiles", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Composable
fun CategoryChip(text: String) {
    AssistChip(
        onClick = { },
        label = { Text(text) }
    )
}
