package com.example.coinstracker.api

import com.example.coinstracker.pojo.Coins
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CoinService {

    @GET("/v2/ticker/?")
    fun getCurrentCoinsData(@Query("limit") limit: Int): Call<Coins>

}