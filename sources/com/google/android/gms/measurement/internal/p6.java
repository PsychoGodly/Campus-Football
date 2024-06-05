package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class p6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ hb f24920a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ lb f24921b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f24922c;

    p6(a6 a6Var, hb hbVar, lb lbVar) {
        this.f24922c = a6Var;
        this.f24920a = hbVar;
        this.f24921b = lbVar;
    }

    public final void run() {
        this.f24922c.f24356a.j0();
        if (this.f24920a.v() == null) {
            this.f24922c.f24356a.z(this.f24920a.f24640b, this.f24921b);
        } else {
            this.f24922c.f24356a.s(this.f24920a, this.f24921b);
        }
    }
}
