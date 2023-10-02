package com.app.weekls

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.weekls.ui.theme.WeeklsTheme

class Splashscreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeeklsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF1A1824)
                ) {

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.padding(30.dp)
                    ) {

                        MultiStyleText()

                    }

                    Handler(Looper.getMainLooper()).postDelayed({
                        val mainIntent = Intent(this, MainActivity::class.java)
                        startActivity(mainIntent)
                        finish()
                    }, 6000)

                }
            }
        }
    }
}

@Composable
fun MultiStyleText() {
    Text(buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.White)) {
            append("You say you want")
        }
        withStyle(style = SpanStyle(color = Color.Red, fontWeight = FontWeight.Bold)) {
            append(" £100,000")
        }

        withStyle(style = SpanStyle(color = Color.White)) {
            append(" in one year by Oct. 1st 2024, what price are you willing to pay? Where is your scar? all heroes have scars")
        }

    })
}
