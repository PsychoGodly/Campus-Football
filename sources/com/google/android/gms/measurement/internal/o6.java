package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class o6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d0 f24883a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24884b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f24885c;

    o6(a6 a6Var, d0 d0Var, lb lbVar) {
        this.f24885c = a6Var;
        this.f24883a = d0Var;
        this.f24884b = lbVar;
    }

    public final void run() {
        this.f24885c.F1(this.f24885c.D1(this.f24883a, this.f24884b), this.f24884b);
    }
}
