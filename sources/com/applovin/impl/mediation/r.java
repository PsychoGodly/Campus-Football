package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9758a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9759b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9760c;

    public /* synthetic */ r(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f9758a = gVar;
        this.f9759b = maxAdapterResponseParameters;
        this.f9760c = activity;
    }

    public final void run() {
        this.f9758a.c(this.f9759b, this.f9760c);
    }
}
