package com.nbgsoftware.gbrains.di.components;

import com.nbgsoftware.gbrains.ui.container.ContainerActivity;
import com.nbgsoftware.gbrains.ui.splash.SplashFragment;

public interface ActivityComponent {

    void inject(ContainerActivity activity);

    void inject(SplashFragment fragment);
}
