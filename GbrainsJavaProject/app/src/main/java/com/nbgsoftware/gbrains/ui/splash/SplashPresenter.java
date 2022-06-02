package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.base.BasePresenter;

public class SplashPresenter<V extends SplashContract.View> extends BasePresenter<V>
        implements SplashContract.Presenter<V> {

    private static int number = 0;

    @Override
    public void decideNextScreen() {
        if (getView() != null) {

        }
    }

    @Override
    public void increase() {
        number++;
        getView().showData(number);
    }
}
