package com.nbgsoftware.gbrains.baseMVP;

import androidx.annotation.StringRes;

public interface BaseActivityView {
    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();
}
