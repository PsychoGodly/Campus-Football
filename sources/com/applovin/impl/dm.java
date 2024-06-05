package com.applovin.impl;

import com.applovin.impl.l0;
import com.applovin.impl.sdk.k;

public class dm extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final a f7286h;

    public interface a {
        void a(l0.a aVar);
    }

    public dm(k kVar, a aVar) {
        super("TaskCollectAdvertisingId", kVar, true);
        this.f7286h = aVar;
    }

    public void run() {
        l0.a aVar;
        if (this.f13421a.y() != null) {
            aVar = this.f13421a.z().d();
        } else {
            aVar = this.f13421a.x().f();
        }
        this.f7286h.a(aVar);
    }
}
