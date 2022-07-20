package com.nbgsoftware.gbrains.base.mvvm

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.nbgsoftware.gbrains.base.BaseMVVMActivity
import com.nbgsoftware.gbrains.base.BaseViewModel

abstract class MVVMActivity<BD : ViewDataBinding, VM : BaseViewModel> :
    BaseMVVMActivity<BD>() {

    private lateinit var viewModel: VM

    abstract fun getVM(): VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = getVM()
    }

}