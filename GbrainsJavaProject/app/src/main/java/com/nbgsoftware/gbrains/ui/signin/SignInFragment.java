package com.nbgsoftware.gbrains.ui.signin;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nbgsoftware.gbrains.baseMVP.MVPFragment;
import com.nbgsoftware.gbrains.databinding.FragmentSignInBinding;

public class SignInFragment extends MVPFragment<FragmentSignInBinding> implements SignInContract.View {
    @Override
    public FragmentSignInBinding createViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSignInBinding.inflate(inflater, container, false);
    }
}
