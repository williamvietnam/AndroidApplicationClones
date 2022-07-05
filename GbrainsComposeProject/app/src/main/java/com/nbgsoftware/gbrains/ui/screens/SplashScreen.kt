package com.nbgsoftware.gbrains.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nbgsoftware.gbrains.R
import com.nbgsoftware.gbrains.ui.theme.Primary

@Preview(showBackground = true)
@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(8.dp),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to my app",
            modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(bottom = 24.dp),
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            color = Primary,
            fontWeight = FontWeight.Bold
        )

        Image(
            painter = painterResource(id = R.drawable.thumbnail_splash),
            contentDescription = "image splash",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(256.dp)
        )

        Text(
            text = "This is my description for app... This is my description for app.... This is my description for app",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 12.dp, end = 12.dp)
                .align(CenterHorizontally),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = Primary
        )
    }
}