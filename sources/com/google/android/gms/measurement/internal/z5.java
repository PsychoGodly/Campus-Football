package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class z5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ a6 f25315a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f25316b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Bundle f25317c;

    public /* synthetic */ z5(a6 a6Var, String str, Bundle bundle) {
        this.f25315a = a6Var;
        this.f25316b = str;
        this.f25317c = bundle;
    }

    public final void run() {
        this.f25315a.B1(this.f25316b, this.f25317c);
    }
}
