package com.example.peachlife.base

import android.os.Parcel
import android.os.Parcelable
import com.omega_r.base.mvp.presenters.OmegaPresenter

open class BasePresenter<V: BaseView>() : OmegaPresenter<V> (){

}