package com.nbgsoftware.gbrains.base

import android.content.Context
import android.content.res.Configuration
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.LiveData
import androidx.navigation.NavController
import com.zeugmasolutions.localehelper.LocaleHelper
import com.zeugmasolutions.localehelper.LocaleHelperActivityDelegate
import com.zeugmasolutions.localehelper.LocaleHelperActivityDelegateImpl
import java.util.*

abstract class MVVMActivity<DB : ViewDataBinding> : AppCompatActivity() {

    private val localeDelegate: LocaleHelperActivityDelegate = LocaleHelperActivityDelegateImpl()

    private var _binding: DB? = null
    open val binding get() = _binding!!
//    lateinit var navController: LiveData<NavController>

    @LayoutRes
    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeDataBinding()
        setContentView(binding.root)

        initializeView()

        if (savedInstanceState == null) {
            setUpBottomNavigation()
        }
    }

    override fun onResume() {
        super.onResume()
        localeDelegate.onResumed(this)
    }

    override fun onPause() {
        super.onPause()
        localeDelegate.onPaused()
    }

    override fun createConfigurationContext(overrideConfiguration: Configuration): Context {
        val context = super.createConfigurationContext(overrideConfiguration)
        return LocaleHelper.onAttach(context)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        setUpBottomNavigation()
    }

    override fun getApplicationContext(): Context {
        return localeDelegate.getApplicationContext(super.getApplicationContext())
    }

    private fun initializeDataBinding() {
        _binding = DataBindingUtil.setContentView(this, getLayoutId())
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

//    override fun onSupportNavigateUp(): Boolean {
//        return navController.value?.navigateUp()!! || super.onSupportNavigateUp()
//    }

    open fun updateLocale(language: String) {
        localeDelegate.setLocale(this, Locale(language))
    }

    override fun getDelegate() = localeDelegate.getAppCompatDelegate(super.getDelegate())

    open fun setUpBottomNavigation() {}

    open fun initializeView(){}
}