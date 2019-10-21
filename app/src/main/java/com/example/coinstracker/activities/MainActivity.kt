package com.example.coinstracker.activities

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.coinstracker.R
import com.example.coinstracker.adapters.GridLayoutAdapter
import com.example.coinstracker.modules.CoinsRepository
import com.example.coinstracker.presenters.MainScreenPresenter
import com.example.coinstracker.views.MainScreenView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.grid_element.view.*
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import moxy.presenter.ProvidePresenter

class MainActivity : MvpAppCompatActivity(), MainScreenView {

    private val applicationContext = this

    @InjectPresenter
    lateinit var mainScreenPresenter: MainScreenPresenter

    @ProvidePresenter
    fun provideMainScreenPresenter(): MainScreenPresenter{
        return MainScreenPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainGridContainer.adapter = GridLayoutAdapter(applicationContext)

        mainGridContainer.onItemClickListener = AdapterView.OnItemClickListener{_, view, _, _ ->
            val coinName = view.text.text.toString()
            val coinCost = view.coinCost.text.toString()
            mainScreenPresenter.printSmt(message = "$coinName costs $coinCost", view = view)
        }

        val repository = CoinsRepository()
        repository.getCoins()
    }

    override fun onSuccess(message: String, clickingView: View) {
        Snackbar.make(clickingView, message, Snackbar.LENGTH_SHORT).show()
    }
}
