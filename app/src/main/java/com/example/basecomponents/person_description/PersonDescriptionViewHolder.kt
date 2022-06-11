package com.example.basecomponents.person_description

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.basecomponents.R

sealed class PersonDescriptionViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    class Title(view: View) : PersonDescriptionViewHolder(view) {
        val title: TextView = view.findViewById(R.id.text_title)
    }

    class Achievement(view: View) : PersonDescriptionViewHolder(view) {
        val message: TextView = view.findViewById(R.id.text_description_message)
        val scores: TextView = view.findViewById(R.id.text_scores_message)
    }
}
