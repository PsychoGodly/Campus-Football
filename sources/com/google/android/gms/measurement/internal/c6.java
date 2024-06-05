package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class c6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24432a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a6 f24433b;

    c6(a6 a6Var, lb lbVar) {
        this.f24433b = a6Var;
        this.f24432a = lbVar;
    }

    public final void run() {
        this.f24433b.f24356a.j0();
        va M0 = this.f24433b.f24356a;
        lb lbVar = this.f24432a;
        M0.zzl().i();
        M0.k0();
        q.g(lbVar.f24779a);
        M0.d(lbVar);
    }
}
