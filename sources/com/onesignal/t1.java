package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageTag */
public class t1 {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f28202a;

    /* renamed from: b  reason: collision with root package name */
    private JSONArray f28203b;

    t1(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = null;
        this.f28202a = jSONObject.has("adds") ? jSONObject.getJSONObject("adds") : null;
        this.f28203b = jSONObject.has("removes") ? jSONObject.getJSONArray("removes") : jSONArray;
    }

    public JSONObject a() {
        return this.f28202a;
    }

    public JSONArray b() {
        return this.f28203b;
    }

    public String toString() {
        return "OSInAppMessageTag{adds=" + this.f28202a + ", removes=" + this.f28203b + '}';
    }
}
