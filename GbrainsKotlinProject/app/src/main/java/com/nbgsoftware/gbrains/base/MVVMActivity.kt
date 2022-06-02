package com.nbgsoftware.gbrains.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class MVVMActivity<VB : ViewBinding> : AppCompatActivity(), MVVMActivityView {

    lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getActivityBinding()
        setContentView(binding.root)

        initializeComponent()
        initializeEvent()
        initializeData()
    }

    abstract fun getActivityBinding(): VB
}