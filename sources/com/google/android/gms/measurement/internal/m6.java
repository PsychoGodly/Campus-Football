package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zznp;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class m6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lb f24825a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a6 f24826b;

    m6(a6 a6Var, lb lbVar) {
        this.f24826b = a6Var;
        this.f24825a = lbVar;
    }

    public final void run() {
        this.f24826b.f24356a.j0();
        va M0 = this.f24826b.f24356a;
        lb lbVar = this.f24825a;
        M0.zzl().i();
        M0.k0();
        q.g(lbVar.f24779a);
        y6 f10 = y6.f(lbVar.f24800w, (!zznp.zza() || !M0.X().n(e0.T0)) ? 100 : lbVar.B);
        y6 L = M0.L(lbVar.f24779a);
        M0.zzj().F().c("Setting consent, package, consent", lbVar.f24779a, f10);
        M0.x(lbVar.f24779a, f10);
        if (f10.t(L)) {
            M0.W(lbVar);
        }
        if (zznp.zza() && M0.X().n(e0.T0)) {
            v c10 = v.c(lbVar.C);
            if (!v.f25107f.equals(c10)) {
                M0.zzj().F().c("Setting DMA consent. package, consent", lbVar.f24779a, c10);
                M0.w(lbVar.f24779a, c10);
            }
        }
    }
}
