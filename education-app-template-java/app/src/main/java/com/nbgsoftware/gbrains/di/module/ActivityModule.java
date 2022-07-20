package com.nbgsoftware.gbrains.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.nbgsoftware.gbrains.di.ActivityContext;
import com.nbgsoftware.gbrains.ui.main.MainContract;
import com.nbgsoftware.gbrains.ui.main.MainPresenter;
import com.nbgsoftware.gbrains.ui.signin.SignInContract;
import com.nbgsoftware.gbrains.ui.signin.SignInPresenter;
import com.nbgsoftware.gbrains.ui.signup.SignUpContract;
import com.nbgsoftware.gbrains.ui.signup.SignUpPresenter;
import com.nbgsoftware.gbrains.ui.splash.SplashContract;
import com.nbgsoftware.gbrains.ui.splash.SplashPresenter;
import com.nbgsoftware.gbrains.ui.welcome.WelcomeContract;
import com.nbgsoftware.gbrains.ui.welcome.WelcomePresenter;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProviderImpl;

import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
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
        return new SchedulerProviderImpl();
    }

    @Provides
    SplashContract.Presenter<SplashContract.View> provideSplashPresenter(SplashPresenter<SplashContract.View> presenter) {
        return presenter;
    }

    @Provides
    WelcomeContract.Presenter<WelcomeContract.View> provideWelcomePresenter(WelcomePresenter<WelcomeContract.View> presenter) {
        return presenter;
    }

    @Provides
    SignInContract.Presenter<SignInContract.View> provideSignInPresenter(SignInPresenter<SignInContract.View> presenter) {
        return presenter;
    }

    @Provides
    SignUpContract.Presenter<SignUpContract.View> provideSignUpPresenter(SignUpPresenter<SignUpContract.View> presenter) {
        return presenter;
    }

    @Provides
    MainContract.Presenter<MainContract.View> provideMainPresenter(MainPresenter<MainContract.View> presenter) {
        return presenter;
    }
}
