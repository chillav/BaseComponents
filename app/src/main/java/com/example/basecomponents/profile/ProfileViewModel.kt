package com.example.basecomponents.profile

import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    val genders = Gender.all()
}