package com.zawhtetnaing.eventbrite.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.adapters.PopularEventsAdapter
import kotlinx.android.synthetic.main.view_item_popular_events.view.*

class PopularEventViewHolder(itemView: View,
                             private val mAdapter: PopularEventsAdapter = PopularEventsAdapter()) : BaseEventListViewHolder(itemView) {

    init {
        with(itemView.rvFeatureEvents) {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }

}