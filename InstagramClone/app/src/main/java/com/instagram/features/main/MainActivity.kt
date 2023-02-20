package com.instagram.features.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.instagram.base.BaseActivityViewModel
import com.instagram.databinding.ActivityMainBinding

class MainActivity : BaseActivityViewModel<ActivityMainBinding, MainViewModel>() {

    override fun createViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun getVM(): MainViewModel {
        return ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(this.binding.navHostFragment.id) as NavHostFragment
        val navController = navHostFragment.navController
    }
}