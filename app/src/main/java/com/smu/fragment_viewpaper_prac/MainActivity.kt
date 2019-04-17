package com.smu.fragment_viewpaper_prac

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import com.smu.fragment_viewpaper_prac.R.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy { MainAdapter(supportFragmentManager)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vpMainActivity.adapter = MainActivity@adapter
        vpMainActivity.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(p0: Int) {
            }
            override fun onPageScrolled(p0: Int, p1:Float, p2:Int){
            }
            override fun onPageSelected(p0: Int) {
                ciMainActivity.selectDot(p0)
            }
        })

        ciMainActivity.createDotPanel(3,drawable.indicator_dot_off,drawable.indicator_dot_on,0)
    }
}

