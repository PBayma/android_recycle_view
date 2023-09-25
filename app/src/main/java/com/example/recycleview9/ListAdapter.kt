package com.example.recycleview9

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview9.databinding.ItemBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    class ListItemViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        var title = binding.itemTitle
        var description = binding.itemDescription

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        holder.title.text = "$position Item"
        holder.description.text = "Here is the description of item $position"
    }

    override fun getItemCount(): Int {
        return 5
    }


}