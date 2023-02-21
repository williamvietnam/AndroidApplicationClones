package com.instagram.features.main

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
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
        this.binding.bottomNavigationView.setupWithNavController(navController)
    }

    fun isVisibleBottomNavigationView(isShow: Boolean) {
        if (isShow) {
            this.binding.bottomNavigationView.visibility = View.VISIBLE
        } else {
            this.binding.bottomNavigationView.visibility = View.GONE
        }
    }
}