package com.google.android.gms.measurement.internal;

import w6.c;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class l7 implements c<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ na f24765a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b7 f24766b;

    l7(b7 b7Var, na naVar) {
        this.f24766b = b7Var;
        this.f24765a = naVar;
    }

    public final void a(Throwable th) {
        this.f24766b.i();
        this.f24766b.f24394i = false;
        this.f24766b.m0();
        this.f24766b.zzj().B().b("registerTriggerAsync failed with throwable", th);
    }

    public final void onSuccess(Object obj) {
        this.f24766b.i();
        this.f24766b.f24394i = false;
        this.f24766b.m0();
        this.f24766b.zzj().A().b("registerTriggerAsync ran. uri", this.f24765a.f24870a);
    }
}
