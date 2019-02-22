package com.zawhtetnaing.eventbrite.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.adapters.MoreEventsItemAdapter
import kotlinx.android.synthetic.main.view_item_more_events.view.*

class MoreEventsViewHolder(itemView: View,
                           private val mAdapter: MoreEventsItemAdapter = MoreEventsItemAdapter()) : BaseEventListViewHolder(itemView) {
    init {
        with(itemView.rvMoreEventsItems) {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }
}