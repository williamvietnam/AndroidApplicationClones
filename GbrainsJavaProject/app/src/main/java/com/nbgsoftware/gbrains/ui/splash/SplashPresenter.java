package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.base.BasePresenter;
import com.nbgsoftware.gbrains.data.DataManager;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashContract.View> extends BasePresenter<V>
        implements SplashContract.Presenter<V> {

    private int number = 0;

    @Inject
    public SplashPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void decideNextScreen() {
        if (getView() != null) {
            if (!getDataManager().isShowedWelcomeScreen()) {
                getView().openWelcomeScreen();
            }
        }
    }

    @Override
    public void increase() {
        number++;
        getView().showData(number);
    }
}
