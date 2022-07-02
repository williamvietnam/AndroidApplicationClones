package com.nbgsoftware.gbrains.custom

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.nbgsoftware.gbrains.databinding.CustomViewEditTextBinding

class CustomEditText : ConstraintLayout {

    private lateinit var binding: CustomViewEditTextBinding

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
}