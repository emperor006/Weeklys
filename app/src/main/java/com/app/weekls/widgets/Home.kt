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

        Spacer(modifier = Modifier.height(20.dp))
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

        Spacer(modifier = Modifier.height(20.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            ListItem(
                text = {
                    Text(
                        text = "It has to be my way or no other way",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            val amount= if(state.money.size==1) state.money[0].amount + 1 else 1
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
                            val amount= if(state.money.size==1) state.money[0].amount - 3 else -3
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

            Spacer(modifier = Modifier.height(14.dp))
            ListItem(
                text = {
                    Text(
                        text = "Completing calendar work today",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 1 else 1
                            onEvent(RewardEvents.SetNewBalance(amount))
                            onEvent(RewardEvents.ManipulateBalance(amount))

                        }
                        ) {
                            Text(
                                text = "+",
                                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp)
                            )
                        }

                        Spacer(modifier = Modifier.width(20.dp))

                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount - 3 else -3
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
            Spacer(modifier = Modifier.height(14.dp))

            ListItem(
                text = {
                    Text(
                        text = "Goofy laughing or Joke",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 1 else 1
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
                            var amount= if(state.money.size==1) state.money[0].amount - 2 else -2
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
            Spacer(modifier = Modifier.height(14.dp))

            ListItem(
                text = {
                    Text(
                        text = "Putting someone in their place",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 1 else 1

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
                            var amount= if(state.money.size==1) state.money[0].amount - 2 else -2
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

            Spacer(modifier = Modifier.height(14.dp))

            ListItem(
                text = {
                    Text(
                        text = "Masculine Frame and Voice",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 2 else 2
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
                            var amount= if(state.money.size==1) state.money[0].amount - 3 else -3
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

            Spacer(modifier = Modifier.height(14.dp))

            ListItem(
                text = {
                    Text(
                        text = "Divide and assign task to others instead of doing it alone",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 1 else 1
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
                            var amount= if(state.money.size==1) state.money[0].amount - 1 else -2
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

            Spacer(modifier = Modifier.height(14.dp))


            ListItem(
                text = {
                    Text(
                        text = "No Youtube or social media",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 2 else 2

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
                            var amount= if(state.money.size==1) state.money[0].amount - 3 else -3

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

            Spacer(modifier = Modifier.height(14.dp))

            ListItem(
                text = {
                    Text(
                        text = "Did something scary",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 1 else 1
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
                            var amount= if(state.money.size==1) state.money[0].amount - 1 else -1

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
            Spacer(modifier = Modifier.height(14.dp))
            ListItem(
                text = {
                    Text(
                        text = "Take a decision that favours me even though it hurts or inconveniences others",
                        style = TextStyle(color = Color.White)
                    )
                },
                trailing = {
                    Row() {
                        Button(onClick = {
                            var amount= if(state.money.size==1) state.money[0].amount + 3 else 3

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
                            var amount= if(state.money.size==1) state.money[0].amount - 1 else 0
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
