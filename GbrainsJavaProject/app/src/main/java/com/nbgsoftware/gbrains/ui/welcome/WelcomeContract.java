package com.nbgsoftware.gbrains.ui.welcome;

import android.content.Context;

import com.nbgsoftware.gbrains.baseMVP.MVPContract;
import com.nbgsoftware.gbrains.data.models.Welcome;
import com.nbgsoftware.gbrains.data.models.response.WelcomeResponse;

public interface WelcomeContract {
    interface View extends MVPContract.View {
        void showData(WelcomeResponse response);

    }

    interface Presenter<V extends WelcomeContract.View> extends MVPContract.Presenter<V> {
        void getData(Context context);
    }
}
