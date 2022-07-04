package com.nbgsoftware.gbrains.ui.splash;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPFragmentPresenter;
import com.nbgsoftware.gbrains.data.models.Splash;
import com.nbgsoftware.gbrains.databinding.FragmentSplashBinding;
import com.nbgsoftware.gbrains.di.component.ActivityComponent;

public class SplashFragment extends MVPFragmentPresenter<
        FragmentSplashBinding,
        SplashContract.View,
        SplashContract.Presenter<SplashContract.View>>
        implements SplashContract.View {

    @Override
    public FragmentSplashBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSplashBinding.inflate(inflater, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            presenter.attachView(this);
        }
    }

    //    @Override
//    public SplashContract.Presenter<SplashContract.View> getPresenter() {
//        return new SplashPresenter<>();
//    }

    @Override
    public void initialize() {
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
