package com.nbgsoftware.gbrains

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.nbgsoftware.gbrains.ui.screen.SignUpScreen
import com.nbgsoftware.gbrains.ui.theme.Background
import com.nbgsoftware.gbrains.ui.theme.GbrainsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            GbrainsComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Background
                ) {
                    SignUpScreen()
                }
            }
        }
    }
}
