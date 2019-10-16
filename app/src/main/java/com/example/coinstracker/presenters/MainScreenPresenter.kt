package com.example.coinstracker.presenters

import android.view.View
import com.example.coinstracker.views.MainScreenView
import moxy.InjectViewState
import moxy.MvpPresenter

@InjectViewState
class MainScreenPresenter: MvpPresenter<MainScreenView>(){
    fun printSmt(message: String, view: View){
        viewState.onSuccess(message = message, clickingView = view)
    }
}