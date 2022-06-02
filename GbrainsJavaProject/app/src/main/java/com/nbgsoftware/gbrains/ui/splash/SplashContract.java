package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.base.BaseContract;

public interface SplashContract{
    interface View extends BaseContract.View {
        void openMainScreen();

        void openWelcomeScreen();

        void openSignInScreen();

        void startSyncService();

        void showData(int number);
    }

    interface Presenter<V extends View> extends BaseContract.Presenter<V> {
        void decideNextScreen();

        void increase();
    }
}
