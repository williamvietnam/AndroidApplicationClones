package com.nbgsoftware.gbrains.baseMVP;

public abstract class MVPPresenter<V extends MVPContract.View> implements MVPContract.Presenter<V> {

    private V view;

    public V getView() {
        return view;
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
    }

    @Override
    public void onViewCreated() {

    }

    @Override
    public void onDestroy() {
        this.view = null;
    }
}