package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class j5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ i5 f24719a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f24720b;

    public /* synthetic */ j5(i5 i5Var, String str) {
        this.f24719a = i5Var;
        this.f24720b = str;
    }

    public final Object call() {
        return new zzm("internal.remoteConfig", new p5(this.f24719a, this.f24720b));
    }
}
