package com.example.peachlife.play

import com.example.peachlife.base.BaseView
import com.omega_r.base.mvp.model.Action
import com.omega_r.libs.omegatypes.Text
import com.omegar.libs.omegalaunchers.ActivityLauncher
import com.omegar.libs.omegalaunchers.BaseIntentLauncher
import com.omegar.libs.omegalaunchers.DialogFragmentLauncher
import com.omegar.libs.omegalaunchers.Launcher
import kotlinx.coroutines.CompletableDeferred
import java.io.Serializable

class PlayTimePresenter: BaseView {


    override fun exit() {
        TODO("Not yet implemented")
    }

    override fun hideQueryOrMessage() {
        TODO("Not yet implemented")
    }

    override fun launch(launcher: ActivityLauncher, vararg parentLaunchers: ActivityLauncher) {
        TODO("Not yet implemented")
    }

    override fun launch(launcher: DialogFragmentLauncher) {
        TODO("Not yet implemented")
    }

    override fun launch(launcher: Launcher) {
        TODO("Not yet implemented")
    }

    override fun launchForResult(launcher: BaseIntentLauncher, requestCode: Int) {
        TODO("Not yet implemented")
    }

    override fun launchForResult(launcher: DialogFragmentLauncher, requestCode: Int) {
        TODO("Not yet implemented")
    }

    override fun requestGetPermission(permission: String, deferred: CompletableDeferred<Boolean>) {
        TODO("Not yet implemented")
    }

    override fun requestPermissions(requestCode: Int, vararg permissions: String) {
        TODO("Not yet implemented")
    }

    override fun setResult(success: Boolean, data: Serializable?) {
        TODO("Not yet implemented")
    }

    override fun setWaiting(waiting: Boolean, text: Text?) {
        TODO("Not yet implemented")
    }

    override fun showBottomMessage(message: Text, action: Action?) {
        TODO("Not yet implemented")
    }

    override fun showMessage(message: Text, action: Action?) {
        TODO("Not yet implemented")
    }

    override fun showQuery(
        message: Text,
        title: Text?,
        positiveAction: Action,
        negativeAction: Action,
        neutralAction: Action?
    ) {
        TODO("Not yet implemented")
    }

    override fun showToast(message: Text) {
        TODO("Not yet implemented")
    }

}