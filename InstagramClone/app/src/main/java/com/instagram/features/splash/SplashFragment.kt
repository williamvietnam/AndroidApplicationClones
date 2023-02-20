package com.instagram.features.splash

import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.instagram.R
import com.instagram.base.BaseFragment
import com.instagram.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, false)
    }

    override fun bindingAction() {
        super.bindingAction()
        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            findNavController().navigate(
                R.id.action_splashFragment_to_signInFragment
            )
        }, 1500)
    }
}