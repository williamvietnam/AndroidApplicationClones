package com.nbgsoftware.gbrains.di.components;

import com.nbgsoftware.gbrains.ui.container.ContainerActivity;
import com.nbgsoftware.gbrains.ui.splash.SplashFragment;

/**
 * Tạm thời chưa sử dụng dependency injection
 * */
public interface ActivityComponent {

    void inject(ContainerActivity activity);

    void inject(SplashFragment fragment);
}
