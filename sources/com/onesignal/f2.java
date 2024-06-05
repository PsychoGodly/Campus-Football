package com.onesignal;

import com.onesignal.k3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: OSNotificationOpenedResult */
public class f2 implements k3.n0 {

    /* renamed from: a  reason: collision with root package name */
    private final e3 f27734a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f27735b;

    /* renamed from: c  reason: collision with root package name */
    private w1 f27736c;

    /* renamed from: d  reason: collision with root package name */
    private x1 f27737d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27738e = false;

    /* compiled from: OSNotificationOpenedResult */
    class a implements Runnable {
        a() {
        }

        public void run() {
            k3.a(k3.r0.DEBUG, "Running complete from OSNotificationOpenedResult timeout runnable!");
            f2.this.c(false);
        }
    }

    public f2(w1 w1Var, x1 x1Var) {
        this.f27736c = w1Var;
        this.f27737d = x1Var;
        e3 b10 = e3.b();
        this.f27734a = b10;
        a aVar = new a();
        this.f27735b = aVar;
        b10.c(UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS, aVar);
    }

    /* access modifiers changed from: private */
    public void c(boolean z10) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "OSNotificationOpenedResult complete called with opened: " + z10);
        this.f27734a.a(this.f27735b);
        if (this.f27738e) {
            k3.A1(r0Var, "OSNotificationOpenedResult already completed");
            return;
        }
        this.f27738e = true;
        if (z10) {
            k3.E(this.f27736c.t());
        }
        k3.P1(this);
    }

    public void a(k3.i0 i0Var) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.A1(r0Var, "OSNotificationOpenedResult onEntryStateChange called with appEntryState: " + i0Var);
        c(k3.i0.APP_CLOSE.equals(i0Var));
    }

    public x1 d() {
        return this.f27737d;
    }

    public w1 e() {
        return this.f27736c;
    }

    public String toString() {
        return "OSNotificationOpenedResult{notification=" + this.f27736c + ", action=" + this.f27737d + ", isComplete=" + this.f27738e + '}';
    }
}
