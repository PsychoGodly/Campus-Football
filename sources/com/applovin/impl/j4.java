package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class j4 {

    /* renamed from: a  reason: collision with root package name */
    private final k f8669a;

    /* renamed from: b  reason: collision with root package name */
    private final JSONObject f8670b;

    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private j4(JSONObject jSONObject, k kVar) {
        this.f8669a = kVar;
        this.f8670b = jSONObject;
    }

    public static j4 a(JSONObject jSONObject, k kVar) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), "key", (String) null);
        if ("TOS".equalsIgnoreCase(string) && kVar.t().i() == null) {
            return null;
        }
        if (!"PP".equalsIgnoreCase(string) || kVar.t().h() != null) {
            return new j4(jSONObject, kVar);
        }
        return null;
    }

    public String b() {
        return JsonUtils.getString(this.f8670b, "event", (String) null);
    }

    public a c() {
        String string = JsonUtils.getString(this.f8670b, "style", (String) null);
        if ("default".equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        if ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) {
            return a.NEGATIVE;
        }
        return a.NEUTRAL;
    }

    public String d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8670b, "title", (JSONObject) null);
        return k.a(JsonUtils.getString(jSONObject, "key", MaxReward.DEFAULT_LABEL), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", (JSONArray) null), (List) null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + d() + "destinationStateId=" + a() + "event=" + b() + "}";
    }

    public String a() {
        return JsonUtils.getString(this.f8670b, "destination_state_id", (String) null);
    }
}
