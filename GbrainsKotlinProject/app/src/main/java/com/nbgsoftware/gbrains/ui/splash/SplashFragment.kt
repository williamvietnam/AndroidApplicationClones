package com.nbgsoftware.gbrains.ui.splash

import android.os.Bundle
import android.view.View
import com.nbgsoftware.gbrains.R
import com.nbgsoftware.gbrains.base.MVVMFragmentViewModel
import com.nbgsoftware.gbrains.databinding.FragmentSplashBinding

class SplashFragment : MVVMFragmentViewModel<FragmentSplashBinding, SplashViewModel>() {

    override fun getLayoutId(): Int = R.layout.fragment_splash
    override var useSharedViewModel = true
    override fun getViewModelClass(): Class<SplashViewModel> = SplashViewModel::class.java

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}