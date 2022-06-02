package com.nbgsoftware.gbrains.base;

public abstract class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {

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