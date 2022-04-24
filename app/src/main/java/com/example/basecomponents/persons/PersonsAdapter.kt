package com.example.basecomponents.persons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

class PersonsAdapter : RecyclerView.Adapter<PersonViewHolder>() {
    var persons: List<String> = emptyList()
        set(value) {
            field = value
            // TODO использовать diff utils
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)

        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]
        holder.name.text = person
    }

    override fun getItemCount() = persons.size

}


class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name: TextView = itemView.findViewById(R.id.text_name)
}