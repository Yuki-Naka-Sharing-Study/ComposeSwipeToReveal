package com.example.composeswipetoreveal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.composeswipetoreveal.ui.theme.ComposeSwipeToRevealTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeSwipeToRevealTheme {
                ContactScreen()
            }
        }
    }
}