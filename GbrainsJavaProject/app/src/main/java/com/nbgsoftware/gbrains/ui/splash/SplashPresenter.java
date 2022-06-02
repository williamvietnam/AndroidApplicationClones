package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;

public class SplashPresenter<V extends SplashContract.View> extends MVPPresenter<V>
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
