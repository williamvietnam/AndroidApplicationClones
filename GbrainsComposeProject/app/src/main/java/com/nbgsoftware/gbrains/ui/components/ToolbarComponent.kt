package com.nbgsoftware.gbrains.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nbgsoftware.gbrains.R

@Preview(showBackground = true)
@Composable
fun ToolbarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "back",
            modifier = Modifier
                .size(28.dp)
                .weight(1f)
        )

        Text(
            text = "Genius Brains",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            modifier = Modifier
                .weight(6f)
                .padding(start = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_setting),
            contentDescription = "setting",
            modifier = Modifier
                .size(28.dp)
                .weight(1f)
        )
    }
}