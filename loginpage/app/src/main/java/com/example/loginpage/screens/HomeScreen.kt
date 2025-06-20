package com.example.loginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.loginpage.R

data class Item(val title: String, val description: String)

@Composable
fun HomeScreen() {
    val items = listOf(
        Item("Elma", "Sağlıklı bir meyve"),
        Item("Muz", "Potasyum kaynağı"),
        Item("Portakal", "Bol C vitamini içerir")
    )

    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(items) { item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.asd),
                        contentDescription = item.title,
                        modifier = Modifier
                            .size(64.dp)
                            .padding(end = 16.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column {
                        Text(item.title, style = MaterialTheme.typography.titleMedium)
                        Text(item.description)
                    }
                }
            }
        }
    }
}
