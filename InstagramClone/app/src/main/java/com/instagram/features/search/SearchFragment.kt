package com.instagram.features.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseFragmentViewModel
import com.instagram.databinding.FragmentSearchBinding

class SearchFragment : BaseFragmentViewModel<FragmentSearchBinding, SearchViewModel>() {
    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSearchBinding {
        return FragmentSearchBinding.inflate(inflater, container, false)
    }

    override fun createViewModel(): SearchViewModel {
        return ViewModelProvider(this)[SearchViewModel::class.java]
    }

    override fun bindingStateView() {
        super.bindingStateView()
        this.isVisibleBottomNavigationView(isShow = true)
    }
}