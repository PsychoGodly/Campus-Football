package com.applovin.impl.mediation;

import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxAdListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f9754a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9755b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f9756c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f9757d;

    public /* synthetic */ q0(g.c cVar, Runnable runnable, MaxAdListener maxAdListener, String str) {
        this.f9754a = cVar;
        this.f9755b = runnable;
        this.f9756c = maxAdListener;
        this.f9757d = str;
    }

    public final void run() {
        this.f9754a.a(this.f9755b, this.f9756c, this.f9757d);
    }
}
