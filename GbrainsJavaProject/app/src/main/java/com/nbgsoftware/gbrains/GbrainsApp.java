package com.nbgsoftware.gbrains;

import androidx.multidex.MultiDexApplication;

import com.nbgsoftware.gbrains.di.component.ApplicationComponent;
import com.nbgsoftware.gbrains.di.component.DaggerApplicationComponent;
import com.nbgsoftware.gbrains.di.module.ApplicationModule;

public class GbrainsApp extends MultiDexApplication {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
