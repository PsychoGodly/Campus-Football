package com.google.android.gms.measurement.internal;

import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class r9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ i f25027a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ s9 f25028b;

    r9(s9 s9Var, i iVar) {
        this.f25028b = s9Var;
        this.f25027a = iVar;
    }

    public final void run() {
        synchronized (this.f25028b) {
            this.f25028b.f25055a = false;
            if (!this.f25028b.f25057c.X()) {
                this.f25028b.f25057c.zzj().F().a("Connected to service");
                this.f25028b.f25057c.N(this.f25027a);
            }
        }
    }
}
