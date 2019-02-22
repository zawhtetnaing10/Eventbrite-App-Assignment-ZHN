package com.zawhtetnaing.eventbrite.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.R
import com.zawhtetnaing.eventbrite.adapters.EventListAdapter
import kotlinx.android.synthetic.main.activity_event_list.*

class EventListActivity : AppCompatActivity() {

    private lateinit var mAdapter: EventListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_list)

        mAdapter = EventListAdapter()
        with(rvEventList) {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

        bottomNavigation.itemIconTintList = resources.getColorStateList(R.color.bottom_navigation_state_list)
    }


}
