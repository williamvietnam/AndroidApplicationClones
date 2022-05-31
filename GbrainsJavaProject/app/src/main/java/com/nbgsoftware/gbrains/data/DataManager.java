package com.nbgsoftware.gbrains.data;

import com.nbgsoftware.gbrains.data.local.database.DatabaseHelper;
import com.nbgsoftware.gbrains.data.local.preferences.PreferencesHelper;
import com.nbgsoftware.gbrains.data.remote.ApiHelper;

public interface DataManager extends DatabaseHelper, PreferencesHelper, ApiHelper {
}
