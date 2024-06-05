package com.onesignal;

import org.json.JSONObject;

/* compiled from: ImmutableJSONObject */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f27579a;

    public c0() {
        this.f27579a = new JSONObject();
    }

    public boolean a(String str) {
        return this.f27579a.has(str);
    }

    public boolean b(String str) {
        return this.f27579a.optBoolean(str);
    }

    public boolean c(String str, boolean z10) {
        return this.f27579a.optBoolean(str, z10);
    }

    public int d(String str, int i10) {
        return this.f27579a.optInt(str, i10);
    }

    public JSONObject e(String str) {
        return this.f27579a.optJSONObject(str);
    }

    public String f(String str) {
        return this.f27579a.optString(str);
    }

    public String g(String str, String str2) {
        return this.f27579a.optString(str, str2);
    }

    public String toString() {
        return "ImmutableJSONObject{jsonObject=" + this.f27579a + '}';
    }

    public c0(JSONObject jSONObject) {
        this.f27579a = jSONObject;
    }
}
