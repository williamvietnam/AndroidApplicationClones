package com.nbgsoftware.gbrains;

import androidx.multidex.MultiDexApplication;

import com.nbgsoftware.gbrains.di.component.ApplicationComponent;
import com.nbgsoftware.gbrains.di.component.DaggerApplicationComponent;
import com.nbgsoftware.gbrains.di.module.ApplicationModule;

public class EducationAppTemplate extends MultiDexApplication {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }
}
