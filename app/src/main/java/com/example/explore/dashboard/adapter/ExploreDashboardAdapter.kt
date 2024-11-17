package com.example.explore.dashboard.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explore.databinding.ItemDashboardBinding

class ExploreDashboardAdapter : RecyclerView.Adapter<ExploreDashboardAdapter.ViewDashboard>() {



    class ViewDashboard(private val binding: ItemDashboardBinding) : RecyclerView.ViewHolder(binding.root){
        val card=binding.txtDashHead
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewDashboard {
        val binding = ItemDashboardBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewDashboard(binding)
    }

    override fun getItemCount(): Int {
        return 5;
    }

    override fun onBindViewHolder(holder: ViewDashboard, position: Int) {
        holder.card.text = "ayush"+position
    }
}