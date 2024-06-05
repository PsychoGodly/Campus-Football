package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f6276a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6277b;

    /* renamed from: c  reason: collision with root package name */
    private final lr f6278c;

    /* renamed from: d  reason: collision with root package name */
    private final List f6279d;

    /* renamed from: e  reason: collision with root package name */
    private final List f6280e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6281f = false;

    a0(JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, k kVar) {
        this.f6276a = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL);
        this.f6277b = JsonUtils.getString(jSONObject, "experiment", (String) null);
        this.f6278c = a(jSONObject);
        JSONObject jSONObject2 = jSONObject;
        Map map2 = map;
        MaxAdFormat maxAdFormat2 = maxAdFormat;
        k kVar2 = kVar;
        this.f6279d = a("bidders", jSONObject2, map2, maxAdFormat2, kVar2);
        this.f6280e = a("waterfall", jSONObject2, map2, maxAdFormat2, kVar2);
    }

    public List a() {
        return this.f6279d;
    }

    public String b() {
        return this.f6277b;
    }

    public String c() {
        return this.f6276a;
    }

    public lr d() {
        return this.f6278c;
    }

    public List e() {
        return this.f6280e;
    }

    public boolean f() {
        return this.f6281f;
    }

    private List a(String str, JSONObject jSONObject, Map map, MaxAdFormat maxAdFormat, k kVar) {
        fe feVar;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (!(jSONObject2 == null || (feVar = (fe) map.get(JsonUtils.getString(jSONObject2, "adapter_class", MaxReward.DEFAULT_LABEL))) == null)) {
                if (feVar.A()) {
                    this.f6281f = true;
                }
                arrayList.add(new kr(jSONObject2, maxAdFormat, feVar, kVar));
            }
        }
        return arrayList;
    }

    private lr a(JSONObject jSONObject) {
        return new lr(JsonUtils.getJSONObject(jSONObject, "targeting"));
    }
}
