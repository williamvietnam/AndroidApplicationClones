package com.nbgsoftware.gbrains.baseMVP;

import android.os.Bundle;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

public abstract class MVPFragmentPresenter<
        VB extends ViewBinding,
        V extends MVPContract.View,
        P extends MVPContract.Presenter<V>>
        extends MVPFragment<VB> implements MVPContract.View {

    public P presenter;

    public abstract P getPresenter();

    @SuppressWarnings("unchecked")
    @CallSuper
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (presenter == null){
            presenter = getPresenter();
        }
        getLifecycle().addObserver(presenter);
        presenter.attachView((V) this);
    }
}
