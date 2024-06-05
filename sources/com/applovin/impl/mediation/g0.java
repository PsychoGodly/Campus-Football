package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.g;
import com.applovin.impl.wj;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wj f9697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.e f9698c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxSignalProvider f9699d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterSignalCollectionParameters f9700f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Activity f9701g;

    public /* synthetic */ g0(g gVar, wj wjVar, g.e eVar, MaxSignalProvider maxSignalProvider, MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity) {
        this.f9696a = gVar;
        this.f9697b = wjVar;
        this.f9698c = eVar;
        this.f9699d = maxSignalProvider;
        this.f9700f = maxAdapterSignalCollectionParameters;
        this.f9701g = activity;
    }

    public final void run() {
        this.f9696a.a(this.f9697b, this.f9698c, this.f9699d, this.f9700f, this.f9701g);
    }
}
