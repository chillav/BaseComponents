package com.example.basecomponents.profile

enum class Gender(val title: String) {
    MALE(title = "Мужской"),
    FEMALE(title = "Женский");

    companion object {
        fun all() = listOf(MALE.title, FEMALE.title)
    }
}