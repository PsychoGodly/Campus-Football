package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class k6 implements Callable<List<d>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24744a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24745b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f24746c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ a6 f24747d;

    k6(a6 a6Var, String str, String str2, String str3) {
        this.f24747d = a6Var;
        this.f24744a = str;
        this.f24745b = str2;
        this.f24746c = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f24747d.f24356a.j0();
        return this.f24747d.f24356a.Z().M(this.f24744a, this.f24745b, this.f24746c);
    }
}
