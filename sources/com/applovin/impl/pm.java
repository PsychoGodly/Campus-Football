package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

public class pm extends nm {

    /* renamed from: k  reason: collision with root package name */
    private final w f10686k;

    public pm(w wVar, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super(h0.a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", kVar);
        this.f10686k = wVar;
    }

    /* access modifiers changed from: protected */
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f10686k.b());
        hashMap.put("adtoken_prefix", this.f10686k.d());
        return hashMap;
    }
}
