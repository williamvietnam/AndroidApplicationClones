package com.instagram.features.main

import androidx.lifecycle.ViewModelProvider
import com.instagram.base.BaseActivityViewModel
import com.instagram.databinding.ActivityMainBinding

class MainActivity : BaseActivityViewModel<ActivityMainBinding, MainViewModel>() {

    override fun createViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun getVM(): MainViewModel {
        return ViewModelProvider(this)[MainViewModel::class.java]
    }

}