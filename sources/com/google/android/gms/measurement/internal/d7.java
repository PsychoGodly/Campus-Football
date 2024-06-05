package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class d7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ b7 f24473a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Bundle f24474b;

    public /* synthetic */ d7(b7 b7Var, Bundle bundle) {
        this.f24473a = b7Var;
        this.f24474b = bundle;
    }

    public final void run() {
        this.f24473a.A(this.f24474b);
    }
}
