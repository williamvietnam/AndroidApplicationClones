package com.nbgsoftware.gbrains.base;

import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.viewbinding.ViewBinding;

public abstract class BaseDialog<VB extends ViewBinding> extends DialogFragment implements BaseDialogView {

    private BaseActivity<VB> activity;
    public VB binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = createViewBinding(inflater, container);
        return binding.getRoot();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof BaseActivity) {
            this.activity =  (BaseActivity<VB>) context;
        }
    }

    @Override
    public void dismissDialog(String tag) {
        dismiss();
    }

    public BaseActivity<VB> getBaseActivity() {
        return activity;
    }

    public abstract VB createViewBinding(LayoutInflater inflater, ViewGroup container);
}
