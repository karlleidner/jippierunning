package com.smallgroupofpeople.jippierunning

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_list_item.view.*

class ActivityAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvActivityType.text = items.get(position)
    }

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvActivityType = view.tv_activity_type
}