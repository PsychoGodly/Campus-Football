package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

public class yf {

    /* renamed from: a  reason: collision with root package name */
    private final String f13603a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13604b;

    public yf(JSONObject jSONObject, k kVar) {
        this.f13603a = JsonUtils.getString(jSONObject, "id", MaxReward.DEFAULT_LABEL);
        this.f13604b = JsonUtils.getString(jSONObject, InAppPurchaseMetaData.KEY_PRICE, (String) null);
    }

    public String a() {
        return this.f13603a;
    }

    public String b() {
        return this.f13604b;
    }
}
