package com.nbgsoftware.gbrains.di.modules;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.nbgsoftware.gbrains.ui.splash.SplashContract;
import com.nbgsoftware.gbrains.ui.splash.SplashPresenter;
import com.nbgsoftware.gbrains.utils.rx.AppSchedulerProvider;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/**
 * Tạm thời chưa sử dụng dependency injection
 * */
@Module
public class ActivityModule {

    public AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    Context provideContext() {
        return activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    SplashPresenter<SplashContract.View> provideSplash(SplashPresenter<SplashContract.View> presenter) {
        return presenter;
    }
}
