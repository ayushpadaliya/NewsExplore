package com.example.explore.dashboard.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.explore.databinding.LayoutCustomBottomNavBinding

class CustomBottomNavAdapter(val context: Context): RecyclerView.Adapter<CustomBottomNavAdapter.ViewBottomNav>() {


    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewBottomNav {
        val binding =
            LayoutCustomBottomNavBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewBottomNav(binding)
    }

    override fun getItemCount(): Int {
        return 5;
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewBottomNav, position: Int) {
        holder.b.ivIcon.setOnClickListener(View.OnClickListener {
            Toast.makeText(context,""+position,Toast.LENGTH_LONG).show()
        })


    }

    class ViewBottomNav(var b: LayoutCustomBottomNavBinding) :
        RecyclerView.ViewHolder(
            b.root
        )
}