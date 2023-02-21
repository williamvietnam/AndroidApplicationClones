package com.instagram.features.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentNotificationsBinding

class NotificationsFragment : BaseFragmentViewModel<FragmentNotificationsBinding,
        NotificationsViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentNotificationsBinding {
        return FragmentNotificationsBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): NotificationsViewModel {
        return ViewModelProvider(this)[NotificationsViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        this.isVisibleBottomNavigationView(isShow = true)
    }
}