package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class n6 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d0 f24860a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24861b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f24862c;

    n6(a6 a6Var, d0 d0Var, String str) {
        this.f24862c = a6Var;
        this.f24860a = d0Var;
        this.f24861b = str;
    }

    public final void run() {
        this.f24862c.f24356a.j0();
        this.f24862c.f24356a.p(this.f24860a, this.f24861b);
    }
}
