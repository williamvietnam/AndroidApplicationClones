package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.base.BaseContract;

public interface SplashContract extends BaseContract {
    interface View extends BaseContract.View {
        void openMainScreen();

        void openWelcomeScreen();

        void openSignInScreen();

        void startSyncService();
    }

    interface Presenter<V extends View> extends BaseContract.Presenter<V> {
        void decideNextScreen();
    }
}
