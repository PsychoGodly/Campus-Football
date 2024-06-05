package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class f7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ b7 f24582a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Bundle f24583b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ long f24584c;

    public /* synthetic */ f7(b7 b7Var, Bundle bundle, long j10) {
        this.f24582a = b7Var;
        this.f24583b = bundle;
        this.f24584c = j10;
    }

    public final void run() {
        b7 b7Var = this.f24582a;
        Bundle bundle = this.f24583b;
        long j10 = this.f24584c;
        if (TextUtils.isEmpty(b7Var.k().B())) {
            b7Var.B(bundle, 0, j10);
        } else {
            b7Var.zzj().H().a("Using developer consent only; google app id found");
        }
    }
}
