package com.zawhtetnaing.eventbrite.views.holders

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.adapters.PeopleToFollowAdapter
import kotlinx.android.synthetic.main.view_item_who_to_follow.view.*

class WhoToFollowViewHolder(itemView: View,
                            private val mAdapter: PeopleToFollowAdapter = PeopleToFollowAdapter()) : BaseEventListViewHolder(itemView) {

    init {
        with(itemView.rvPeopleToFollow) {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }
    }

}