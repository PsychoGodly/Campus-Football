package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcv;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class c9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24438a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzcv f24439b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ v8 f24440c;

    c9(v8 v8Var, lb lbVar, zzcv zzcv) {
        this.f24440c = v8Var;
        this.f24438a = lbVar;
        this.f24439b = zzcv;
    }

    public final void run() {
        try {
            if (!this.f24440c.e().E().y()) {
                this.f24440c.zzj().H().a("Analytics storage consent denied; will not get app instance id");
                this.f24440c.m().M((String) null);
                this.f24440c.e().f25269g.b((String) null);
                return;
            }
            i w10 = this.f24440c.f25132d;
            if (w10 == null) {
                this.f24440c.zzj().B().a("Failed to get app instance id");
                this.f24440c.f().M(this.f24439b, (String) null);
                return;
            }
            q.k(this.f24438a);
            String Z = w10.Z(this.f24438a);
            if (Z != null) {
                this.f24440c.m().M(Z);
                this.f24440c.e().f25269g.b(Z);
            }
            this.f24440c.b0();
            this.f24440c.f().M(this.f24439b, Z);
        } catch (RemoteException e10) {
            this.f24440c.zzj().B().b("Failed to get app instance id", e10);
        } finally {
            this.f24440c.f().M(this.f24439b, (String) null);
        }
    }
}
