package com.example.recyclerviewintentkt.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewintentkt.MainActivity
import com.example.recyclerviewintentkt.R
import com.example.recyclerviewintentkt.User


class RecyclerAdapter(val activity: MainActivity, val users: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemCount(): Int {
        return users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_iteam, parent, false)
        return MemeberViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users.get(position)
        if (holder is MemeberViewHolder) {


            holder.username.setText(user.username)
            holder.icon.setImageResource(user.img)

            holder.itemclick.setOnClickListener {
                activity.openItemDetalis(user)
            }
        }
    }

    inner class MemeberViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var icon: ImageView
        var username: TextView
        var itemclick: LinearLayout

        init {
            icon = view.findViewById(R.id.icon)
            username = view.findViewById(R.id.username)
            itemclick = view.findViewById(R.id.itemclick)
        }
    }
}
