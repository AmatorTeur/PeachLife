package com.example.peachlife.play

import android.os.Bundle
import android.widget.ImageButton
import com.example.peachlife.R
import com.example.peachlife.SquareLenin
import com.example.peachlife.base.BaseActivity

class PlayTimeActivity : BaseActivity(R.layout.play_time){


    private val buttonSandColor: ImageButton by bind(R.id.sand)
    private val buttonBlueColor: ImageButton by bind(R.id.blue)
    private val squareLenin: SquareLenin by bind(R.id.squareLenin)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        buttonSandColor.setOnClickListener {
            val squareColorSand = resources.getColor(R.color.sand)
//            color = squareColorSand
        }

        buttonBlueColor.setOnClickListener {
            val squareColorBlue = resources.getColor(R.color.blue)
//            color = squareColorBlue
        }
    }

//    fun touch (x, y, color) {
//        squareLenin.list.add(x, y, color)
//
//    }
}