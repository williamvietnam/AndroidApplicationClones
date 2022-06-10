package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.R;
import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;
import com.nbgsoftware.gbrains.data.models.Splash;

public class SplashPresenter<V extends SplashContract.View>
        extends MVPPresenter<V> implements SplashContract.Presenter<V> {

    @Override
    public void getData() {
        Splash splash = new Splash(R.drawable.thumbnail_splash, "Cộng đồng Gbrains", "Cùng nhau học tập và chia sẻ kiến thức");
        if (getView() != null) {
            getView().showData(splash);
        }
    }

    @Override
    public void decideNextScreen() {
        if (getView() != null) {
            getView().openWelcomeScreen();
        }
    }
}

