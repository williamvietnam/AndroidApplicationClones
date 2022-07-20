package com.nbgsoftware.gbrains.custom.dialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.StringRes
import com.nbgsoftware.gbrains.databinding.CustomDialogErrorBinding

class ErrorDialog constructor(context: Context) {
    private lateinit var binding: CustomDialogErrorBinding
    private var context: Context
    private val callBack: CallBack? = null

    companion object {

        private lateinit var instance: ErrorDialog

        fun getInstance(context: Context): ErrorDialog {
            if (instance == null) {
                instance = ErrorDialog(context = context)
            }
            return instance
        }
    }

    init {
        this.context = context
        val layoutInflater = LayoutInflater.from(context)
        binding = CustomDialogErrorBinding.inflate(layoutInflater)

        //custom dialog in here
    }

    fun show(headline: String, description: String, textButtonClick: String) {
        binding.textHeadline.text = headline
        binding.textDescription.text = description
        binding.textButtonClick.text = textButtonClick
    }

    fun show(
        @StringRes headline: Int,
        @StringRes description: Int,
        @StringRes textButtonClick: Int
    ) {
        binding.textHeadline.text = context.resources.getText(headline)
        binding.textDescription.text = context.resources.getText(description)
        binding.textButtonClick.text = context.resources.getText(textButtonClick)
    }

    fun setOnClick(): ErrorDialog {
        binding.buttonClick.visibility = View.VISIBLE
        binding.buttonClick.setOnClickListener{
            callBack?.onClick()
        }
        return this
    }

    interface CallBack{
        fun onClick()
    }

}