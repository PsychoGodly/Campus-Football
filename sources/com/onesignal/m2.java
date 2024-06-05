package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSPermissionStateChanges */
public class m2 {

    /* renamed from: a  reason: collision with root package name */
    private l2 f28049a;

    /* renamed from: b  reason: collision with root package name */
    private l2 f28050b;

    public m2(l2 l2Var, l2 l2Var2) {
        this.f28049a = l2Var;
        this.f28050b = l2Var2;
    }

    public l2 a() {
        return this.f28049a;
    }

    public l2 b() {
        return this.f28050b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f28049a.g());
            jSONObject.put("to", this.f28050b.g());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}
