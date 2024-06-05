package com.startapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: Sta */
public class z4 {

    /* renamed from: a  reason: collision with root package name */
    public String f17580a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17581b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17582c = true;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f17583d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f17584e;

    public z4(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    if (obj != null) {
                        this.f17580a = obj.toString();
                        Log.i("StartAppSDK", "appId is " + this.f17580a);
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.RETURN_ADS_ENABLED")) {
                        this.f17581b = applicationInfo.metaData.getBoolean("com.startapp.sdk.RETURN_ADS_ENABLED");
                        Log.i("StartAppSDK", "returnAds enabled: " + this.f17581b);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.SPLASH_ENABLED")) {
                        this.f17582c = applicationInfo.metaData.getBoolean("com.startapp.sdk.SPLASH_ENABLED");
                        Log.i("StartAppSDK", "splash enabled: " + this.f17582c);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        this.f17583d = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        Log.i("StartAppSDK", "is mixed audience: " + this.f17583d);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        this.f17584e = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        Log.i("StartAppSDK", "is child directed: " + this.f17584e);
                    }
                }
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }
}
