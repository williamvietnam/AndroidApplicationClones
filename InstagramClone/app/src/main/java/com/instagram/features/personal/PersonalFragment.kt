package com.instagram.features.personal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentPersonBinding

class PersonalFragment : BaseFragmentViewModel<FragmentPersonBinding, PersonalViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentPersonBinding {
        return FragmentPersonBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): PersonalViewModel {
        return ViewModelProvider(this)[PersonalViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        this.isVisibleBottomNavigationView(isShow = true)
    }
}