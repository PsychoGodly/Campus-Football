package com.applovin.impl;

import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class ru implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f11237a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaxAdListener f11238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f11239c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ MaxError f11240d;

    public /* synthetic */ ru(boolean z10, MaxAdListener maxAdListener, String str, MaxError maxError) {
        this.f11237a = z10;
        this.f11238b = maxAdListener;
        this.f11239c = str;
        this.f11240d = maxError;
    }

    public final void run() {
        bc.a(this.f11237a, this.f11238b, this.f11239c, this.f11240d);
    }
}
