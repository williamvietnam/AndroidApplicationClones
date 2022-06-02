package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;

public interface SplashContract{
    interface View extends MVPContract.View {
        void openMainScreen();

        void openWelcomeScreen();

        void openSignInScreen();

        void startSyncService();

        void showData(int number);
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void decideNextScreen();

        void increase();
    }
}
