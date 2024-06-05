package com.applovin.impl;

import com.applovin.mediation.MaxAdRequestListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class su implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f12188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdRequestListener f12189b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12190c;

    public /* synthetic */ su(boolean z10, MaxAdRequestListener maxAdRequestListener, String str) {
        this.f12188a = z10;
        this.f12189b = maxAdRequestListener;
        this.f12190c = str;
    }

    public final void run() {
        bc.a(this.f12188a, this.f12189b, this.f12190c);
    }
}
