package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9779a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9780b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxAdapterInitializationParameters f9781c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f9782d;

    public /* synthetic */ w(g gVar, Runnable runnable, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        this.f9779a = gVar;
        this.f9780b = runnable;
        this.f9781c = maxAdapterInitializationParameters;
        this.f9782d = activity;
    }

    public final void run() {
        this.f9779a.a(this.f9780b, this.f9781c, this.f9782d);
    }
}
