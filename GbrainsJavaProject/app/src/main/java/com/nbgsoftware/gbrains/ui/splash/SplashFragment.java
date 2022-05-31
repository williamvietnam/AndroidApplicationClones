package com.nbgsoftware.gbrains.ui.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.base.BaseFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSplashBinding;

public class SplashFragment extends BaseFragment<FragmentSplashBinding> implements SplashContract.View {

    SplashPresenter<SplashContract.View> presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.onAttach(this);
    }

    @Override
    public FragmentSplashBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSplashBinding.inflate(inflater, container, false);
    }

    @Override
    public void openMainScreen() {

    }

    @Override
    public void openWelcomeScreen() {

    }

    @Override
    public void openSignInScreen() {

    }

    @Override
    public void startSyncService() {
        //nothing
    }
}
