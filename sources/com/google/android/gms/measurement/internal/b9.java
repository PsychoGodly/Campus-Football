package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import r5.i;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class b9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24405a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f24406b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ hb f24407c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ v8 f24408d;

    b9(v8 v8Var, lb lbVar, boolean z10, hb hbVar) {
        this.f24408d = v8Var;
        this.f24405a = lbVar;
        this.f24406b = z10;
        this.f24407c = hbVar;
    }

    public final void run() {
        i w10 = this.f24408d.f25132d;
        if (w10 == null) {
            this.f24408d.zzj().B().a("Discarding data. Failed to set user property");
            return;
        }
        q.k(this.f24405a);
        this.f24408d.O(w10, this.f24406b ? null : this.f24407c, this.f24405a);
        this.f24408d.b0();
    }
}
