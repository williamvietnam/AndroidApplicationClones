package com.instagram.features.splash

import android.view.LayoutInflater
import android.view.ViewGroup
import com.instagram.base.BaseFragment
import com.instagram.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }
}