package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class a9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24371a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v8 f24372b;

    a9(v8 v8Var, lb lbVar) {
        this.f24372b = v8Var;
        this.f24371a = lbVar;
    }

    public final void run() {
        i w10 = this.f24372b.f25132d;
        if (w10 == null) {
            this.f24372b.zzj().B().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            q.k(this.f24371a);
            w10.s(this.f24371a);
        } catch (RemoteException e10) {
            this.f24372b.zzj().B().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f24372b.b0();
    }
}
