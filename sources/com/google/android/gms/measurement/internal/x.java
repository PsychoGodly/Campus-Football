package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.a;
import com.google.android.gms.common.internal.q;
import java.util.Map;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class x extends z3 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f25222b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f25223c = new a();

    /* renamed from: d  reason: collision with root package name */
    private long f25224d;

    public x(w5 w5Var) {
        super(w5Var);
    }

    private final void r(long j10, p8 p8Var) {
        if (p8Var == null) {
            zzj().F().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            zzj().F().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            ib.R(p8Var, bundle, true);
            m().u0("am", "_xa", bundle);
        }
    }

    static /* synthetic */ void t(x xVar, String str, long j10) {
        xVar.i();
        q.g(str);
        if (xVar.f25223c.isEmpty()) {
            xVar.f25224d = j10;
        }
        Integer num = xVar.f25223c.get(str);
        if (num != null) {
            xVar.f25223c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (xVar.f25223c.size() >= 100) {
            xVar.zzj().G().a("Too many ads visible");
        } else {
            xVar.f25223c.put(str, 1);
            xVar.f25222b.put(str, Long.valueOf(j10));
        }
    }

    private final void v(String str, long j10, p8 p8Var) {
        if (p8Var == null) {
            zzj().F().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            zzj().F().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            ib.R(p8Var, bundle, true);
            m().u0("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    public final void w(long j10) {
        for (String put : this.f25222b.keySet()) {
            this.f25222b.put(put, Long.valueOf(j10));
        }
        if (!this.f25222b.isEmpty()) {
            this.f25224d = j10;
        }
    }

    static /* synthetic */ void x(x xVar, String str, long j10) {
        xVar.i();
        q.g(str);
        Integer num = xVar.f25223c.get(str);
        if (num != null) {
            p8 x10 = xVar.n().x(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                xVar.f25223c.remove(str);
                Long l10 = xVar.f25222b.get(str);
                if (l10 == null) {
                    xVar.zzj().B().a("First ad unit exposure time was never set");
                } else {
                    xVar.f25222b.remove(str);
                    xVar.v(str, j10 - l10.longValue(), x10);
                }
                if (xVar.f25223c.isEmpty()) {
                    long j11 = xVar.f25224d;
                    if (j11 == 0) {
                        xVar.zzj().B().a("First ad exposure time was never set");
                        return;
                    }
                    xVar.r(j10 - j11, x10);
                    xVar.f25224d = 0;
                    return;
                }
                return;
            }
            xVar.f25223c.put(str, Integer.valueOf(intValue));
            return;
        }
        xVar.zzj().B().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ i4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ l4 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ b7 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ o8 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ v8 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ da p() {
        return super.p();
    }

    public final void q(long j10) {
        p8 x10 = n().x(false);
        for (String next : this.f25222b.keySet()) {
            v(next, j10 - this.f25222b.get(next).longValue(), x10);
        }
        if (!this.f25222b.isEmpty()) {
            r(j10 - this.f25224d, x10);
        }
        w(j10);
    }

    public final void u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new a(this, str, j10));
        }
    }

    public final void y(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().B().a("Ad unit id must be a non-empty string");
        } else {
            zzl().y(new x1(this, str, j10));
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
