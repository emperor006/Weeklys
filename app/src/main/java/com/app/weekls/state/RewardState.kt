package com.app.weekls.state

import com.app.weekls.data.Money
import com.app.weekls.enums.SortType

class RewardState(
    var money:List<Money> = emptyList(),
    var balance: Int = 0,
    var sortType: SortType=SortType.ALL
    )

