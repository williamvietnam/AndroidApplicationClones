package com.nbgsoftware.gbrains.baseMVP;

import androidx.annotation.StringRes;

public interface MVPContract {
    interface View {
        void showMessage(String message);

        void showMessage(@StringRes int resId);

        boolean isNetworkConnected();

        void hideKeyboard();
    }

    interface Presenter<V extends View> {
        void onAttach(V view);

        void onViewCreated();

        void onDestroy();
    }
}
