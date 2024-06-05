package com.applovin.impl.mediation;

import com.applovin.impl.bc;
import com.applovin.impl.de;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinSdkUtils;

public class b implements a.C0125a, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final k f9540a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9541b;

    /* renamed from: c  reason: collision with root package name */
    private final c f9542c;

    public b(k kVar) {
        this.f9540a = kVar;
        this.f9541b = new a(kVar);
        this.f9542c = new c(kVar, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void c(de deVar) {
        if (deVar != null && deVar.v().compareAndSet(false, true)) {
            bc.e(deVar.z().c(), deVar);
        }
    }

    public void a(de deVar) {
        c(deVar);
    }

    public void b(de deVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new l(this, deVar), deVar.f0());
    }

    public void e(de deVar) {
        long g02 = deVar.g0();
        if (g02 >= 0) {
            this.f9542c.a(deVar, g02);
        }
        boolean parseBoolean = Boolean.parseBoolean(this.f9540a.g0().getExtraParameters().get("should_schedule_ad_hidden_on_ad_destroy"));
        if (deVar.p0() || deVar.q0() || parseBoolean) {
            this.f9541b.a(parseBoolean);
            this.f9541b.a(deVar, this);
        }
    }

    public void a() {
        this.f9542c.a();
        this.f9541b.a();
    }
}
