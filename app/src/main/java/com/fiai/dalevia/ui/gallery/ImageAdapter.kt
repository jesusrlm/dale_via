package com.fiai.dalevia.ui.gallery

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.fiai.dalevia.R

class ImageAdapter(private val mContext: Context) : PagerAdapter() {

    companion object{
        val mImagerArry = arrayOf(R.drawable.im0,R.drawable.img2,R.drawable.img4)
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }

    override fun getCount(): Int {
        return mImagerArry.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val mImageView = ImageView(mContext)

        mImageView.scaleType = ImageView.ScaleType.CENTER_CROP

        mImageView.setImageResource(mImagerArry[position])

        container.addView(mImageView, 0)

        return mImageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, any : Any) {
        container.removeView(any as View?)
    }
}