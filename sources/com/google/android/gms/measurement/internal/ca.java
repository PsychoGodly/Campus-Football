package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final /* synthetic */ class ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ aa f24441a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ int f24442b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ n4 f24443c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Intent f24444d;

    public /* synthetic */ ca(aa aaVar, int i10, n4 n4Var, Intent intent) {
        this.f24441a = aaVar;
        this.f24442b = i10;
        this.f24443c = n4Var;
        this.f24444d = intent;
    }

    public final void run() {
        this.f24441a.d(this.f24442b, this.f24443c, this.f24444d);
    }
}
