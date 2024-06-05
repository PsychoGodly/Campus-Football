package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class d8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ y6 f24475a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f24476b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f24477c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f24478d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ y6 f24479f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ b7 f24480g;

    d8(b7 b7Var, y6 y6Var, long j10, long j11, boolean z10, y6 y6Var2) {
        this.f24480g = b7Var;
        this.f24475a = y6Var;
        this.f24476b = j10;
        this.f24477c = j11;
        this.f24478d = z10;
        this.f24479f = y6Var2;
    }

    public final void run() {
        this.f24480g.E(this.f24475a);
        this.f24480g.z(this.f24476b, false);
        b7.G(this.f24480g, this.f24475a, this.f24477c, true, this.f24478d);
        if (zzps.zza() && this.f24480g.a().n(e0.f24539x0)) {
            b7.H(this.f24480g, this.f24475a, this.f24479f);
        }
    }
}
