package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.List;
import org.json.JSONObject;

public class n6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f9915a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9916b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9917c;

    n6(JSONObject jSONObject, k kVar) {
        this.f9915a = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL);
        this.f9916b = JsonUtils.getString(jSONObject, "description", MaxReward.DEFAULT_LABEL);
        List list = JsonUtils.getList(jSONObject, "existence_classes", (List) null);
        if (list != null) {
            this.f9917c = zp.a(list);
        } else {
            this.f9917c = zp.a(JsonUtils.getString(jSONObject, "existence_class", MaxReward.DEFAULT_LABEL));
        }
    }

    public String a() {
        return this.f9916b;
    }

    public String b() {
        return this.f9915a;
    }

    public boolean c() {
        return this.f9917c;
    }

    public static boolean a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || zp.a(str2, str) != 1) {
            return str3 == null || zp.a(str3, str) != -1;
        }
        return false;
    }
}
