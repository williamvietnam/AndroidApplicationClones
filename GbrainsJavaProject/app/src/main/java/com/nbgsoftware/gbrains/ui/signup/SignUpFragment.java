package com.nbgsoftware.gbrains.ui.signup;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.baseMVP.MVPFragmentPresenter;
import com.nbgsoftware.gbrains.databinding.FragmentSignUpBinding;

public class SignUpFragment extends MVPFragmentPresenter<
        FragmentSignUpBinding,
        SignUpContract.View,
        SignUpContract.Presenter<SignUpContract.View>>
        implements SignUpContract.View {
    @Override
    public FragmentSignUpBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSignUpBinding.inflate(inflater, container, false);
    }

    @Override
    public SignUpContract.Presenter<SignUpContract.View> getPresenter() {
        return new SignUpPresenter<>();
    }

    @Override
    public void initialize() {

    }
}
