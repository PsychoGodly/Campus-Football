package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.ads.zzfkr;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f14925a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f14926b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f14927c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f14928d = new Object();

    public final Handler a() {
        return this.f14926b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.f14928d) {
            if (this.f14927c != 0) {
                q.l(this.f14925a, "Invalid state: handlerThread should already been initialized.");
            } else if (this.f14925a == null) {
                n1.a("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f14925a = handlerThread;
                handlerThread.start();
                this.f14926b = new zzfkr(this.f14925a.getLooper());
                n1.a("Looper thread started.");
            } else {
                n1.a("Resuming the looper thread");
                this.f14928d.notifyAll();
            }
            this.f14927c++;
            looper = this.f14925a.getLooper();
        }
        return looper;
    }
}
