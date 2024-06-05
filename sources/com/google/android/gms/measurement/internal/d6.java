package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class d6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f24470a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24471b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f24472c;

    d6(a6 a6Var, d dVar, lb lbVar) {
        this.f24472c = a6Var;
        this.f24470a = dVar;
        this.f24471b = lbVar;
    }

    public final void run() {
        this.f24472c.f24356a.j0();
        if (this.f24470a.f24448c.v() == null) {
            this.f24472c.f24356a.n(this.f24470a, this.f24471b);
        } else {
            this.f24472c.f24356a.O(this.f24470a, this.f24471b);
        }
    }
}
