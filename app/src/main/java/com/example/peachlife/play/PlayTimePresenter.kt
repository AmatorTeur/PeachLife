package com.example.peachlife.play

import com.example.peachlife.base.BasePresenter

class PlayTimePresenter: BasePresenter <PlayTimeView>() {
    fun exit () {
        super.onDestroy()
        System.runFinalizersOnExit(true)
        System.exit(0)
    }

}