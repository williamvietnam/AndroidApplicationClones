package com.nbgsoftware.gbrains.di.component;

import com.nbgsoftware.gbrains.di.PerActivity;
import com.nbgsoftware.gbrains.di.module.ServiceModule;

import dagger.Component;

/*
 * hence they need to be in same scope (@PerActivity)
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceActivityComponent {

}
