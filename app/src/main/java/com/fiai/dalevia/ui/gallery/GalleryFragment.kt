package com.fiai.dalevia.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.fiai.dalevia.R

class GalleryFragment : Fragment() {

    lateinit var mViewPager : ViewPager

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        mViewPager = root.findViewById(R.id.viewPager)
        val mImageAdapter = ImageAdapter( this@GalleryFragment )
        mViewPager.adapter = mImageAdapter
        return root
    }
}