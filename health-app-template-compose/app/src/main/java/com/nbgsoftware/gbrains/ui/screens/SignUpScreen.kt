package com.nbgsoftware.gbrains.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nbgsoftware.gbrains.R
import com.nbgsoftware.gbrains.ui.theme.Background
import com.nbgsoftware.gbrains.ui.theme.Primary

@Preview(showBackground = true)
@Composable
fun SignUpScreen() {
    var textFullName by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var textUsername by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var textPassword by remember {
        mutableStateOf(TextFieldValue(""))
    }

    var textNumberPhone by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_back),
            contentDescription = "back",
            modifier = Modifier.padding(top = 16.dp, start = 12.dp)
        )
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Tạo tài khoản mới",
            textAlign = TextAlign.Center,
            color = Primary,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 72.dp),
            fontSize = 32.sp
        )

        TextField(
            value = textFullName,
            onValueChange = { textFullName = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp, start = 8.dp, end = 8.dp)
                .height(68.dp),
            label = { Text(text = "Họ tên") },
            placeholder = { Text(text = "Nhập họ tên") }
        )

        TextField(
            value = textUsername,
            onValueChange = { textUsername = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp)
                .height(68.dp),
            label = { Text(text = "Tên người dùng") },
            placeholder = { Text(text = "Nhập tên người dùng") }
        )

        TextField(
            value = textPassword,
            onValueChange = { textPassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp)
                .height(68.dp),
            label = { Text(text = "Mật khẩu") },
            placeholder = { Text(text = "Nhập mật khẩu") }
        )

        TextField(
            value = textNumberPhone,
            onValueChange = { textNumberPhone = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 8.dp, end = 8.dp)
                .height(68.dp),
            label = { Text(text = "Số điện thoại") },
            placeholder = { Text(text = "Nhập số điện thoại") }
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 13.dp, end = 13.dp)
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(Primary)
        ) {
            Text(
                text = "Đăng ký",
                fontSize = 26.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Background
            )
        }
    }
}