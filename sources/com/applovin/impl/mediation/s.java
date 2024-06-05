package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9762a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9763b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9764c;

    public /* synthetic */ s(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity) {
        this.f9762a = gVar;
        this.f9763b = maxAdapterResponseParameters;
        this.f9764c = activity;
    }

    public final void run() {
        this.f9762a.e(this.f9763b, this.f9764c);
    }
}
