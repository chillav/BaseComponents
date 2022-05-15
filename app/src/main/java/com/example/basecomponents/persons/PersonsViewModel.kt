package com.example.basecomponents.persons

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonsViewModel : ViewModel() {
    val persons = MutableLiveData<List<String>>()

    init {
        persons.value = getListOfPersons()
    }

    private fun getListOfPersons(): List<String> {
        return listOf(
            "Ира", "Саша", "Вика",
            "Петя", "Таня", "Никита",
            "Вася", "Юра", "Артем",
            "Паша", "Максим", "Миша"
        )
    }
}