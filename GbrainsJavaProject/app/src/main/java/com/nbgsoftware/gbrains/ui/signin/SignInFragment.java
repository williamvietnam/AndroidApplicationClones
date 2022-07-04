package com.nbgsoftware.gbrains.ui.signin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPFragmentPresenter;
import com.nbgsoftware.gbrains.databinding.FragmentSignInBinding;
import com.nbgsoftware.gbrains.di.component.ActivityComponent;

public class SignInFragment extends MVPFragmentPresenter<
        FragmentSignInBinding,
        SignInContract.View,
        SignInContract.Presenter<SignInContract.View>>
        implements SignInContract.View {

    @Override
    public FragmentSignInBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSignInBinding.inflate(inflater, container, false);
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
//    public SignInContract.Presenter<SignInContract.View> getPresenter() {
//        return new SignInPresenter<>();
//    }

    @Override
    public void initialize() {
        login();
        openSignUpScreen();
    }

    private void login() {
        binding.buttonLogin.setOnClickListener(view -> {
            String userName = binding.edtUserName.getText();
            String password = binding.edtPassword.getText();
            if (userName.equals("admin") && password.equals("123")) {
                findNavController().navigate(R.id.actionSignInToMain);
            }
        });
    }

    @Override
    public void openSignUpScreen() {
        binding.buttonRegister.setOnClickListener(view -> findNavController().navigate(R.id.actionSignInToSignUp));
    }

    @Override
    public void openMainScreen() {
        findNavController().navigate(R.id.actionSignInToMain);
    }
}
