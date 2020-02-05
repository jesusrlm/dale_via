package com.fiai.dalevia.ui.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fiai.dalevia.R
import kotlinx.android.synthetic.main.photo_template.view.*

class CustomAdapter(item : ArrayList<Photo>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    var item: ArrayList<Photo>? = null

    var viewHolder : ViewHolder? = null

    init {
        this.item = item
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val vista: View = LayoutInflater.from(parent.context).inflate(R.layout.photo_template, parent, false)
        viewHolder = ViewHolder(vista)
        return viewHolder!!
    }

    override fun getItemCount(): Int {
        return this.item?.size!!
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = item?.get(position)

        holder.title?.text = item?.title
        holder.photo?.setImageResource(item?.img!!)
    }

    class ViewHolder(vista: View) : RecyclerView.ViewHolder(vista){

        var vista = vista
        var photo: ImageView? = null
        var title: TextView? = null

        init {
            photo= vista.gallery_photo
            title= vista.gallery_title
        }
    }
}