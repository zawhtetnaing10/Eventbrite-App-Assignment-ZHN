package com.zawhtetnaing.eventbrite.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.R
import com.zawhtetnaing.eventbrite.views.holders.MoreEventsItemViewHolder

class MoreEventsItemAdapter : RecyclerView.Adapter<MoreEventsItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoreEventsItemViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.view_item_feature_event,parent,false)
        return MoreEventsItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: MoreEventsItemViewHolder, position: Int) {

    }
}