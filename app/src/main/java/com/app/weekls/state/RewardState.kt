package com.app.weekls.state

import com.app.weekls.data.Money
import com.app.weekls.enums.SortType

data class RewardState(
    val money:List<Money> = emptyList(),
    val balance: Int = 0,
    val sortType: SortType=SortType.ALL
    )

