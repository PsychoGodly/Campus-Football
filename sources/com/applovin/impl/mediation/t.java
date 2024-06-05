package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9766a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9767b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9768c;

    public /* synthetic */ t(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f9766a = gVar;
        this.f9767b = maxAdapterResponseParameters;
        this.f9768c = activity;
    }

    public final void run() {
        this.f9766a.a(this.f9767b, this.f9768c);
    }
}
