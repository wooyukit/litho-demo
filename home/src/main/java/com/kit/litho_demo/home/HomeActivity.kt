package com.kit.litho_demo.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.facebook.litho.ComponentContext
import com.kit.litho_demo.DemoItem

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val c = ComponentContext(baseContext)

        /** TODO issue here */
        DemoItem.create(c).build()
    }
}
