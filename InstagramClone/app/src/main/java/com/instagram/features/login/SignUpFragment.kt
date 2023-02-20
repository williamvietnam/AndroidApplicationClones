package com.instagram.features.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentSignUpBinding

class SignUpFragment : BaseFragmentViewModel<FragmentSignUpBinding, SignUpViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSignUpBinding {
        return FragmentSignUpBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): SignUpViewModel {
        return ViewModelProvider(this).get(SignUpViewModel::class.java)
    }
}