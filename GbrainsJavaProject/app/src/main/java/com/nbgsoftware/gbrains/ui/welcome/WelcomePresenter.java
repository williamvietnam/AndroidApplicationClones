package com.nbgsoftware.gbrains.ui.welcome;

import android.content.Context;

import com.google.gson.Gson;
import com.nbgsoftware.gbrains.baseMVP.MVPPresenter;
import com.nbgsoftware.gbrains.data.models.response.WelcomeResponse;
import com.nbgsoftware.gbrains.utils.Utils;

public class WelcomePresenter<V extends WelcomeContract.View>
        extends MVPPresenter<V> implements WelcomeContract.Presenter<V> {

    @Override
    public void getData(Context context) {
        if (getView() != null) {
            String json = Utils.getJsonFromAssets("welcome.json", context);
            Gson gson = new Gson();
            WelcomeResponse response = gson.fromJson(json, WelcomeResponse.class);
            getView().showData(response);
        }
    }
}
