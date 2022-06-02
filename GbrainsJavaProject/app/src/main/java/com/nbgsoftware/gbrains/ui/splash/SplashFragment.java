package com.nbgsoftware.gbrains.ui.splash;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSplashBinding;

public class SplashFragment extends MVPFragment<FragmentSplashBinding> implements SplashContract.View {

    SplashContract.Presenter<SplashContract.View> presenter = new SplashPresenter<>();

    @Override
    public FragmentSplashBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSplashBinding.inflate(inflater, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        presenter.onAttach(this);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewCreated();

        binding.button.setOnClickListener(view1 -> presenter.increase());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
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
        binding.tvData.setText(String.valueOf(number));
    }
}
