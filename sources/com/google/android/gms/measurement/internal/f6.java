package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class f6 implements Callable<List<jb>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24578a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24579b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24580c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a6 f24581d;

    f6(a6 a6Var, String str, String str2, String str3) {
        this.f24581d = a6Var;
        this.f24578a = str;
        this.f24579b = str2;
        this.f24580c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24581d.f24356a.j0();
        return this.f24581d.f24356a.Z().t0(this.f24578a, this.f24579b, this.f24580c);
    }
}
