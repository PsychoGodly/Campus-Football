package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class m9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24835a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v8 f24836b;

    m9(v8 v8Var, lb lbVar) {
        this.f24836b = v8Var;
        this.f24835a = lbVar;
    }

    public final void run() {
        i w10 = this.f24836b.f25132d;
        if (w10 == null) {
            this.f24836b.zzj().B().a("Failed to send consent settings to service");
            return;
        }
        try {
            q.k(this.f24835a);
            w10.L(this.f24835a);
            this.f24836b.b0();
        } catch (RemoteException e10) {
            this.f24836b.zzj().B().b("Failed to send consent settings to the service", e10);
        }
    }
}
