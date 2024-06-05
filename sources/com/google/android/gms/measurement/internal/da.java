package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcp;
import m5.e;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final class da extends y2 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f24484c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f24485d = true;

    /* renamed from: e  reason: collision with root package name */
    protected final la f24486e = new la(this);

    /* renamed from: f  reason: collision with root package name */
    protected final ja f24487f = new ja(this);

    /* renamed from: g  reason: collision with root package name */
    private final ia f24488g = new ia(this);

    da(w5 w5Var) {
        super(w5Var);
    }

    /* access modifiers changed from: private */
    public final void B() {
        i();
        if (this.f24484c == null) {
            this.f24484c = new zzcp(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void D(da daVar, long j10) {
        daVar.i();
        daVar.B();
        daVar.zzj().F().b("Activity resumed, time", Long.valueOf(j10));
        if (daVar.a().n(e0.Q0)) {
            if (daVar.a().L() || daVar.f24485d) {
                daVar.f24487f.f(j10);
            }
        } else if (daVar.a().L() || daVar.e().f25281s.b()) {
            daVar.f24487f.f(j10);
        }
        daVar.f24488g.a();
        la laVar = daVar.f24486e;
        laVar.f24778a.i();
        if (laVar.f24778a.f25124a.k()) {
            laVar.b(laVar.f24778a.zzb().a(), false);
        }
    }

    static /* synthetic */ void x(da daVar, long j10) {
        daVar.i();
        daVar.B();
        daVar.zzj().F().b("Activity paused, time", Long.valueOf(j10));
        daVar.f24488g.b(j10);
        if (daVar.a().L()) {
            daVar.f24487f.e(j10);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean A() {
        i();
        return this.f24485d;
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

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void y(boolean z10) {
        i();
        this.f24485d = z10;
    }

    public final boolean z(boolean z10, boolean z11, long j10) {
        return this.f24487f.d(z10, z11, j10);
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
