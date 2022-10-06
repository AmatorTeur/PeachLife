package com.example.peachlife.size

import com.example.peachlife.main.MainActivity
import com.example.peachlife.play.PlayTimeActivity
import com.omega_r.base.mvp.presenters.OmegaPresenter

class SizePresenter: OmegaPresenter<SizeView>() {

    fun next (){
        PlayTimeActivity.createLauncher().launch()
        exit()
    }

    fun back (){
        MainActivity.createLauncher().launch()
        exit()
    }
}