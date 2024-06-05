package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f26656a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f26657b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final FirebaseInstanceId f26658c;

    /* renamed from: d  reason: collision with root package name */
    ExecutorService f26659d = b.b();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private v f26660a;

        public a(v vVar) {
            this.f26660a = vVar;
        }

        public void a() {
            if (FirebaseInstanceId.q()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            this.f26660a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public void onReceive(Context context, Intent intent) {
            v vVar = this.f26660a;
            if (vVar != null && vVar.c()) {
                if (FirebaseInstanceId.q()) {
                    Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
                }
                this.f26660a.f26658c.g(this.f26660a, 0);
                this.f26660a.b().unregisterReceiver(this);
                this.f26660a = null;
            }
        }
    }

    v(FirebaseInstanceId firebaseInstanceId, long j10) {
        this.f26658c = firebaseInstanceId;
        this.f26656a = j10;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f26657b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* access modifiers changed from: package-private */
    public Context b() {
        return this.f26658c.h().m();
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    public boolean d() throws IOException {
        if (!this.f26658c.E(this.f26658c.o())) {
            return true;
        }
        try {
            if (this.f26658c.d() == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            if (k.g(e10.getMessage())) {
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 52);
                sb2.append("Token retrieval failed: ");
                sb2.append(message);
                sb2.append(". Will retry token retrieval");
                Log.w("FirebaseInstanceId", sb2.toString());
                return false;
            } else if (e10.getMessage() == null) {
                Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e10;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public void run() {
        if (t.a().c(b())) {
            this.f26657b.acquire();
        }
        try {
            this.f26658c.B(true);
            if (!this.f26658c.r()) {
                this.f26658c.B(false);
                if (!t.a().c(b())) {
                    return;
                }
            } else if (!t.a().b(b()) || c()) {
                if (d()) {
                    this.f26658c.B(false);
                } else {
                    this.f26658c.D(this.f26656a);
                }
                if (!t.a().c(b())) {
                    return;
                }
            } else {
                new a(this).a();
                if (!t.a().c(b())) {
                    return;
                }
            }
        } catch (IOException e10) {
            String message = e10.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 93);
            sb2.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb2.append(message);
            sb2.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb2.toString());
            this.f26658c.B(false);
            if (!t.a().c(b())) {
                return;
            }
        } catch (Throwable th) {
            if (t.a().c(b())) {
                this.f26657b.release();
            }
            throw th;
        }
        this.f26657b.release();
    }
}
