package com.nbgsoftware.gbrains.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.nbgsoftware.gbrains.R

@Preview(showBackground = true)
@Composable
fun BottomNavigationView() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .padding(start = 8.dp, end = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_home),
                contentDescription = "tab_home",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "HomePage", fontSize = 11.sp)
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_quiz),
                contentDescription = "tab_quiz",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Question", fontSize = 11.sp)
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_payment),
                contentDescription = "tab_payment",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Payment", fontSize = 11.sp)
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_notifications),
                contentDescription = "tab_notify",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Notification", fontSize = 11.sp)
        }

        Column(
            modifier = Modifier
                .weight(1f)
                .height(48.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_person),
                contentDescription = "tab_person",
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(24.dp)
            )
            Text(text = "Personal", fontSize = 11.sp)
        }
    }
}