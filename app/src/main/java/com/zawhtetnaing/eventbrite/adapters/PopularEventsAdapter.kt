package com.zawhtetnaing.eventbrite.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zawhtetnaing.eventbrite.R
import com.zawhtetnaing.eventbrite.views.holders.BaseFeatureEventViewHolder
import com.zawhtetnaing.eventbrite.views.holders.FeatureEventViewHolder
import com.zawhtetnaing.eventbrite.views.holders.OtherFeatureEventsViewHolder

class PopularEventsAdapter : RecyclerView.Adapter<BaseFeatureEventViewHolder>() {

    companion object {
        const val VT_FEATURE_EVENT = 1111
        const val VT_OTHER_FEATURE_EVENT = 2222
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseFeatureEventViewHolder {
        return when(viewType){
            VT_FEATURE_EVENT -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_feature_event,parent,false)
                FeatureEventViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_other_feature_events,parent,false)
                OtherFeatureEventsViewHolder(view)
            }
        }
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: BaseFeatureEventViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return when(position){
            0 -> VT_FEATURE_EVENT
            else -> VT_OTHER_FEATURE_EVENT
        }
    }
}