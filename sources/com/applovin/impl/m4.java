package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class m4 {
    private static List a(int i10, k kVar) {
        String a10 = zp.a(i10, k.k(), kVar);
        if (!TextUtils.isEmpty(a10)) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(a10, (JSONObject) null);
            if (jsonObjectFromJsonString != null) {
                JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    arrayList.add(h4.a(JsonUtils.getJSONObject(jSONArray, i11, new JSONObject()), kVar));
                }
                return arrayList;
            }
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
    }

    public static List b(k kVar) {
        return a(R.raw.applovin_consent_flow_terms_of_service_and_privacy_policy, kVar);
    }

    public static List c(k kVar) {
        return a(R.raw.applovin_consent_flow_unified_cmp, kVar);
    }

    public static List a(k kVar) {
        return a(R.raw.applovin_consent_flow_privacy_policy, kVar);
    }
}
