package com.nbgsoftware.gbrains.ui.splash;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;
import com.nbgsoftware.gbrains.data.models.Splash;
import com.nbgsoftware.gbrains.utils.LinkResource;

public class SplashPresenter<V extends SplashContract.View>
        extends MVPPresenter<V> implements SplashContract.Presenter<V> {

    @Override
    public void getData() {
        Splash splash = new Splash(LinkResource.URL_SPLASH_2, "Cộng đồng Gbrains", "Cùng nhau học tập và chia sẻ kiến thức");
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

