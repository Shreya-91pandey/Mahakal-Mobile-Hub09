package com.mahakal.mobilehub.ui.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AccountScreen(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Account & Support", fontSize = 22.sp, fontWeight = FontWeight.Bold)

        Text("For any enquiry or custom order, contact us on WhatsApp.")

        Button(
            onClick = {
                val url = "https://wa.me/91XXXXXXXXXX" // yahan apna number daalna
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Chat on WhatsApp")
        }

        Text(
            "Admin Note: Photos, prices aur offers GitHub se update kiye ja sakte hain.",
            style = MaterialTheme.typography.bodySmall
        )
    }
}
