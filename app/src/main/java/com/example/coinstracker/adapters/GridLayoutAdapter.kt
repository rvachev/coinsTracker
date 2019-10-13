package com.example.coinstracker.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.coinstracker.R
import kotlinx.android.synthetic.main.grid_element.view.*

class GridLayoutAdapter(private var context: Context) : BaseAdapter(){

    private val listData = arrayListOf("Bitcoin", "StarCoin", "VK Coin", "BuzCoin", "Bitcoin", "StarCoin", "VK Coin", "BuzCoin", "Bitcoin", "StarCoin", "VK Coin", "BuzCoin")
    private val listCost = arrayListOf("10563.12$", "1067.76$", "1.56$", "0.89$", "10563.12$", "1067.76$", "1.56$", "0.89$", "10563.12$", "1067.76$", "1.56$", "0.89$")

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val coinContainer: View
        if(convertView == null){
            val view: View = View.inflate(context, R.layout.grid_element, null)
            view.text.text = listData[position]
            view.coinCost.text = listCost[position]
            coinContainer = view
        }else{
            coinContainer = convertView
        }
        return coinContainer
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listData.size
    }
}