package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class g6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d f24598a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a6 f24599b;

    g6(a6 a6Var, d dVar) {
        this.f24599b = a6Var;
        this.f24598a = dVar;
    }

    public final void run() {
        this.f24599b.f24356a.j0();
        if (this.f24598a.f24448c.v() == null) {
            this.f24599b.f24356a.m(this.f24598a);
        } else {
            this.f24599b.f24356a.N(this.f24598a);
        }
    }
}
