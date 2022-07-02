package com.nbgsoftware.gbrains.custom.dialog

import android.content.Context
import android.view.LayoutInflater
import androidx.annotation.StringRes
import com.nbgsoftware.gbrains.databinding.CustomDialogConfirmBinding

class ConfirmDialog constructor(context: Context){

    private var binding: CustomDialogConfirmBinding
    private var context: Context
    private val callBack: CallBack? = null

    companion object {
        private lateinit var instance: ConfirmDialog

        fun getInstance(context: Context): ConfirmDialog {
            if (instance == null){
                instance = ConfirmDialog(context)
            }
            return instance
        }
    }

    init {
        // initialize value, method first in here
        this.context = context
        val layoutInflater = LayoutInflater.from(context)
        binding = CustomDialogConfirmBinding.inflate(layoutInflater)

        //custom dialog in here

    }

    fun show(
        headline: String, description: String,
        leftClick: String, rightClick: String
    ) {
        binding.textHeadline.text = headline
        binding.textDescription.text = description
        binding.leftClick.text = leftClick
        binding.rightClick.text = rightClick
    }

    fun show(
        @StringRes headline: Int, @StringRes description: Int,
        @StringRes leftClick: Int, @StringRes rightClick: Int
    ) {
        binding.textHeadline.text = context.resources.getText(headline)
        binding.textDescription.text = context.resources.getText(description)
        binding.leftClick.text = context.resources.getText(leftClick)
        binding.rightClick.text = context.resources.getText(rightClick)
    }

    fun setCancelableDialog(isCancelable: Boolean): ConfirmDialog{

        return this
    }

    fun setOnLeftClick(): ConfirmDialog {
        binding.leftClick.setOnClickListener {
            callBack?.onLeftClick()
        }

        return this
    }

    fun setOnRightClick(): ConfirmDialog {
        binding.rightClick.setOnClickListener {
            callBack?.onRightClick()
        }

        return this
    }

    interface CallBack {
        fun onLeftClick()
        fun onRightClick()
    }

}