package com.instagram.features.sign_up

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentRegisterByPhoneBinding

class RegisterByPhoneFragment : BaseFragmentViewModel<
        FragmentRegisterByPhoneBinding, SignUpViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentRegisterByPhoneBinding {
        return FragmentRegisterByPhoneBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): SignUpViewModel {
        return ViewModelProvider(this)[SignUpViewModel::class.java]
    }
}