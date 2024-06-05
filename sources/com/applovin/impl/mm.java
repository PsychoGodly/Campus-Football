package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import java.util.HashMap;
import java.util.Map;

public class mm extends om {

    /* renamed from: k  reason: collision with root package name */
    private final w f9807k;

    public mm(w wVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super(h0.a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, kVar);
        this.f9807k = wVar;
    }

    /* access modifiers changed from: protected */
    public Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f9807k.b());
        hashMap.put("adtoken_prefix", this.f9807k.d());
        return hashMap;
    }
}
