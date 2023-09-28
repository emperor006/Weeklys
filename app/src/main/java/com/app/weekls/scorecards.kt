package com.app.weekls

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Scoreboard() {
    return Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .background(color = Color(0xFF1A1824)),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.Green),
        backgroundColor = Color(0xFF1A1824),
        elevation = 6.dp
    ) {
        Column() {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                text = "Sneakers and Clothes, Gym membership worth £1,000",
                style = TextStyle(color = Color.White),
                textAlign = TextAlign.Center
            )

//on days you are going to an activity or event that you might fall back to
// old behavious, a functionality to increase the reward for those special days.
// a guy that is looking to quit alcohol might increase the reward if he is stepping out for a friends birthday party

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center

            ) {
                Text(text = "Score: ", style = TextStyle(color = Color.White, fontSize = 20.sp))
                Text(
                    text = "£0",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 20.sp
                    )
                )
            }


        }
    }
}