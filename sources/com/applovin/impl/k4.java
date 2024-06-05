package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Map;
import org.json.JSONObject;

public class k4 extends h4 {

    /* renamed from: c  reason: collision with root package name */
    private Map f8870c;

    public k4(JSONObject jSONObject, k kVar) {
        super(jSONObject, kVar);
    }

    public Map e() {
        return this.f8870c;
    }

    public String f() {
        return JsonUtils.getString(this.f8216b, MediationMetaData.KEY_NAME, (String) null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "name=" + f() + "}";
    }
}
