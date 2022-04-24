package com.example.basecomponents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import com.example.basecomponents.second.SecondActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val buttonNext = findViewById<Button>(R.id.button_next)

        buttonNext.setOnClickListener {
            val editText = findViewById<EditText>(R.id.edit_text)
            val text = editText.text

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("Text argument", text)
            startActivity(intent)
        }
    }
}