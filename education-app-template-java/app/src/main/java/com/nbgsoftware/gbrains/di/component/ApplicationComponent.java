package com.nbgsoftware.gbrains.di.component;

import android.app.Application;
import android.content.Context;

import com.nbgsoftware.gbrains.EducationAppTemplate;
import com.nbgsoftware.gbrains.di.ApplicationContext;
import com.nbgsoftware.gbrains.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(EducationAppTemplate app);

    @ApplicationContext
    Context context();

    Application application();
}