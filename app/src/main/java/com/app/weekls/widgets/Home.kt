package com.app.weekls

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.weekls.events.RewardEvents
import com.app.weekls.state.RewardState
import com.app.weekls.widgets.Tasks

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Home(
    state: RewardState,
    onEvent: (RewardEvents) -> Unit
) {

    return Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFF1A1824))
            .padding(20.dp),
    ) {
        Scoreboard(state, onEvent)

        Spacer(modifier = Modifier.height(15.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Task",
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Tasks(state = state, title = "It has to be my way or no other way", add = 1, subtract = 3, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Completing all calendar work today", add = 1, subtract = 3, onEvent =onEvent)
            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Missed a calendar activity", add = 0, subtract = 3, onEvent =onEvent)


            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Goofy laughing or Joke", add = 1, subtract = 2, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Putting someone in their place", add = 1, subtract = 2, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Masculine Frame and Voice", add = 2, subtract = 3, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Divide and assign task to others instead of doing it alone", add = 1, subtract = 2, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))
            Tasks(state = state, title = "No Youtube or social media", add = 0, subtract = 3, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))
            Tasks(state = state, title = "Did something scary", add = 1, subtract = 3, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Take a decision that favours me even though it hurts or inconveniences others", add = 3, subtract = 0, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Criticizing or advising others when they didn't ask for it", add = 2, subtract = 3, onEvent =onEvent)

            Spacer(modifier = Modifier.height(14.dp))

            Tasks(state = state, title = "Simping and borrowing others", add = 0, subtract = 4, onEvent =onEvent)

            Spacer(modifier = Modifier.height(20.dp))

            Tasks(state = state, title = "Talkative", add = 1, subtract = 2, onEvent =onEvent)

            Spacer(modifier = Modifier.height(20.dp))


            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    onEvent(RewardEvents.SetNewBalance(0))
                    onEvent(RewardEvents.ManipulateBalance(0))

                }) {
                Text(text = "Missed a day")
            }


        }


    }

}
