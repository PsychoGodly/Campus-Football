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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n5.b;

/* compiled from: SyncTask */
class y0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f26920a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f26921b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseMessaging f26922c;

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f26923d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("firebase-iid-executor"));

    /* compiled from: SyncTask */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private y0 f26924a;

        public a(y0 y0Var) {
            this.f26924a = y0Var;
        }

        public void a() {
            if (y0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f26924a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            y0 y0Var = this.f26924a;
            if (y0Var != null && y0Var.d()) {
                if (y0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f26924a.f26922c.p(this.f26924a, 0);
                this.f26924a.b().unregisterReceiver(this);
                this.f26924a = null;
            }
        }
    }

    public y0(FirebaseMessaging firebaseMessaging, long j10) {
        this.f26922c = firebaseMessaging;
        this.f26920a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f26921b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f26922c.q();
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean e() throws IOException {
        try {
            if (this.f26922c.n() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            } else {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            }
        } catch (IOException e10) {
            if (e0.h(e10.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (u0.b().e(b())) {
            this.f26921b.acquire();
        }
        try {
            this.f26922c.O(true);
            if (!this.f26922c.z()) {
                this.f26922c.O(false);
                if (u0.b().e(b())) {
                    this.f26921b.release();
                }
            } else if (!u0.b().d(b()) || d()) {
                if (e()) {
                    this.f26922c.O(false);
                } else {
                    this.f26922c.S(this.f26920a);
                }
                if (!u0.b().e(b())) {
                    return;
                }
                this.f26921b.release();
            } else {
                new a(this).a();
                if (u0.b().e(b())) {
                    this.f26921b.release();
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f26922c.O(false);
            if (!u0.b().e(b())) {
            }
        } catch (Throwable th) {
            if (u0.b().e(b())) {
                this.f26921b.release();
            }
            throw th;
        }
    }
}
