package com.app.weekls.events

import com.app.weekls.enums.SortType

sealed interface RewardEvents {

    object SaveMoney: RewardEvents
    data class ManipulateBalance(val newBal:Int): RewardEvents
    data class SetNewBalance(val newBal:Int):RewardEvents
    data class SortLolz(val sortType: SortType): RewardEvents

}