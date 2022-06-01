package com.nbgsoftware.gbrains.ui.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.base.BaseFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSplashBinding;
import com.nbgsoftware.gbrains.di.components.ActivityComponent;

import javax.inject.Inject;

public class SplashFragment extends BaseFragment<FragmentSplashBinding> implements SplashContract.View {

    @Inject
    SplashContract.Presenter<SplashContract.View> presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            presenter.onAttach(this);
        }
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

    @Override
    public void showData(int number) {
        binding.tvData.setText(number);
    }
}
