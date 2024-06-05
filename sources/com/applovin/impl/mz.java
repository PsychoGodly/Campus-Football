package com.applovin.impl;

import android.view.View;
import com.applovin.impl.adview.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class mz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9868b;

    public /* synthetic */ mz(g gVar, Runnable runnable) {
        this.f9867a = gVar;
        this.f9868b = runnable;
    }

    public final void run() {
        ar.a((View) this.f9867a, 400, (Runnable) new nz(this.f9867a, this.f9868b));
    }
}
