package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import java.util.concurrent.atomic.AtomicBoolean;
import y6.f;
import y6.p;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a  reason: collision with root package name */
    private static p f26931a = p.e();

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f26932b = new AtomicBoolean(false);

    private static void a(ProviderInfo providerInfo) {
        q.l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static p b() {
        return f26931a;
    }

    public static boolean c() {
        return f26932b.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
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
        try {
            f26932b.set(true);
            if (f.u(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            f26932b.set(false);
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
