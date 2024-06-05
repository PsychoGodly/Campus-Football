package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.nativeAd.b;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

public class xm extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f13427h;

    /* renamed from: i  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f13428i;

    public xm(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskProcessNativeAdResponse", kVar);
        this.f13427h = jSONObject;
        this.f13428i = appLovinNativeAdLoadListener;
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f13427h, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Processing ad...");
            }
            this.f13421a.l0().a((xl) new b(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f13427h, this.f13428i, this.f13421a));
            return;
        }
        if (t.a()) {
            this.f13423c.k(this.f13422b, "No ads were returned from the server");
        }
        zp.a("native_native", MaxAdFormat.NATIVE, this.f13427h, this.f13421a);
        this.f13428i.onNativeAdLoadFailed(AppLovinError.NO_FILL);
    }
}
