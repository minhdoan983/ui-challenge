package com.example.uichallange.screens.challenge1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uichallange.R

@Preview(showSystemUi = true, showBackground = true, device = Devices.PIXEL_9)
@Composable
fun KidsBedtimeStory() {
    Scaffold(modifier = Modifier.fillMaxSize(), topBar = { AppBar() }) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(
                    paddingValues
                )
                .fillMaxSize()
                .background(Color.Black)
        ) {
            Content()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(
        actions = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .border(0.dp, Color.Transparent, RoundedCornerShape(19.dp))
                    .clip(RoundedCornerShape(19.dp))
                    .background(color = Color(0xFFFBEA76))
                    .padding(7.dp)
            ) {
                Icon(
                    tint = Color(0xFFE38406),
                    imageVector = Icons.Default.Star,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    "00",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                modifier = Modifier
                    .border(0.dp, Color.Transparent, RoundedCornerShape(50.dp))
                    .clip(RoundedCornerShape(50.dp))
                    .background(color = Color(0xFF4DA0CE))
                    .padding(7.dp),
                imageVector = Icons.Default.Person,
                tint = Color.White,
                contentDescription = null
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(Color.Black),
        title = { Text("Dream Tales", style = TextStyle(color = Color.White, fontSize = 20.sp)) })
}

@Composable
fun Content() {

    var searchText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = { Text("Search for a story") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .heightIn(min = 50.dp),
            shape = RoundedCornerShape(50.dp),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color(0xFF2C2C2E),
                cursorColor = Color.White,
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                unfocusedPlaceholderColor = Color.White
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.White
                )
            },
            suffix =
                {
                    Icon(
                        modifier = Modifier
                            .border(0.dp, Color.Transparent, RoundedCornerShape(50.dp))
                            .clip(RoundedCornerShape(50.dp))
                            .background(Color(0xFFFB803E))
                            .padding(2.dp),
                        imageVector = Icons.Default.Create,
                        contentDescription = null,
                        tint = Color.White,
                    )
                }
        )
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            ItemCard()
            ItemCard()
            ItemCard()
            ItemCard()
        }


    }
}

@Composable
fun ItemCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(60.dp),
            painter = painterResource(id = R.drawable.prophet),
            contentDescription = null,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(
                    RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = 50.dp,
                        bottomEnd = 50.dp
                    )
                )
                .background(Color(0xFF2D5A27))
                .padding(horizontal = 16.dp, vertical = 6.dp)
        ) {
            Text(
                text = "Prophets",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}
