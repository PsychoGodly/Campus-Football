package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.de;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxReward;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f9738a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ de f9739b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MaxReward f9740c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f9741d;

    public /* synthetic */ n0(g.c cVar, de deVar, MaxReward maxReward, Bundle bundle) {
        this.f9738a = cVar;
        this.f9739b = deVar;
        this.f9740c = maxReward;
        this.f9741d = bundle;
    }

    public final void run() {
        this.f9738a.a(this.f9739b, this.f9740c, this.f9741d);
    }
}
