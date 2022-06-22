package com.nbgsoftware.gbrains.ui.signin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSignInBinding;

public class SignInFragment extends MVPFragment<FragmentSignInBinding> implements SignInContract.View {

    SignInContract.Presenter<SignInContract.View> presenter = new SignInPresenter<>();

    @Override
    public FragmentSignInBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSignInBinding.inflate(inflater, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.onViewCreated();

        login();
        openSignUpScreen();
    }

    private void login() {
        binding.buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = binding.edtUserName.getText();
                String password = binding.edtPassword.getText();
                if (userName.equals("admin") && password.equals("123")) {
                    findNavController().navigate(R.id.actionSignInToMain);
                }
            }
        });
    }

    @Override
    public void openSignUpScreen() {
        binding.buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findNavController().navigate(R.id.actionSignInToSignUp);
            }
        });
    }

    @Override
    public void openMainScreen() {
        findNavController().navigate(R.id.actionSignInToMain);
    }
}
