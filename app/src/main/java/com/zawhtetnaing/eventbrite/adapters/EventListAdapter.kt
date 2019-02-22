package com.zawhtetnaing.eventbrite.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.R
import com.zawhtetnaing.eventbrite.views.holders.*

class EventListAdapter : RecyclerView.Adapter<BaseEventListViewHolder>() {

    companion object {
        const val VT_POPULAR_EVENTS = 1111
        const val VT_WHO_TO_FOLLOW = 2222
        const val VT_MORE_EVENTS_IN = 3333
        const val VT_MORE_EVENTS = 4444
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseEventListViewHolder {
        return when (viewType) {
            VT_POPULAR_EVENTS -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_popular_events, parent, false)
                PopularEventViewHolder(view)
            }
            VT_WHO_TO_FOLLOW -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_who_to_follow, parent, false)
                WhoToFollowViewHolder(view)
            }
            VT_MORE_EVENTS_IN -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_more_events_in, parent, false)
                MoreEventsInViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_more_events, parent, false)
                MoreEventsViewHolder(view)
            }
        }

    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: BaseEventListViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> VT_POPULAR_EVENTS
            1 -> VT_WHO_TO_FOLLOW
            2 -> VT_MORE_EVENTS_IN
            else -> VT_MORE_EVENTS
        }
    }
}