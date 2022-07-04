package com.nbgsoftware.gbrains.data;

import android.content.Context;

import com.nbgsoftware.gbrains.data.local.database.DatabaseHelper;
import com.nbgsoftware.gbrains.data.local.preferences.PreferencesHelper;
import com.nbgsoftware.gbrains.data.remote.ApiHelper;
import com.nbgsoftware.gbrains.di.ApplicationContext;

public class DataManagerImplement implements DataManager {

    private static final String TAG = "AppDataManager";

    private final Context context;
    private final DatabaseHelper databaseHelper;
    private final PreferencesHelper preferencesHelper;
    private final ApiHelper apiHelper;

    public DataManagerImplement(@ApplicationContext Context context,
                                DatabaseHelper databaseHelper,
                                PreferencesHelper preferencesHelper,
                                ApiHelper apiHelper) {
        this.context = context;
        this.databaseHelper = databaseHelper;
        this.preferencesHelper = preferencesHelper;
        this.apiHelper = apiHelper;
    }

    @Override
    public boolean isShowedWelcomeScreen() {
        return false;
    }

    @Override
    public void setShowedWelcomeScreen() {

    }

    @Override
    public void clearAllDataExceptWelcome() {

    }
}
