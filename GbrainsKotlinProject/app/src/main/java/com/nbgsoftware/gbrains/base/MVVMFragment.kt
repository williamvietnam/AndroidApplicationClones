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
import com.nbgsoftware.gbrains.utilities.hideLoadingDialog
import com.nbgsoftware.gbrains.utilities.showLoadingDialog
import java.util.*

abstract class MVVMFragment<DB : ViewDataBinding> : Fragment() {

    private var _binding: DB? = null
    open val binding get() = _binding!!
    private var rootView: View? = null
    private var hasInitializedRootView = false
    private var progressDialog: Dialog? = null

    @LayoutRes
    abstract fun getLayoutId(): Int

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

    fun showLoading(hint: String?) {
        hideLoading()
        progressDialog = showLoadingDialog(requireActivity(), hint)
    }

    fun showLoading() {
        hideLoading()
        progressDialog = showLoadingDialog(requireActivity(), null)
    }

    fun hideLoading() {
        hideLoadingDialog(progressDialog, requireActivity())
    }

    fun setLanguage(language: String) {
        (requireActivity() as MVVMActivity<*>).updateLocale(language)
    }

    val currentLanguage: Locale
        get() = Locale.getDefault()
}