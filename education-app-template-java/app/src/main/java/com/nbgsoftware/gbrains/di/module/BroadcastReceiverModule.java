package com.nbgsoftware.gbrains.di.module;

import android.content.BroadcastReceiver;

import com.nbgsoftware.gbrains.utils.rx.SchedulerProvider;
import com.nbgsoftware.gbrains.utils.rx.SchedulerProviderImpl;

import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

@Module
public class BroadcastReceiverModule {

    private final BroadcastReceiver receiver;


    public BroadcastReceiverModule(BroadcastReceiver receiver) {
        this.receiver = receiver;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new SchedulerProviderImpl();
    }

}
