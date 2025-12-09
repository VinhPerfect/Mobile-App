package com.example.vinhdev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.vinhdev.ui.theme.VinhdevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Kích hoạt tính năng hiển thị toàn màn hình
        setContent {
            VinhdevTheme { // Sử dụng theme của bạn
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Sử dụng Greeting composable để hiển thị thông điệp
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding) // Padding để tránh bị che khuất
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", // Hiển thị thông điệp
        modifier = modifier // Áp dụng modifier cho Text
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VinhdevTheme {
        Greeting("Android") // Preview khi chạy trong Android Studio
    }
}
