package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class kr {

    /* renamed from: a  reason: collision with root package name */
    private final ec f9089a;

    /* renamed from: b  reason: collision with root package name */
    private final yf f9090b;

    /* renamed from: c  reason: collision with root package name */
    private final List f9091c;

    public kr(JSONObject jSONObject, MaxAdFormat maxAdFormat, fe feVar, k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f9090b = new yf(jSONObject2, kVar);
        } else {
            this.f9090b = null;
        }
        this.f9089a = new ec(JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL), JsonUtils.getString(jSONObject, "display_name", MaxReward.DEFAULT_LABEL), jSONObject2 != null, feVar);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f9091c = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f9091c.add(new yf(jSONObject3, kVar));
            }
        }
    }

    public yf a() {
        return this.f9090b;
    }

    public ec b() {
        return this.f9089a;
    }

    public List c() {
        return this.f9091c;
    }

    public boolean d() {
        return this.f9090b != null;
    }
}
