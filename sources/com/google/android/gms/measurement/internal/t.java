package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w6 f25061a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ u f25062b;

    t(u uVar, w6 w6Var) {
        this.f25062b = uVar;
        this.f25061a = w6Var;
    }

    public final void run() {
        this.f25061a.zzd();
        if (e.a()) {
            this.f25061a.zzl().y(this);
            return;
        }
        boolean e10 = this.f25062b.e();
        this.f25062b.f25088c = 0;
        if (e10) {
            this.f25062b.d();
        }
    }
}
