package com.app.weekls.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.app.weekls.data.Money
import kotlinx.coroutines.flow.Flow

@Dao
interface BehaviorDao {

    @Upsert
    suspend fun upsertBalance(money:Money)

    //flow just like livedata is an observable. It notifies us when ever  there is a change on the returned object
    @Query("SELECT * FROM money")
    fun getBalance(): Flow<List<Money>>

}