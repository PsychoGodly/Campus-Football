package com.applovin.impl;

import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

public class cn extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f7000h;

    /* renamed from: i  reason: collision with root package name */
    private final JSONObject f7001i;

    /* renamed from: j  reason: collision with root package name */
    private final AppLovinAdLoadListener f7002j;

    public cn(JSONObject jSONObject, JSONObject jSONObject2, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskRenderAppLovinAd", kVar);
        this.f7000h = jSONObject;
        this.f7001i = jSONObject2;
        this.f7002j = appLovinAdLoadListener;
    }

    public void run() {
        if (t.a()) {
            this.f13423c.a(this.f13422b, "Rendering ad...");
        }
        a aVar = new a(this.f7000h, this.f7001i, this.f13421a);
        boolean booleanValue = JsonUtils.getBoolean(this.f7000h, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f7000h, "vs_load_immediately", Boolean.TRUE).booleanValue();
        bm bmVar = new bm(aVar, this.f13421a, this.f7002j);
        bmVar.c(booleanValue2);
        bmVar.b(booleanValue);
        this.f13421a.l0().a((xl) bmVar, sm.b.CACHING);
    }
}
