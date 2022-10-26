package com.example.peachlife.main

import com.example.peachlife.base.BasePresenter
import com.example.peachlife.size.SizeActivity

class  MainPresenter: BasePresenter<MainView>() {
    fun start() {
        SizeActivity.createLauncher().launch()
        exit()
    }

    fun exit() {
        super.onDestroy()
        System.runFinalizersOnExit(true)
        System.exit(0)
    }
}