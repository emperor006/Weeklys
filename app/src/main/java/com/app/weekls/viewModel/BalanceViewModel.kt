package com.app.weekls.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.weekls.dao.BehaviorDao
import com.app.weekls.data.Money
import com.app.weekls.enums.SortType
import com.app.weekls.events.RewardEvents
import com.app.weekls.state.RewardState
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class BalanceViewModel(private val dao: BehaviorDao) : ViewModel() {

    //I believe the app can do without sortType
    private val _sortType = MutableStateFlow(SortType.ALL)

    private val _earnings = _sortType.flatMapLatest { sortType ->
        when (sortType) {
            SortType.ALL -> dao.getBalance()
            SortType.GETALL -> dao.getBalance()
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(), emptyList())

    private val _rewardState = MutableStateFlow(RewardState())

    val state = combine(_rewardState, _sortType, _earnings) { state, ortType, earnings ->
        state.copy(
            money = earnings,
            //balance = earnings.size,
            sortType = ortType
        )
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), RewardState())

    fun onEvent(event: RewardEvents) {
        when (event) {

            is RewardEvents.ManipulateBalance -> {
                val bal = state.value.balance ?: return;
                val money = Money(amount = bal)

                viewModelScope.launch {
                    dao.upsertBalance(money)
                }

                _rewardState.update {
                    it.copy(balance = 0)
                }
            }


            RewardEvents.SaveMoney -> {}


            is RewardEvents.SetNewBalance -> {
                _rewardState.update {
                    it.copy(
                        balance = event.newBal
                    )
                }
            }

            is RewardEvents.SortLolz -> {
                _sortType.value = event.sortType;
            }

        }

    }

}