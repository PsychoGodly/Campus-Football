package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import org.json.JSONObject;

public abstract class om extends gm {

    /* renamed from: j  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f10489j;

    public om(h0 h0Var, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super(h0Var, str, kVar);
        this.f10489j = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    public void a(int i10, String str) {
        super.a(i10, str);
        this.f10489j.onNativeAdLoadFailed(new AppLovinError(i10, str));
    }

    /* access modifiers changed from: protected */
    public String e() {
        return c4.d(this.f13421a);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return c4.e(this.f13421a);
    }

    /* access modifiers changed from: protected */
    public xl a(JSONObject jSONObject) {
        return new xm(jSONObject, this.f10489j, this.f13421a);
    }
}
