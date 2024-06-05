package com.google.android.gms.measurement.internal;

import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class t9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f25079a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s9 f25080b;

    t9(s9 s9Var, i iVar) {
        this.f25080b = s9Var;
        this.f25079a = iVar;
    }

    public final void run() {
        synchronized (this.f25080b) {
            this.f25080b.f25055a = false;
            if (!this.f25080b.f25057c.X()) {
                this.f25080b.f25057c.zzj().A().a("Connected to remote service");
                this.f25080b.f25057c.N(this.f25079a);
            }
        }
    }
}
