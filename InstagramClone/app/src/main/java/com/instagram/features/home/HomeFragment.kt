package com.instagram.features.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentHomeBinding

class HomeFragment : BaseFragmentViewModel<FragmentHomeBinding, HomeViewModel>() {

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): HomeViewModel {
        return ViewModelProvider(this)[HomeViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        this.isVisibleBottomNavigationView(isShow = true)
    }
}