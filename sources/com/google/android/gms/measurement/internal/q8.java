package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class q8 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f24977a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ p8 f24978b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ p8 f24979c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f24980d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ o8 f24981f;

    q8(o8 o8Var, Bundle bundle, p8 p8Var, p8 p8Var2, long j10) {
        this.f24981f = o8Var;
        this.f24977a = bundle;
        this.f24978b = p8Var;
        this.f24979c = p8Var2;
        this.f24980d = j10;
    }

    public final void run() {
        o8.E(this.f24981f, this.f24977a, this.f24978b, this.f24979c, this.f24980d);
    }
}
