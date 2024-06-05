package com.onesignal;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSEmailSubscriptionStateChanges */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private y0 f28466a;

    /* renamed from: b  reason: collision with root package name */
    private y0 f28467b;

    public z0(y0 y0Var, y0 y0Var2) {
        this.f28466a = y0Var;
        this.f28467b = y0Var2;
    }

    public y0 a() {
        return this.f28466a;
    }

    public y0 b() {
        return this.f28467b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f28466a.k());
            jSONObject.put("to", this.f28467b.k());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}
