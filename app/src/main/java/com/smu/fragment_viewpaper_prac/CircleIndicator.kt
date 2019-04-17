package com.smu.fragment_viewpaper_prac

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.ImageView
import android.widget.LinearLayout
//변수초기화
//dp --> pixel
//원을 만들어 주고 (코드 안에서 만든다는 뜻임.)
//선택된 점 표시

class CircleIndicator:LinearLayout {

    private var mContext: Context? = null
    private var mDefaultCircle: Int = 0 //선택받지 못한 기본 점
    private var mSelectCircle: Int = 0
    private var imageDot: MutableList<ImageView> = mutableListOf() //Mutable : 가변

    //dp--> pixel
    private val temp = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,4.5f,resources.displayMetrics)

    constructor(context:Context):super(context){
        mContext = context
    }

    constructor(context:Context,attributeSet: AttributeSet):super(context, attributeSet){
        mContext = context
    }

    fun createDotPanel(count:Int, defaultCircle:Int, selectCircle:Int, position:Int) {
        this.removeAllViews()

        mDefaultCircle = defaultCircle
        mSelectCircle = selectCircle

        for (i in 0 until count) {   //until은 도달한 다음에 -1을 해줌.
            imageDot.add(ImageView(mContext).apply { setPadding(temp.toInt(), 0, temp.toInt(), 0) })
            this.addView(imageDot[i])
        }
        selectDot(position)
    }

    fun selectDot(position:Int){
        for(i in imageDot.indices){
            if(i ==position){
                imageDot[i].setImageResource(mSelectCircle)
            }
            else{
                imageDot[i].setImageResource(mDefaultCircle)
            }
        }
    }
}

