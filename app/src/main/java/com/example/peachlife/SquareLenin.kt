package com.example.peachlife

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View


class SquareLenin @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val paint = Paint()
//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//        x = event.getX()
//        y = event.getY()
//        return super.onTouchEvent(event)
//    }
//    fun onTouch(v: View?, event: MotionEvent?): Boolean {
//
//        return true
//    }
    @SuppressLint("DrawAllocation")
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)


        val sizeCanvas = height
        val squareSize = sizeCanvas / 10
        paint.strokeWidth = 6f
        paint.color = resources.getColor(R.color.red_brown)
        paint.pathEffect = CornerPathEffect(50f)
        paint.style = Paint.Style.STROKE
        canvas.drawRect(0f, 0f, sizeCanvas.toFloat(), sizeCanvas.toFloat(), paint)


        paint.style = Paint.Style.FILL
        paint.strokeWidth = 0f

        paint.color = resources.getColor(R.color.sand)
        paint.pathEffect = CornerPathEffect(15f)
        canvas.drawRect(264f, 104f, 334f, 174f, paint)
    }


//    fun add(x: Int,y: Int,color: Int) {
//        list.add(x, y, color)
//        invalidate()
//    }


    }
//https://www.youtube.com/watch?v=2fGI0TQkRY4&ab_channel=AndroidBroadcast.ВсеобАндроидразработке
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#3
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#0
//https://www.raywenderlich.com/142-android-custom-view-tutorial
//https://developer.alexanderklimov.ru/android/kotlin/jvmoverloads.php
//https://kotlinlang.org/docs/inheritance.html#overriding-properties
//https://developer.alexanderklimov.ru/android/catshop/color.php