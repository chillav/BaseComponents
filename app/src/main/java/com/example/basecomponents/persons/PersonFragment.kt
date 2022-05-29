package com.example.basecomponents.persons

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R
import com.example.basecomponents.profile.ProfileFragment


class PersonFragment : Fragment(R.layout.fragment_pesons) {
    private val viewModel: PersonsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val onPersonClick: (String) -> Unit = {
            activity?.supportFragmentManager?.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container, ProfileFragment()).addToBackStack(null)
            }
        }

        val adapter = PersonsAdapter(onPersonClick)
        viewModel.persons.observe(viewLifecycleOwner) { persons ->
            adapter.persons = persons
        }

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = adapter

        super.onViewCreated(view, savedInstanceState)
    }
}