package com.example.basecomponents.profile

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import com.example.basecomponents.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf("Option 1", "Option 2", "Option 3", "Option 4")
        val adapter = ArrayAdapter(requireContext(), R.layout.item_dropdown, items)

        val genderMenuItem = view.findViewById<AutoCompleteTextView>(R.id.gender_menu_item)
        genderMenuItem.setAdapter(adapter)
    }
}