package com.nbgsoftware.gbrains.ui.signin;

import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;

public class SignInPresenter<V extends SignInContract.View>
        extends MVPPresenter<V> implements SignInContract.Presenter<V> {

    @Override
    public void loginSuccessDefault(String account, String password) {
        if (account.equals("admin") && password.equals("123")) {
            getView().openMainScreen();
        } else {
            getView().showMessage("Tài khoản: admin\nMật khẩu: 123");
        }
    }
}
