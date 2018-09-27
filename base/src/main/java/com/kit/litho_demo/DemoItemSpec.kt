package com.kit.litho_demo

import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.widget.Text

/**
 * Created by vincent.woo on 27/9/2018.
 */
@LayoutSpec
object DemoItemSpec {
    @OnCreateLayout
    fun onCreateLayout(c: ComponentContext): Component {
        return Text.create(c)
                .build()
    }
}