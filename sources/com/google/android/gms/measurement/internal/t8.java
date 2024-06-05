package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class t8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p8 f25076a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f25077b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ o8 f25078c;

    t8(o8 o8Var, p8 p8Var, long j10) {
        this.f25078c = o8Var;
        this.f25076a = p8Var;
        this.f25077b = j10;
    }

    public final void run() {
        this.f25078c.J(this.f25076a, false, this.f25077b);
        o8 o8Var = this.f25078c;
        o8Var.f24893e = null;
        o8Var.o().E((p8) null);
    }
}
