package com.example.basecomponents.profile

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.basecomponents.R
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private val viewModel: ProfileViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArrayAdapter(
            requireContext(),
            R.layout.item_dropdown,
            viewModel.genders
        )

        val genderMenuItem = view.findViewById<AutoCompleteTextView>(R.id.gender_menu_item)
        genderMenuItem.setAdapter(adapter)

        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val birthdayAreaClick = view.findViewById<View>(R.id.view_birthday_click_area)
        val birthdayDate = view.findViewById<TextInputEditText>(R.id.text_birthday_date)

        birthdayAreaClick.setOnClickListener {
            DatePickerDialog(
                requireContext(), { _, year, month, day ->
                    val dateString =
                        String.format(getString(R.string.birthday_pattern), day, month.inc(), year)
                    birthdayDate.setText(dateString)
                }, year, month, day
            ).show()
        }
    }
}