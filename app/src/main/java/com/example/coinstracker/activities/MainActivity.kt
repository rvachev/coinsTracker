package com.example.coinstracker.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coinstracker.R
import com.example.coinstracker.adapters.GridLayoutAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainGridContainer.adapter = GridLayoutAdapter(this)
    }
}
