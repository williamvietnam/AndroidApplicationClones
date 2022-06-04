package com.nbgsoftware.gbrains.base

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

abstract class MVVMFragmentViewModel<DB : ViewDataBinding, VM : MVVMViewModel> : Fragment() {

    @LayoutRes
    abstract fun getLayoutId(): Int
    private var _binding: DB? = null
    private val binding get() = _binding!!
    private var rootView: View? = null

    open var useSharedViewModel: Boolean = false

    lateinit var viewModel: VM
    abstract fun getViewModelClass(): Class<VM>

    private var hasInitializedRootView = false
    private var progressDialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = if (useSharedViewModel) {
            ViewModelProvider(requireActivity()).get(getViewModelClass())
        } else {
            ViewModelProvider(this).get(getViewModelClass())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (rootView != null) {
            initializeDataBinding(inflater, container)
        }
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (!hasInitializedRootView) {
            getFragmentArguments()
            setBindingVariables()
            setUpViews()
            observeAPICall()
            setupObservers()

            hasInitializedRootView = true
        }
    }

    override fun onResume() {
        super.onResume()
        registerListener()
    }

    override fun onPause() {
        unRegisterListener()
        super.onPause()
    }

    private fun initializeDataBinding(inflater: LayoutInflater, container: ViewGroup?) {
        _binding = DataBindingUtil.inflate(inflater, getLayoutId(), container, false)

        rootView = binding.root
        binding.lifecycleOwner = this
        binding.executePendingBindings()
    }

    open fun registerListener() {}

    open fun unRegisterListener() {}

    open fun getFragmentArguments() {}

    open fun setBindingVariables() {}

    open fun setUpViews() {}

    open fun observeAPICall() {}

    open fun setupObservers() {}
}