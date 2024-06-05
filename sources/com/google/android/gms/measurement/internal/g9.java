package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import i5.a;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class g9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24607a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v8 f24608b;

    g9(v8 v8Var, lb lbVar) {
        this.f24608b = v8Var;
        this.f24607a = lbVar;
    }

    public final void run() {
        i w10 = this.f24608b.f25132d;
        if (w10 == null) {
            this.f24608b.zzj().B().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            q.k(this.f24607a);
            w10.p0(this.f24607a);
            this.f24608b.l().E();
            this.f24608b.O(w10, (a) null, this.f24607a);
            this.f24608b.b0();
        } catch (RemoteException e10) {
            this.f24608b.zzj().B().b("Failed to send app launch to the service", e10);
        }
    }
}
