package com.nbgsoftware.gbrains.base;

import com.nbgsoftware.gbrains.data.DataManager;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {

    private final DataManager dataManager;
    private final SchedulerProvider schedulerProvider;
    private CompositeDisposable compositeDisposable;

    private V view;

    public BasePresenter(DataManager dataManager,
                         SchedulerProvider schedulerProvider,
                         CompositeDisposable compositeDisposable) {
        this.dataManager = dataManager;
        this.schedulerProvider = schedulerProvider;
    }

    public V getView() {
        return view;
    }

    public boolean isViewAttached() {
        return this.view != null;
    }

    public DataManager getDataManager() {
        return this.dataManager;
    }

    public SchedulerProvider getSchedulerProvider() {
        return this.schedulerProvider;
    }

    public CompositeDisposable getCompositeDisposable() {
        return this.compositeDisposable;
    }

    @Override
    public void onAttach(V view) {
        this.view = view;
        this.compositeDisposable = new CompositeDisposable();
    }

    @Override
    public void onDetach() {
        compositeDisposable.dispose();
        this.view = null;
    }

    @Override
    public void setUserAsLoggedOut() {

    }

    @Override
    public boolean isUserVerified() {
        return false;
    }

    @Override
    public void setUserVerified(boolean value) {

    }

    @Override
    public String getMyRole() {
        return null;
    }

    @Override
    public String getMyName() {
        return null;
    }
}
