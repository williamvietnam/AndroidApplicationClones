package com.instagram.features.sign_up

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
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
        return ViewModelProvider(this)[SignUpViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        val registerPagerAdapter = RegisterPagerAdapter(requireActivity())
        this.binding.viewPager.adapter = registerPagerAdapter
        TabLayoutMediator(
            this.binding.tabLayout,
            this.binding.viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = "Phone"
                    1 -> tab.text = "Email"
                }
            }).attach()
    }
}