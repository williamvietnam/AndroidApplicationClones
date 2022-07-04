package com.nbgsoftware.gbrains.di.module;

import android.app.Application;
import android.content.Context;

import com.nbgsoftware.gbrains.data.DataManager;
import com.nbgsoftware.gbrains.data.DataManagerImplement;
import com.nbgsoftware.gbrains.data.local.preferences.PreferencesHelper;
import com.nbgsoftware.gbrains.data.local.preferences.PreferencesHelperImplement;
import com.nbgsoftware.gbrains.data.remote.ApiHelper;
import com.nbgsoftware.gbrains.data.remote.ApiHelperImplement;
import com.nbgsoftware.gbrains.di.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(DataManagerImplement dataManagerImpl) {
        return dataManagerImpl;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(PreferencesHelperImplement preferencesHelperImpl) {
        return preferencesHelperImpl;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(ApiHelperImplement apiHelperImpl) {
        return apiHelperImpl;
    }

//    @Provides
//    @Singleton
//    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
//                                                           PreferencesHelper preferencesHelper) {
//        return new ApiHeader.ProtectedApiHeader(
//                apiKey,
//                preferencesHelper.getCurrentUserId(),
//                preferencesHelper.getAccessToken());
//    }
}
