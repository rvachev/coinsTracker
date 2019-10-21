package com.example.coinstracker.pojo

import com.google.gson.annotations.SerializedName

class Coins {

    @SerializedName("id")
    var id: Int? = null
    @SerializedName("name")
    var name: String? = null
    @SerializedName("quotes")
    var quotes: Quotes? = null

}

class Quotes{
    @SerializedName("USD")
    var usd: USD? = null
}

class USD{
    @SerializedName("price")
    var price: Double? = null
}