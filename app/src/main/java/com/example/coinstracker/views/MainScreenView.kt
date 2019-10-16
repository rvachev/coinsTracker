package com.example.coinstracker.views

import android.view.View
import moxy.MvpView
import moxy.viewstate.strategy.OneExecutionStateStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(value = OneExecutionStateStrategy::class)
interface MainScreenView: MvpView {

    fun onSuccess(message: String, clickingView: View)

}