package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcv;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class x8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f25244a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f25245b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ lb f25246c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f25247d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzcv f25248f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ v8 f25249g;

    x8(v8 v8Var, String str, String str2, lb lbVar, boolean z10, zzcv zzcv) {
        this.f25249g = v8Var;
        this.f25244a = str;
        this.f25245b = str2;
        this.f25246c = lbVar;
        this.f25247d = z10;
        this.f25248f = zzcv;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            i w10 = this.f25249g.f25132d;
            if (w10 == null) {
                this.f25249g.zzj().B().c("Failed to get user properties; not connected to service", this.f25244a, this.f25245b);
                return;
            }
            q.k(this.f25246c);
            bundle = ib.A(w10.Y0(this.f25244a, this.f25245b, this.f25247d, this.f25246c));
            this.f25249g.b0();
            this.f25249g.f().L(this.f25248f, bundle);
        } catch (RemoteException e10) {
            this.f25249g.zzj().B().c("Failed to get user properties; remote exception", this.f25244a, e10);
        } finally {
            this.f25249g.f().L(this.f25248f, bundle);
        }
    }
}
