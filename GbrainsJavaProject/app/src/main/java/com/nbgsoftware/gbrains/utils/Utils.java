package com.nbgsoftware.gbrains.utils;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Utils {

    /**
     * Phương thức này giúp ta lấy được chuỗi trong file json từ file lưu trong assets
     */
    @Nullable
    public static String getJsonFromAssets(String filename, @NonNull Context context) {
        String jsonString;
        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            jsonString = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return jsonString;
    }
}

