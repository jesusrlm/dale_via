package com.fiai.dalevia.ui.gallery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.fiai.dalevia.R
import kotlinx.android.synthetic.main.recyclerview_row.view.*

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>(){
    val videoTitles = listOf("First title", "Second", "3rd", "Moore Title")

    //number of item
    override fun getItemCount(): Int {
        return videoTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        //create view
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.recyclerview_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val videoTitle = videoTitles.get(position)
        holder?.view?.photo_title.text= videoTitle
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){
    val video_title= view.photo_title
}