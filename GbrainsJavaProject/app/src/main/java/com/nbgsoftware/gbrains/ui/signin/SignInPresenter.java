package com.nbgsoftware.gbrains.ui.signin;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;

import java.util.Objects;

import javax.inject.Inject;

public class SignInPresenter<V extends SignInContract.View>
        extends MVPPresenter<V> implements SignInContract.Presenter<V> {

    @Inject
    public SignInPresenter(){
        super();
    }

    @Override
    public void loginSuccessDefault(String account, String password) {
        if ((Objects.equals(account, "admin")) && (Objects.equals(password, "123"))) {
            if (getView() != null) {
                getView().openMainScreen();
            }
        }
    }

    @Override
    public void login(String account, String password) {

    }
}
