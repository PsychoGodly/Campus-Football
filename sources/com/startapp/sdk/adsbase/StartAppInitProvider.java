package com.startapp.sdk.adsbase;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.startapp.c8;
import com.startapp.h0;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public class StartAppInitProvider extends ContentProvider {
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        Object obj = StartAppSDKInternal.D;
        Context a10 = h0.a(context);
        if (a10 != null) {
            context = a10;
        }
        StartAppSDKInternal.d.f16847a.g(context);
        ComponentLocator.a(context).h().execute(new c8(context));
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
