package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.k3;

/* compiled from: OSTimeoutHandler */
class e3 extends HandlerThread {

    /* renamed from: b  reason: collision with root package name */
    private static final String f27668b = e3.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f27669c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static e3 f27670d;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f27671a = new Handler(getLooper());

    private e3() {
        super(f27668b);
        start();
    }

    static e3 b() {
        if (f27670d == null) {
            synchronized (f27669c) {
                if (f27670d == null) {
                    f27670d = new e3();
                }
            }
        }
        return f27670d;
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        synchronized (f27669c) {
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "Running destroyTimeout with runnable: " + runnable.toString());
            this.f27671a.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void c(long j10, Runnable runnable) {
        synchronized (f27669c) {
            a(runnable);
            k3.r0 r0Var = k3.r0.DEBUG;
            k3.a(r0Var, "Running startTimeout with timeout: " + j10 + " and runnable: " + runnable.toString());
            this.f27671a.postDelayed(runnable, j10);
        }
    }
}
