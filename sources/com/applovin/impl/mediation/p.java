package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9745a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9746b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9747c;

    public /* synthetic */ p(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f9745a = gVar;
        this.f9746b = maxAdapterResponseParameters;
        this.f9747c = activity;
    }

    public final void run() {
        this.f9745a.d(this.f9746b, this.f9747c);
    }
}
