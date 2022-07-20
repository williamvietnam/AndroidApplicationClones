package com.nbgsoftware.gbrains.di.component;

import com.nbgsoftware.gbrains.di.PerActivity;
import com.nbgsoftware.gbrains.di.module.ActivityModule;
import com.nbgsoftware.gbrains.ui.container.ContainerActivity;
import com.nbgsoftware.gbrains.ui.main.MainFragment;
import com.nbgsoftware.gbrains.ui.signin.SignInFragment;
import com.nbgsoftware.gbrains.ui.signup.SignUpFragment;
import com.nbgsoftware.gbrains.ui.splash.SplashFragment;
import com.nbgsoftware.gbrains.ui.welcome.WelcomeFragment;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

//    void inject(ContainerActivity activity);

    void inject(SplashFragment fragment);

    void inject(WelcomeFragment fragment);

    void inject(SignInFragment fragment);

    void inject(SignUpFragment fragment);

    void inject(MainFragment fragment);
}
