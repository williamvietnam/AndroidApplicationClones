package com.nbgsoftware.gbrains.ui.signin;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;

public interface SignInContract {
    interface View extends MVPContract.View {
        void openSignUpScreen();

        void openMainScreen();
    }

    interface Presenter<V extends View> extends MVPContract.Presenter<V>{
        void loginSuccessDefault(String account, String password);

        void login(String account, String password);
    }
}
