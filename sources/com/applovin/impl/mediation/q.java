package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9751a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9752b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9753c;

    public /* synthetic */ q(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f9751a = gVar;
        this.f9752b = maxAdapterResponseParameters;
        this.f9753c = activity;
    }

    public final void run() {
        this.f9751a.b(this.f9752b, this.f9753c);
    }
}
