package com.app.weekls.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.weekls.dao.BehaviorDao
import com.app.weekls.data.Money

@Database(
    entities = [Money::class],
    version = 1
)

abstract class BehaviourDatabase : RoomDatabase(){
    abstract  val dao: BehaviorDao
}