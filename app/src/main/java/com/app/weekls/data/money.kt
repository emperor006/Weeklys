package com.app.weekls.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Money(
    val amount:Int,
    @PrimaryKey(autoGenerate = true)
    val id:Int=0,
)