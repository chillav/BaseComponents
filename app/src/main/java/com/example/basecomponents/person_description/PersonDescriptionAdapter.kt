package com.example.basecomponents.person_description

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

class PersonDescriptionAdapter : RecyclerView.Adapter<PersonDescriptionViewHolder>() {

    var items: List<PersonDescriptionItems> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged() // TODO create DiffUtils
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonDescriptionViewHolder {
        return when (viewType) {
            R.layout.item_achievement_title -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_achievement_title, parent, false)

                PersonDescriptionViewHolder.Title(view)
            }
            R.layout.item_achievement_description -> {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_achievement_description, parent, false)

                PersonDescriptionViewHolder.Achievement(view)
            }
            else -> throw IllegalArgumentException("Invalid ViewType Provided")
        }
    }

    override fun onBindViewHolder(holder: PersonDescriptionViewHolder, position: Int) {
        when (holder) {
            is PersonDescriptionViewHolder.Achievement -> {
                val item = items[position] as PersonDescriptionItems.Achievement
                holder.message.text = item.message
                holder.scores.text = item.scores
            }
            is PersonDescriptionViewHolder.Title -> {
                val item = items[position] as PersonDescriptionItems.Title
                holder.title.text = item.text
            }
        }
    }

    override fun getItemCount(): Int = items.size

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is PersonDescriptionItems.Title -> R.layout.item_achievement_title
            is PersonDescriptionItems.Achievement -> R.layout.item_achievement_description
        }
    }
}