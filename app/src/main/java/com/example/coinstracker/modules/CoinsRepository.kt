package com.example.coinstracker.modules

import com.example.coinstracker.api.CoinService
import com.example.coinstracker.pojo.Coins
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CoinsRepository {

    fun getCoins() {
        val retrofit = Retrofit.Builder().baseUrl("https://api.coinmarketcap.com")
            .addConverterFactory(GsonConverterFactory.create()).build()
        val service = retrofit.create(CoinService::class.java)
        val call = service.getCurrentCoinsData(2)
        call.enqueue(object: Callback<Coins>{
            override fun onResponse(call: Call<Coins>, response: Response<Coins>) {
                if(response.code() == 200){
                    val coinsResponse = response.body()
                    println(coinsResponse!!.id)
                    println(coinsResponse.name)
                    //print(coinsResponse.quotes!!.usd!!.price)
                }
            }

            override fun onFailure(call: Call<Coins>, t: Throwable) {

            }
        })
    }

}