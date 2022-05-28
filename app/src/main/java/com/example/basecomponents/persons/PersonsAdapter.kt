package com.example.basecomponents.persons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

class PersonsAdapter(val onItemClick: (String) -> Unit) : RecyclerView.Adapter<PersonViewHolder>() {
    var persons: List<String> = emptyList()
        set(value) {
            val diffUtil = DiffCallback(persons, value)
            val diffResults = DiffUtil.calculateDiff(diffUtil)
            field = value
            diffResults.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_person, parent, false)

        view.setOnClickListener {
            val text = view.findViewById<TextView>(R.id.text_name).text.toString()
            onItemClick(text)
        }

        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = persons[position]
        holder.name.text = person
    }

    override fun getItemCount() = persons.size

    private class DiffCallback(
        private val oldList: List<String>,
        private val newList: List<String>
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }
    }
}

class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val name: TextView = itemView.findViewById(R.id.text_name)
}