package com.nbgsoftware.gbrains.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nbgsoftware.gbrains.ui.theme.Background
import com.nbgsoftware.gbrains.ui.theme.Primary

@Preview(showBackground = true)
@Composable
fun SignInScreen() {
    var textUsername by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var textPassword by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 56.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            fontStyle = FontStyle.Normal,
            fontSize = 32.sp,
            text = "Đăng nhập",
            color = Primary,
            modifier = Modifier.padding(top = 32.dp),
            textAlign = TextAlign.Center
        )

        TextField(
            value = textUsername,
            onValueChange = { textUsername = it },
            label = { Text(text = "Tên người dùng") },
            placeholder = { Text(text = "Nhập tên người dùng") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 28.dp, start = 8.dp, end = 8.dp)
                .height(68.dp)
        )

        TextField(
            value = textPassword,
            onValueChange = { textPassword = it },
            label = { Text(text = "Mật khẩu") },
            placeholder = { Text(text = "Nhập mật khẩu") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, start = 8.dp, end = 8.dp)
                .height(68.dp)
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 16.dp)
                .height(56.dp),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Primary)
        ) {
            Text(
                text = "Đăng nhập",
                color = Background,
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Bạn chưa có tài khoản? ",
                fontSize = 16.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Black
            )
            Card(backgroundColor = Color.White, modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Đăng ký",
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Normal,
                    color = Primary
                )
            }
        }
    }
}