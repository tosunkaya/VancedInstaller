package com.vanced.manager.ui.core

import android.content.Context
import android.util.AttributeSet
import androidx.core.widget.NestedScrollView

open class SlidingNestedScrollView : NestedScrollView {
    constructor(context: Context?) : super(context!!)
    constructor(context: Context?, attrs: AttributeSet?) : super(
        context!!,
        attrs
    )

    var xFraction: Float
        get() {
            val width = width
            return if (width != 0)
                x / getWidth()
            else
                x
        }
        set(xFraction) {
            val width = width
            val newWidth =
                if (width > 0)
                    xFraction * width
                else
                    (-9999).toFloat()
            x = newWidth
        }
}