package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class i6 implements Callable<List<jb>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24678a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24679b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24680c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a6 f24681d;

    i6(a6 a6Var, String str, String str2, String str3) {
        this.f24681d = a6Var;
        this.f24678a = str;
        this.f24679b = str2;
        this.f24680c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24681d.f24356a.j0();
        return this.f24681d.f24356a.Z().t0(this.f24678a, this.f24679b, this.f24680c);
    }
}
