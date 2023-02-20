package com.instagram.features.sign_in

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.instagram.R
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

    override fun bindingAction() {
        super.bindingAction()

        this.binding.buttonSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
    }
}