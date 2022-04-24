package com.example.basecomponents.persons

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

class PersonFragment : Fragment(R.layout.fragment_pesons) {
    private val persons = listOf(
        "Ира",
        "Саша",
        "Вика",
        "Петя",
        "Таня",
        "Никита",
        "Вася",
        "Юра",
        "Артем",
        "Паша",
        "Максим",
        "Миша"
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = PersonsAdapter()
        adapter.persons = persons
        val recycle = view.findViewById<RecyclerView>(R.id.recycler)
        recycle.adapter = adapter

        super.onViewCreated(view, savedInstanceState)
    }
}