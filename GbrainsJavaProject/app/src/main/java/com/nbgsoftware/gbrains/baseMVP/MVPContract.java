package com.nbgsoftware.gbrains.baseMVP;

import androidx.annotation.StringRes;
import androidx.lifecycle.LifecycleObserver;

public interface MVPContract {
    interface View {
        void initialize();

        void showMessage(String message);

        void showMessage(@StringRes int resId);

        boolean isNetworkConnected();

        void hideKeyboard();
    }

    interface Presenter<V extends View>{
        void attachView(V view);

        boolean isViewAttached();

        V getView();

        void onCreateScreen();

        void onDestroyScreen();
    }
}
