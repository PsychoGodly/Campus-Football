package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class e9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p8 f24562a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ v8 f24563b;

    e9(v8 v8Var, p8 p8Var) {
        this.f24563b = v8Var;
        this.f24562a = p8Var;
    }

    public final void run() {
        i w10 = this.f24563b.f25132d;
        if (w10 == null) {
            this.f24563b.zzj().B().a("Failed to send current screen to service");
            return;
        }
        try {
            p8 p8Var = this.f24562a;
            if (p8Var == null) {
                w10.l0(0, (String) null, (String) null, this.f24563b.zza().getPackageName());
            } else {
                w10.l0(p8Var.f24934c, p8Var.f24932a, p8Var.f24933b, this.f24563b.zza().getPackageName());
            }
            this.f24563b.b0();
        } catch (RemoteException e10) {
            this.f24563b.zzj().B().b("Failed to send current screen to the service", e10);
        }
    }
}
