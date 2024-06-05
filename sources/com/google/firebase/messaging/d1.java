package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: TopicsSyncTask */
class d1 implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f26777g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f26778h;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f26779i;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f26780a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f26781b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f26782c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final c1 f26783d;

    /* renamed from: f  reason: collision with root package name */
    private final long f26784f;

    /* compiled from: TopicsSyncTask */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private d1 f26785a;

        public a(d1 d1Var) {
            this.f26785a = d1Var;
        }

        public void a() {
            if (d1.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d1.this.f26780a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            d1 d1Var = this.f26785a;
            if (d1Var != null) {
                if (d1Var.i()) {
                    if (d1.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f26785a.f26783d.m(this.f26785a, 0);
                    context.unregisterReceiver(this);
                    this.f26785a = null;
                }
            }
        }
    }

    d1(c1 c1Var, Context context, j0 j0Var, long j10) {
        this.f26783d = c1Var;
        this.f26780a = context;
        this.f26784f = j10;
        this.f26781b = j0Var;
        this.f26782c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f26777g) {
            Boolean bool = f26779i;
            if (bool == null) {
                z10 = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f26779i = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z10;
    }

    private static boolean h(Context context) {
        boolean z10;
        boolean booleanValue;
        synchronized (f26777g) {
            Boolean bool = f26778h;
            if (bool == null) {
                z10 = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                z10 = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f26778h = valueOf;
            booleanValue = valueOf.booleanValue();
        }
        return booleanValue;
    }

    /* access modifiers changed from: private */
    public synchronized boolean i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f26780a.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f26780a)) {
            this.f26782c.acquire(d.f26775a);
        }
        try {
            this.f26783d.o(true);
            if (!this.f26781b.g()) {
                this.f26783d.o(false);
                if (h(this.f26780a)) {
                    try {
                        this.f26782c.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!f(this.f26780a) || i()) {
                if (this.f26783d.s()) {
                    this.f26783d.o(false);
                } else {
                    this.f26783d.t(this.f26784f);
                }
                if (h(this.f26780a)) {
                    try {
                        wakeLock = this.f26782c;
                        wakeLock.release();
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else {
                new a(this).a();
                if (h(this.f26780a)) {
                    try {
                        this.f26782c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
            this.f26783d.o(false);
            if (h(this.f26780a)) {
                wakeLock = this.f26782c;
            }
        } catch (Throwable th) {
            if (h(this.f26780a)) {
                try {
                    this.f26782c.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
