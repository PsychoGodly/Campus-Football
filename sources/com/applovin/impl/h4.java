package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxReward;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class h4 {

    /* renamed from: a  reason: collision with root package name */
    protected final k f8215a;

    /* renamed from: b  reason: collision with root package name */
    protected final JSONObject f8216b;

    public enum a {
        NONE,
        IS_AL_GDPR
    }

    public enum b {
        ALERT,
        EVENT,
        HAS_USER_CONSENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION,
        TERMS_FLOW
    }

    public h4(JSONObject jSONObject, k kVar) {
        this.f8215a = kVar;
        this.f8216b = jSONObject;
    }

    public static h4 a(JSONObject jSONObject, k kVar) {
        b c10 = c(JsonUtils.getString(jSONObject, "type", (String) null));
        if (c10 == b.ALERT) {
            return new i4(jSONObject, kVar);
        }
        if (c10 == b.EVENT) {
            return new k4(jSONObject, kVar);
        }
        return new h4(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.f8216b, "id", (String) null);
    }

    public b c() {
        return c(JsonUtils.getString(this.f8216b, "type", (String) null));
    }

    public boolean d() {
        return JsonUtils.getBoolean(this.f8216b, "is_initial_state", Boolean.FALSE).booleanValue();
    }

    public String toString() {
        return "ConsentFlowState{id=" + b() + "type=" + c() + "isInitialState=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("terms_flow".equalsIgnoreCase(str)) {
            return b.TERMS_FLOW;
        }
        if ("huc".equalsIgnoreCase(str)) {
            return b.HAS_USER_CONSENT;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    /* access modifiers changed from: protected */
    public String b(String str) {
        String str2;
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f8216b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i10, MaxReward.DEFAULT_LABEL).toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                if (this.f8215a.y() != null) {
                    str2 = this.f8215a.z().g().e();
                } else {
                    str2 = (String) this.f8215a.x().F().get("app_name");
                }
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(k.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return k.a(JsonUtils.getString(jSONObject, "key", (String) null), (List) arrayList);
    }

    public a a() {
        return a(JsonUtils.getString(this.f8216b, "decision_type", (String) null));
    }

    public String a(Boolean bool) {
        String string = JsonUtils.getString(this.f8216b, "destination_state_id", (String) null);
        if (StringUtils.isValidString(string)) {
            return string;
        }
        if (bool == null) {
            throw new IllegalStateException("Decision needed for state: " + string);
        } else if (bool.booleanValue()) {
            return JsonUtils.getString(this.f8216b, "destination_state_id_true", (String) null);
        } else {
            return JsonUtils.getString(this.f8216b, "destination_state_id_false", (String) null);
        }
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        return a.NONE;
    }
}
