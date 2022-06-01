package com.nbgsoftware.gbrains;

import androidx.multidex.MultiDexApplication;

import com.nbgsoftware.gbrains.data.DataManager;

public class GbrainsApp extends MultiDexApplication {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
