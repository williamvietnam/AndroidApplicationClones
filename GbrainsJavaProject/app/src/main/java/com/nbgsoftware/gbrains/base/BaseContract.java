package com.nbgsoftware.gbrains.base;

import androidx.annotation.StringRes;

public interface BaseContract {
    interface View {
//        void showLoading();

//        void hideLoading();

//        void openActivityOnTokenExpire();

//        void onTokenExpire();

//        void onError(@StringRes int resId);

//        void onError(String message);

        void showMessage(String message);

        void showMessage(@StringRes int resId);

        boolean isNetworkConnected();

        void hideKeyboard();
    }

    interface Presenter<V extends View> {
        void onAttach(V view);

        void onDetach();

//        void handleApiError(ANError error);

        void setUserAsLoggedOut();

        boolean isUserVerified();

        void setUserVerified(boolean value);

        String getMyRole();

        String getMyName();

    }
}
