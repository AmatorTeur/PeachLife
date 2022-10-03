package com.example.peachlife

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class SquareLenin @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val paint = Paint ().apply {
        strokeWidth = 2f
        color = Color.BLACK
        style =Paint.Style.STROKE
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val sizeCanvas = height
        paint.color = resources.getColor(R.color.transparent)
        canvas!!.drawRect(0f, 0f, sizeCanvas.toFloat(), sizeCanvas.toFloat(), paint)




    }

    }
//https://www.youtube.com/watch?v=2fGI0TQkRY4&ab_channel=AndroidBroadcast.ВсеобАндроидразработке
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#3
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#0
//https://www.raywenderlich.com/142-android-custom-view-tutorial
//https://developer.alexanderklimov.ru/android/kotlin/jvmoverloads.php
//https://kotlinlang.org/docs/inheritance.html#overriding-properties
//https://developer.alexanderklimov.ru/android/catshop/color.php