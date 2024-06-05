package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f9748a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxError f9749b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f9750c;

    public /* synthetic */ p0(g.c cVar, MaxError maxError, Bundle bundle) {
        this.f9748a = cVar;
        this.f9749b = maxError;
        this.f9750c = bundle;
    }

    public final void run() {
        this.f9748a.a(this.f9749b, this.f9750c);
    }
}
