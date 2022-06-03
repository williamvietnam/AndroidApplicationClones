package com.nbgsoftware.gbrains.ui.splash;

import android.graphics.Bitmap;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;
import com.nbgsoftware.gbrains.data.models.Splash;

public interface SplashContract {
    interface View extends MVPContract.View {

        void showData(Splash splash);

        void openMainScreen();

        void openWelcomeScreen();

        void openSignInScreen();
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V> {
        void getData();

        void decideNextScreen();
    }
}
