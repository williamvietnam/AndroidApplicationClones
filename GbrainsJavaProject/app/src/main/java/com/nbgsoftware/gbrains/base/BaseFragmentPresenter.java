package com.nbgsoftware.gbrains.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

public abstract class BaseFragmentPresenter<VB extends ViewBinding, P extends BaseContract.Presenter<BaseContract.View>>
        extends Fragment implements BaseContract.View {

    public VB binding;
    public P presenter = createPresenter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = createViewBinding(inflater, container);
        return binding.getRoot();
    }

    public abstract P createPresenter();

    public abstract VB createViewBinding(LayoutInflater inflater, ViewGroup container);
}
