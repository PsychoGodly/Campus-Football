package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class s8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ p8 f25050a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p8 f25051b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f25052c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f25053d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ o8 f25054f;

    s8(o8 o8Var, p8 p8Var, p8 p8Var2, long j10, boolean z10) {
        this.f25054f = o8Var;
        this.f25050a = p8Var;
        this.f25051b = p8Var2;
        this.f25052c = j10;
        this.f25053d = z10;
    }

    public final void run() {
        this.f25054f.I(this.f25050a, this.f25051b, this.f25052c, this.f25053d, (Bundle) null);
    }
}
