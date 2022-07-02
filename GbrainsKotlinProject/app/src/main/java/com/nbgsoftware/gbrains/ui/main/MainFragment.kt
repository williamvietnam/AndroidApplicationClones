package com.nbgsoftware.gbrains.ui.main

import com.nbgsoftware.gbrains.R
import com.nbgsoftware.gbrains.base.MVVMFragmentViewModel
import com.nbgsoftware.gbrains.databinding.FragmentMainBinding

class MainFragment : MVVMFragmentViewModel<FragmentMainBinding, MainViewModel>() {

    override fun getLayoutId(): Int = R.layout.fragment_main
    override fun getViewModelClass(): Class<MainViewModel> = MainViewModel::class.java
}