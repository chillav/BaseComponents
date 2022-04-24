package com.example.basecomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.basecomponents.persons.PersonFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<PersonFragment>(R.id.fragment_container)
        }

    }
}
