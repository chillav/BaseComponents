package com.example.basecomponents.person_description

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

class PersonDescriptionFragment : Fragment(R.layout.fragment_person_description) {

    private val mockedData = listOf(
        PersonDescriptionItems.Title(0, "Прыжок 10 метров"),
        PersonDescriptionItems.Achievement(1, "ddddddddddd", "100"),
        PersonDescriptionItems.Achievement(2, "sssssssssss", "12"),
        PersonDescriptionItems.Achievement(3, "aaaaaaaaaaa", "42"),
        PersonDescriptionItems.Title(4, "Бег 1000 метров"),
        PersonDescriptionItems.Achievement(5, "вывывывфыв", "312312"),
        PersonDescriptionItems.Achievement(6, "aaaaaaaфуфывфывaaaa", "123213"),
        PersonDescriptionItems.Title(4, "Заплыв 400 метров"),
        PersonDescriptionItems.Achievement(1, "фывфы", "100"),
        PersonDescriptionItems.Achievement(2, "ssssвф2у13sssssss", "152"),
        PersonDescriptionItems.Achievement(3, "aaaaa124215aaaaaa", "432"),
        PersonDescriptionItems.Achievement(1, "ddddd123123dddddd", "1300"),
        PersonDescriptionItems.Achievement(2, "ssssцsssssss", "122"),
        PersonDescriptionItems.Achievement(3, "aaaaa125132aaaaaa", "412"),
    )


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = PersonDescriptionAdapter()
        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = adapter
        adapter.items = mockedData
    }
}