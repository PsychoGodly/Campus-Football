package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterResponseParameters f9771b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAdFormat f9772c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f9773d;

    public /* synthetic */ u(g gVar, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity) {
        this.f9770a = gVar;
        this.f9771b = maxAdapterResponseParameters;
        this.f9772c = maxAdFormat;
        this.f9773d = activity;
    }

    public final void run() {
        this.f9770a.a(this.f9771b, this.f9772c, this.f9773d);
    }
}
