package com.nbgsoftware.gbrains.base;

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

import com.nbgsoftware.gbrains.di.components.ActivityComponent;
import com.nbgsoftware.gbrains.utils.AppLogger;

public abstract class BaseFragment<VB extends ViewBinding> extends Fragment implements BaseContract.View {

    private BaseActivity<VB> activity;
    public VB binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = createViewBinding(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        AppLogger.d(getFragmentTag() + ": on attaching to context " + context);
        super.onAttach(context);
        if (context instanceof BaseActivity) {
            BaseActivity activity = (BaseActivity) context;
            this.activity = activity;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
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

    public String getFragmentTag() {
        return this.getClass().getCanonicalName();
    }

    public BaseActivity<VB> getBaseActivity() {
        return activity;
    }

    public abstract VB createViewBinding(LayoutInflater inflater, ViewGroup container);

    public ActivityComponent getActivityComponent() {
        if (activity != null) {
            return activity.getActivityComponent();
        }
        return null;
    }
}
