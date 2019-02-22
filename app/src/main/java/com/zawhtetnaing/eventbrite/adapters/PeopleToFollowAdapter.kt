package com.zawhtetnaing.eventbrite.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.R
import com.zawhtetnaing.eventbrite.views.holders.PeopleToFollowViewHolder

class PeopleToFollowAdapter : RecyclerView.Adapter<PeopleToFollowViewHolder>() {
    override fun onBindViewHolder(holder: PeopleToFollowViewHolder, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleToFollowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_people_to_follow, parent, false)
        return PeopleToFollowViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }
}