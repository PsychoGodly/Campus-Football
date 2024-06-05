package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;

public abstract class th {
    public static boolean a(Context context) {
        return x3.a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    public static boolean b(Context context) {
        return x3.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    public static boolean c(Context context) {
        return x3.a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    public static boolean d(Context context) {
        return x3.a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    public static boolean e(Context context) {
        return f(context) && AdServicesState.isAdServicesStateEnabled();
    }

    public static boolean f(Context context) {
        return x3.c() && !AppLovinSdkUtils.isFireOS(context);
    }
}
