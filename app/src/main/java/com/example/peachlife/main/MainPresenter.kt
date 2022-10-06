package com.example.peachlife.main

import com.example.peachlife.size.SizeActivity
import com.omega_r.base.mvp.presenters.OmegaPresenter

class  MainPresenter: OmegaPresenter<MainView>() {
    fun start () {
        SizeActivity.createLauncher().launch()
        exit()
    }

}