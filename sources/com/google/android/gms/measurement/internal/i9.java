package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class i9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24692a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f24693b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v8 f24694c;

    i9(v8 v8Var, lb lbVar, Bundle bundle) {
        this.f24694c = v8Var;
        this.f24692a = lbVar;
        this.f24693b = bundle;
    }

    public final void run() {
        i w10 = this.f24694c.f25132d;
        if (w10 == null) {
            this.f24694c.zzj().B().a("Failed to send default event parameters to service");
            return;
        }
        try {
            q.k(this.f24692a);
            w10.M(this.f24693b, this.f24692a);
        } catch (RemoteException e10) {
            this.f24694c.zzj().B().b("Failed to send default event parameters to service", e10);
        }
    }
}
