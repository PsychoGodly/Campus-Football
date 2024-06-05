package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class k7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f24748a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24749b;

    k7(b7 b7Var, boolean z10) {
        this.f24749b = b7Var;
        this.f24748a = z10;
    }

    public final void run() {
        boolean k10 = this.f24749b.f25124a.k();
        boolean j10 = this.f24749b.f25124a.j();
        this.f24749b.f25124a.h(this.f24748a);
        if (j10 == this.f24748a) {
            this.f24749b.f25124a.zzj().F().b("Default data collection state already set to", Boolean.valueOf(this.f24748a));
        }
        if (this.f24749b.f25124a.k() == k10 || this.f24749b.f25124a.k() != this.f24749b.f25124a.j()) {
            this.f24749b.f25124a.zzj().H().c("Default data collection is different than actual status", Boolean.valueOf(this.f24748a), Boolean.valueOf(k10));
        }
        this.f24749b.o0();
    }
}
