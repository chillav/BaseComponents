package com.example.basecomponents.second

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.basecomponents.R

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val text = intent.getCharSequenceExtra("Text argument")

        text?.let {
            findViewById<TextView>(R.id.second_text).text = it
        }
    }
}