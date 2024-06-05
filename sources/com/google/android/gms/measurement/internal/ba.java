package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class ba implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ va f24409a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f24410b;

    ba(aa aaVar, va vaVar, Runnable runnable) {
        this.f24409a = vaVar;
        this.f24410b = runnable;
    }

    public final void run() {
        this.f24409a.j0();
        this.f24409a.t(this.f24410b);
        this.f24409a.o0();
    }
}
