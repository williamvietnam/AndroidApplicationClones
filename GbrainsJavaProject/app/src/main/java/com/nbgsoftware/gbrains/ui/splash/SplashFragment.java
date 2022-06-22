package com.nbgsoftware.gbrains.ui.splash;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.data.models.Splash;
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
        presenter.getData();
    }

    @Override
    public void onResume() {
        super.onResume();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                presenter.decideNextScreen();
            }
        }, 2000);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showData(@NonNull Splash splash) {
        binding.ivSplash.setImageResource(splash.getImageDrawable());
        binding.tvTitleSplash.setText(splash.getTitle());
        binding.tvDescriptionSplash.setText(splash.getDescription());
    }

    @Override
    public void openMainScreen() {
        findNavController().navigate(R.id.actionSplashToMain);
    }

    @Override
    public void openWelcomeScreen() {
        findNavController().navigate(R.id.actionSplashToWelcome);
    }

    @Override
    public void openSignInScreen() {
        findNavController().navigate(R.id.actionSplashToSignIn);
    }
}
