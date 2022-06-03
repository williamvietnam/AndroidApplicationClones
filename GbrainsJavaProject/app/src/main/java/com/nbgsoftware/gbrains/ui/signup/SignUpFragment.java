package com.nbgsoftware.gbrains.ui.signup;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSignUpBinding;

public class SignUpFragment extends MVPFragment<FragmentSignUpBinding> implements SignUpContract.View {
    @Override
    public FragmentSignUpBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSignUpBinding.inflate(inflater, container, false);
    }
}
