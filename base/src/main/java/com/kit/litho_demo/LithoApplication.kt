package com.kit.litho_demo

import android.app.Application
import com.facebook.soloader.SoLoader

/**
 * Created by vincent.woo on 27/9/2018.
 */
class LithoApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        /** init litho */
        SoLoader.init(this, false)
    }
}