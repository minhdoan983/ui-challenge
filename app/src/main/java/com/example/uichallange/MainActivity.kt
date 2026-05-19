package com.example.uichallange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.uichallange.screens.challenge1.KidsBedtimeStory
import com.example.uichallange.ui.theme.UIChallangeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIChallangeTheme {
                KidsBedtimeStory()
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL)
//@Composable
//fun GreetingPreview() {
//    UIChallangeTheme {
//        Greeting("Android")
//    }
//}