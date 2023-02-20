package com.instagram.features.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentSignInBinding

class SignInFragment : BaseFragmentViewModel<FragmentSignInBinding, SignInViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSignInBinding {
        return FragmentSignInBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): SignInViewModel {
        return ViewModelProvider(this)[SignInViewModel::class.java]
    }
}