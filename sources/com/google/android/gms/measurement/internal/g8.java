package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzps;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class g8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ y6 f24602a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f24603b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f24604c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ y6 f24605d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ b7 f24606f;

    g8(b7 b7Var, y6 y6Var, long j10, boolean z10, y6 y6Var2) {
        this.f24606f = b7Var;
        this.f24602a = y6Var;
        this.f24603b = j10;
        this.f24604c = z10;
        this.f24605d = y6Var2;
    }

    public final void run() {
        this.f24606f.E(this.f24602a);
        b7.G(this.f24606f, this.f24602a, this.f24603b, false, this.f24604c);
        if (zzps.zza() && this.f24606f.a().n(e0.f24539x0)) {
            b7.H(this.f24606f, this.f24602a, this.f24605d);
        }
    }
}
