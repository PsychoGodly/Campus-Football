package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class q6 implements Callable<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d0 f24973a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24974b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a6 f24975c;

    q6(a6 a6Var, d0 d0Var, String str) {
        this.f24975c = a6Var;
        this.f24973a = d0Var;
        this.f24974b = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24975c.f24356a.j0();
        return this.f24975c.f24356a.e0().t(this.f24973a, this.f24974b);
    }
}
