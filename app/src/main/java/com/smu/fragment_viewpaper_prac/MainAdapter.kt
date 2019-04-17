package com.smu.fragment_viewpaper_prac

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup
import com.example.test.AFragment
import com.example.test.BFragment
import com.example.test.CFragment

class MainAdapter(fm: FragmentManager):FragmentStatePagerAdapter(fm){

    override fun getItem(p0: Int): Fragment {
        return when(p0){
            0-> AFragment()
            1-> BFragment()
            2-> CFragment()

            else -> AFragment()
        }
    }

    override fun getCount()=3

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }

}