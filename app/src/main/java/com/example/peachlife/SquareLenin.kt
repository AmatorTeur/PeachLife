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
        strokeWidth = 10f
        color = Color.BLACK
        style =Paint.Style.STROKE
    }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val sizeCanvas = height
        paint.strokeWidth = 10f
        paint.color = resources.getColor(R.color.red_brown)
        canvas.drawRect(0f, 0f, sizeCanvas.toFloat(), sizeCanvas.toFloat(), paint)


        paint.color = Color.BLACK;
        paint.strokeWidth = 3f;
        canvas.drawRect(30f, 30f, 24f, 24f, paint);
        paint.strokeWidth = 0f;
        paint.color = Color.CYAN;
        canvas.drawRect(33f, 60f, 24f, 24f, paint );
        paint.color = Color.YELLOW;
        canvas.drawRect(33f, 33f, 104f, 204f, paint );




    }

    }
//https://www.youtube.com/watch?v=2fGI0TQkRY4&ab_channel=AndroidBroadcast.ВсеобАндроидразработке
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#3
//https://developer.android.com/codelabs/advanced-android-kotlin-training-custom-views#0
//https://www.raywenderlich.com/142-android-custom-view-tutorial
//https://developer.alexanderklimov.ru/android/kotlin/jvmoverloads.php
//https://kotlinlang.org/docs/inheritance.html#overriding-properties
//https://developer.alexanderklimov.ru/android/catshop/color.php