package com.applovin.impl;

import java.lang.ref.WeakReference;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class yv implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cr f13716a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WeakReference f13717b;

    public /* synthetic */ yv(cr crVar, WeakReference weakReference) {
        this.f13716a = crVar;
        this.f13717b = weakReference;
    }

    public final void run() {
        this.f13716a.a(this.f13717b);
    }
}
