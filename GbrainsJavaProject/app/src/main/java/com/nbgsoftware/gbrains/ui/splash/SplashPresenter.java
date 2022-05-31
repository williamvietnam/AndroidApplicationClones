package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.base.BasePresenter;
import com.nbgsoftware.gbrains.data.DataManager;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashContract.View> extends BasePresenter<V>
        implements SplashContract.Presenter<V> {

    public SplashPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onAttach(V view) {
        super.onAttach(view);
        getView().startSyncService();
    }

    @Override
    public void decideNextScreen() {
        if (getView() != null) {
            if (!getDataManager().isShowedWelcomeScreen()) {
                getView().openWelcomeScreen();
            }
        }
    }
}
