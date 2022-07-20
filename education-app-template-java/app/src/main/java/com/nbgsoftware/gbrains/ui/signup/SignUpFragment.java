package com.nbgsoftware.gbrains.ui.signup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.nbgsoftware.gbrains.baseMVP.MVPFragmentPresenter;
import com.nbgsoftware.gbrains.databinding.FragmentSignUpBinding;
import com.nbgsoftware.gbrains.di.component.ActivityComponent;

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
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            presenter.attachView(this);
        }
    }

//    @Override
//    public SignUpContract.Presenter<SignUpContract.View> getPresenter() {
//        return new SignUpPresenter<>();
//    }

    @Override
    public void initialize() {

    }
}
