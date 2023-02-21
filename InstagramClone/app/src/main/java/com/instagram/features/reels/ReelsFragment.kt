package com.instagram.features.reels

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentReelsBinding

class ReelsFragment : BaseFragmentViewModel<FragmentReelsBinding, ReelsViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentReelsBinding {
        return FragmentReelsBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): ReelsViewModel {
        return ViewModelProvider(this)[ReelsViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        this.isVisibleBottomNavigationView(isShow = true)
    }
}