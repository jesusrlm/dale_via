package com.fiai.dalevia.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fiai.dalevia.R

class GalleryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)

        var video_recyclerview = rootView.findViewById(R.id.rvphotos) as RecyclerView
        video_recyclerview.layoutManager = LinearLayoutManager(activity)
        video_recyclerview.adapter = MainAdapter()
        return rootView
    }
}
