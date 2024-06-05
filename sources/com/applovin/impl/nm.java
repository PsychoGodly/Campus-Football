package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

public class nm extends gm {

    /* renamed from: j  reason: collision with root package name */
    private final AppLovinAdLoadListener f10005j;

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        this(h0Var, appLovinAdLoadListener, "TaskFetchNextAd", kVar);
    }

    /* access modifiers changed from: protected */
    public void a(int i10, String str) {
        super.a(i10, str);
        AppLovinAdLoadListener appLovinAdLoadListener = this.f10005j;
        if (appLovinAdLoadListener instanceof mb) {
            ((mb) this.f10005j).failedToReceiveAdV2(new AppLovinError(i10, str));
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(i10);
    }

    /* access modifiers changed from: protected */
    public String e() {
        return c4.a(this.f13421a);
    }

    /* access modifiers changed from: protected */
    public String f() {
        return c4.b(this.f13421a);
    }

    public nm(h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, String str, k kVar) {
        super(h0Var, str, kVar);
        this.f10005j = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    public xl a(JSONObject jSONObject) {
        return new tm(jSONObject, this.f8045h, this.f10005j, this.f13421a);
    }
}
