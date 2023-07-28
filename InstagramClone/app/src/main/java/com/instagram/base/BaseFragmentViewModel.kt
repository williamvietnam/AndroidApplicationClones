package com.instagram.base

import android.os.Bundle
import android.text.TextUtils
import androidx.viewbinding.ViewBinding

/**
 * Author: William Giang Nguyen | 8/7/2022
 * */
abstract class BaseFragmentViewModel<BD : ViewBinding, VM : BaseViewModel>() : BaseFragment<BD>() {

    private lateinit var viewModel: VM

    abstract fun createViewModel(): VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = createViewModel()
    }
}