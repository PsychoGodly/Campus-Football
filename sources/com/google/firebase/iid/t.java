package com.google.firebase.iid;

import android.content.Context;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class t {

    /* renamed from: c  reason: collision with root package name */
    private static t f26646c;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f26647a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f26648b = null;

    private t() {
    }

    public static synchronized t a() {
        t tVar;
        synchronized (t.class) {
            if (f26646c == null) {
                f26646c = new t();
            }
            tVar = f26646c;
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public boolean b(Context context) {
        if (this.f26648b == null) {
            this.f26648b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f26647a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f26648b.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Context context) {
        if (this.f26647a == null) {
            this.f26647a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f26647a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f26647a.booleanValue();
    }
}
