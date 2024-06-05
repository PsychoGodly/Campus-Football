package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class h6 implements Callable<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24626a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24627b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24628c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a6 f24629d;

    h6(a6 a6Var, String str, String str2, String str3) {
        this.f24629d = a6Var;
        this.f24626a = str;
        this.f24627b = str2;
        this.f24628c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24629d.f24356a.j0();
        return this.f24629d.f24356a.Z().M(this.f24626a, this.f24627b, this.f24628c);
    }
}
