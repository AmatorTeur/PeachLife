package com.example.peachlife.size

import android.os.Bundle
import android.widget.Button
import com.example.peachlife.R
import com.example.peachlife.base.BaseActivity
import com.omegar.libs.omegalaunchers.createActivityLauncher
import com.omegar.mvp.ktx.providePresenter

class SizeActivity: BaseActivity(R.layout.size_activity), SizeView {

    override val presenter: SizePresenter by providePresenter()

    private val buttonNext : Button by bind(R.id.next)
    private val buttonBack : Button by bind(R.id.back)
    companion object {
        fun createLauncher() = createActivityLauncher()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.size_activity)


        buttonNext.setOnClickListener {
            presenter.next()
        }

        buttonBack.setOnClickListener {
            presenter.back()
        }
    }
}