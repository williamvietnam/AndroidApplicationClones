package com.nbgsoftware.gbrains.baseMVP;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.viewbinding.ViewBinding;

import com.nbgsoftware.gbrains.di.component.ActivityComponent;

public abstract class MVPFragment<VB extends ViewBinding> extends Fragment implements MVPContract.View {

    private MVPActivity<VB> activity;
    public VB binding;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof MVPActivity) {
            MVPActivity<VB> activity = (MVPActivity<VB>) context;
            this.activity = activity;
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = getViewBinding(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialize();
    }

    @Override
    public void onDestroyView() {
        binding = null;
        super.onDestroyView();
    }

    public NavController findNavController() {
        return Navigation.findNavController(binding.getRoot());
    }

    @Override
    public void showMessage(String message) {
        if (activity != null) {
            activity.showMessage(message);
        }
    }

    @Override
    public void showMessage(int resId) {
        if (activity != null) {
            activity.showMessage(resId);
        }
    }

    @Override
    public boolean isNetworkConnected() {
        if (activity != null) {
            return activity.isNetworkConnected();
        }
        return false;
    }

    @Override
    public void hideKeyboard() {
        if (activity != null) {
            activity.hideKeyboard();
        }
    }

    public ActivityComponent getActivityComponent() {
        if (activity != null) {
            return activity.getActivityComponent();
        }
        return null;
    }

    public String getFragmentTag() {
        return this.getClass().getCanonicalName();
    }

    public MVPActivity<VB> getBaseActivity() {
        return activity;
    }

    public abstract VB getViewBinding(LayoutInflater inflater, ViewGroup container);
}
