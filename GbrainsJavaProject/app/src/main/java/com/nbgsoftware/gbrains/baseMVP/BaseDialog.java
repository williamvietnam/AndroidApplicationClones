package com.nbgsoftware.gbrains.baseMVP;

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

    private MVPActivity<VB> activity;
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
        if (context instanceof MVPActivity) {
            this.activity =  (MVPActivity<VB>) context;
        }
    }

    @Override
    public void dismissDialog(String tag) {
        dismiss();
    }

    public MVPActivity<VB> getBaseActivity() {
        return activity;
    }

    public abstract VB createViewBinding(LayoutInflater inflater, ViewGroup container);
}
