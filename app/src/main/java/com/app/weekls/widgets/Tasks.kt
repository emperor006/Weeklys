package com.app.weekls.widgets

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.weekls.events.RewardEvents
import com.app.weekls.state.RewardState

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Tasks(
          state:RewardState,
          title: String,
          add:Int,
          subtract:Int,
          onEvent: (RewardEvents) -> Unit
){

  return  ListItem(
        text = {
            Text(
                text = title,
                style = TextStyle(color = Color.White)
            )
        },
        trailing = {
            Row() {
                Button(onClick = {
                    var amount= if(state.money.size==1) state.money[0].amount + add else add
                    onEvent(RewardEvents.SetNewBalance(amount))
                    onEvent(RewardEvents.ManipulateBalance(amount))

                }) {
                    Text(
                        text = "+",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    )
                }

                Spacer(modifier = Modifier.width(20.dp))

                Button(onClick = {
                    var amount= if(state.money.size==1) state.money[0].amount - subtract else -subtract

                    onEvent(RewardEvents.SetNewBalance(amount))
                    onEvent(RewardEvents.ManipulateBalance(amount))

                }) {
                    Text(
                        text = "-",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                    )

                }

            }

        }
    )

}