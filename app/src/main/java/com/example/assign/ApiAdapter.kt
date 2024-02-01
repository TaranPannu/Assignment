package com.example.assign

import android.content.Context

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.coroutines.NonDisposableHandle.parent
import java.lang.Exception
import java.util.*
import kotlin.collections.ArrayList

class ApiAdapter(var items: MutableList<Api_Data>): RecyclerView.Adapter<ApiAdapter.ViewHolder>() {

    override fun getItemCount(): Int {

        return items.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currItem=items[position]
        if((currItem.linkName).toString().length>=20)
        holder.linkName.text=""+(currItem.linkName).toString().substring(0,19)+"..."
        else
        holder.linkName.text=""+(currItem.linkName)

        holder.date.text=currItem.date
        holder.clicks.text=""+currItem.clicks
        holder.Link.text=""+currItem.link
        Glide.with(holder.imgView.context).load(currItem.imageUrl).into(holder.imgView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {

        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }
    fun update( apiData: MutableList<Api_Data>){
        items=apiData

        notifyDataSetChanged()
    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val linkName: TextView =itemView.findViewById(R.id.boldTextView)
        val imgView: ImageView =itemView.findViewById(R.id.imageView)
        val date: TextView =itemView.findViewById(R.id.dateTextView)
        val clicks: TextView =itemView.findViewById(R.id.clicks)
        val Link: TextView =itemView.findViewById(R.id.bottomBoxText)

    }
}