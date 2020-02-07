package com.fiai.dalevia.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fiai.dalevia.R
import kotlinx.android.synthetic.main.fragment_gallery.view.*

class GalleryFragment : Fragment() {

    var photo: ArrayList<Photo>? = null
    var lista: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adaptador: CustomAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_gallery, container, false)
        photo = ArrayList()
        photo?.add(Photo( "hola" , R.drawable.img1 ))

        lista= rootView.findViewById(R.id.rviewgallery)
        adaptador = CustomAdapter(photo!!)
        return rootView
    }

}
