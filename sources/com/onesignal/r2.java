package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSSMSSubscriptionStateChanges */
public class r2 {

    /* renamed from: a  reason: collision with root package name */
    private q2 f28111a;

    /* renamed from: b  reason: collision with root package name */
    private q2 f28112b;

    public r2(q2 q2Var, q2 q2Var2) {
        this.f28111a = q2Var;
        this.f28112b = q2Var2;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f28111a.k());
            jSONObject.put("to", this.f28112b.k());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return a().toString();
    }
}
