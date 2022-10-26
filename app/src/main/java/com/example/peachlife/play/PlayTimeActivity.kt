package com.example.peachlife.play

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.peachlife.R
import com.example.peachlife.SquareLenin
import com.example.peachlife.base.BaseActivity
import com.example.peachlife.main.MainPresenter
import com.example.peachlife.main.MainView
import com.google.android.material.button.MaterialButton
import com.omegar.libs.omegalaunchers.createActivityLauncher
import com.omegar.mvp.ktx.providePresenter

class PlayTimeActivity :BaseActivity (R.layout.play_time), PlayTimeView {

    override val presenter: PlayTimePresenter by providePresenter()

    var color: Int = Color.BLACK

    private val buttonExit: Button by bind(R.id.playexit)
    private val buttonSandColor: ImageButton by bind(R.id.sand)
    private val buttonBlueColor: ImageButton by bind(R.id.blue)
    private val buttonGreenColor: ImageButton by bind(R.id.green)
    private val buttonDeleteCell: ImageButton by bind(R.id.delete)
    private val buttonInfectionCell : MaterialButton by bind(R.id.infekcia)
    private val buttonHealCell : MaterialButton by bind(R.id.heal)
    private val squareLenin: SquareLenin by bind(R.id.squareLenin)


    companion object {
        fun createLauncher() = createActivityLauncher()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        buttonExit.setOnClickListener {
            presenter.exit()
        }


        buttonSandColor.setOnClickListener {
            val squareColorSand = resources.getColor(R.color.sand)
            color = squareColorSand
        }

        buttonBlueColor.setOnClickListener {
            val squareColorBlue = resources.getColor(R.color.blue)
            color = squareColorBlue
        }

        buttonGreenColor.setOnClickListener {
            val squareColorGreen = resources.getColor(R.color.green)
            color = squareColorGreen
        }

        buttonDeleteCell.setOnClickListener {

        }
        buttonInfectionCell.setOnClickListener {

        }
        buttonHealCell.setOnClickListener {

        }
    }

//    fun touch (x, y) {
//        squareLenin.list.add(x, y, color)
//
//    }
}