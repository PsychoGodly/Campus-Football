package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.ads.BuildConfig;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
@Keep
public class BuildConfigApi {
    static final String UNITY_SHARED_PREFERENCES_SUFIX = ".v2.playerprefs";
    static final String UNITY_TAG = "an_isUnitySDK";
    static final String UNITY_VERSION_SUFIX = "-unity";

    public static String getVersionName(Context context) {
        if (!isUnity(context)) {
            return BuildConfig.VERSION_NAME;
        }
        return BuildConfig.VERSION_NAME + UNITY_VERSION_SUFIX;
    }

    public static boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    private static boolean isUnity(Context context) {
        if (context.getSharedPreferences(context.getPackageName() + UNITY_SHARED_PREFERENCES_SUFIX, 0).contains(UNITY_TAG) || context.getSharedPreferences(context.getPackageName(), 0).contains(UNITY_TAG)) {
            return true;
        }
        return false;
    }
}
