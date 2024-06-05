package com.applovin.impl.sdk;

import com.applovin.impl.h0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final k f11558a;

    /* renamed from: b  reason: collision with root package name */
    private final t f11559b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f11560c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Map f11561d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map f11562e = new HashMap();

    c(k kVar) {
        this.f11558a = kVar;
        this.f11559b = kVar.L();
        for (h0 h0Var : h0.a()) {
            this.f11561d.put(h0Var, new v());
            this.f11562e.put(h0Var, new v());
        }
    }

    private v b(h0 h0Var) {
        v vVar;
        synchronized (this.f11560c) {
            vVar = (v) this.f11562e.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.f11562e.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    private v c(h0 h0Var) {
        synchronized (this.f11560c) {
            v b10 = b(h0Var);
            if (b10.b() > 0) {
                return b10;
            }
            v d10 = d(h0Var);
            return d10;
        }
    }

    private v d(h0 h0Var) {
        v vVar;
        synchronized (this.f11560c) {
            vVar = (v) this.f11561d.get(h0Var);
            if (vVar == null) {
                vVar = new v();
                this.f11561d.put(h0Var, vVar);
            }
        }
        return vVar;
    }

    public AppLovinAdImpl a(h0 h0Var) {
        AppLovinAdImpl a10;
        synchronized (this.f11560c) {
            a10 = c(h0Var).a();
        }
        return a10;
    }

    public AppLovinAdImpl e(h0 h0Var) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.f11560c) {
            v d10 = d(h0Var);
            if (d10.b() > 0) {
                b(h0Var).a(d10.a());
                cVar = new com.applovin.impl.sdk.ad.c(h0Var, this.f11558a);
            } else {
                cVar = null;
            }
        }
        if (cVar != null) {
            if (t.a()) {
                t tVar = this.f11559b;
                tVar.a("AdPreloadManager", "Retrieved ad of zone " + h0Var + "...");
            }
        } else if (t.a()) {
            t tVar2 = this.f11559b;
            tVar2.a("AdPreloadManager", "Unable to retrieve ad of zone " + h0Var + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(h0 h0Var) {
        AppLovinAdImpl d10;
        synchronized (this.f11560c) {
            d10 = c(h0Var).d();
        }
        return d10;
    }

    /* access modifiers changed from: package-private */
    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f11560c) {
            d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
            if (t.a()) {
                t tVar = this.f11559b;
                tVar.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f11560c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }
}
