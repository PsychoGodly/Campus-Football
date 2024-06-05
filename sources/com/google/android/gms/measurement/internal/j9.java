package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class j9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24725a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v8 f24726b;

    j9(v8 v8Var, lb lbVar) {
        this.f24726b = v8Var;
        this.f24725a = lbVar;
    }

    public final void run() {
        i w10 = this.f24726b.f25132d;
        if (w10 == null) {
            this.f24726b.zzj().B().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            q.k(this.f24725a);
            w10.N(this.f24725a);
            this.f24726b.b0();
        } catch (RemoteException e10) {
            this.f24726b.zzj().B().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
