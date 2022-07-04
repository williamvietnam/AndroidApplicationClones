package com.nbgsoftware.gbrains.di.component;

import android.app.Application;
import android.content.Context;

import com.nbgsoftware.gbrains.GbrainsApp;
import com.nbgsoftware.gbrains.data.DataManager;
import com.nbgsoftware.gbrains.di.ApplicationContext;
import com.nbgsoftware.gbrains.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(GbrainsApp app);

    @ApplicationContext
    Context context();

    Application application();
}