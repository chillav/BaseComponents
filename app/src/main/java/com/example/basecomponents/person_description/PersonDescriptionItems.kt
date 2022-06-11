package com.example.basecomponents.person_description

sealed class PersonDescriptionItems {

    data class Title(
        val id: Int,
        val text: String
    ) : PersonDescriptionItems()

    data class Achievement(
        val id: Int,
        val message: String,
        val scores: String
    ) : PersonDescriptionItems()
}