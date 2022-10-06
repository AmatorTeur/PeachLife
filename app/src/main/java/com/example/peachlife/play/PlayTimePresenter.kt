package com.example.peachlife.play

import com.example.peachlife.base.BaseView
import com.example.peachlife.size.SizeActivity
import com.omega_r.base.mvp.model.Action
import com.omega_r.base.mvp.presenters.OmegaPresenter
import com.omega_r.libs.omegatypes.Text
import com.omegar.libs.omegalaunchers.ActivityLauncher
import com.omegar.libs.omegalaunchers.BaseIntentLauncher
import com.omegar.libs.omegalaunchers.DialogFragmentLauncher
import com.omegar.libs.omegalaunchers.Launcher
import kotlinx.coroutines.CompletableDeferred
import java.io.Serializable

class PlayTimePresenter: OmegaPresenter <PlayTimeView>() {
    fun exit () {
        super.onDestroy()
        System.runFinalizersOnExit(true)
        System.exit(0)
    }

}