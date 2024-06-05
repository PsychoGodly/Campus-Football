package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class l9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f24772a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24773b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f24774c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ d0 f24775d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f24776f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ v8 f24777g;

    l9(v8 v8Var, boolean z10, lb lbVar, boolean z11, d0 d0Var, String str) {
        this.f24777g = v8Var;
        this.f24772a = z10;
        this.f24773b = lbVar;
        this.f24774c = z11;
        this.f24775d = d0Var;
        this.f24776f = str;
    }

    public final void run() {
        i w10 = this.f24777g.f25132d;
        if (w10 == null) {
            this.f24777g.zzj().B().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f24772a) {
            q.k(this.f24773b);
            this.f24777g.O(w10, this.f24774c ? null : this.f24775d, this.f24773b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f24776f)) {
                    q.k(this.f24773b);
                    w10.h0(this.f24775d, this.f24773b);
                } else {
                    w10.c1(this.f24775d, this.f24776f, this.f24777g.zzj().J());
                }
            } catch (RemoteException e10) {
                this.f24777g.zzj().B().b("Failed to send event to the service", e10);
            }
        }
        this.f24777g.b0();
    }
}
