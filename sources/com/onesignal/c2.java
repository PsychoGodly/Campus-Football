package com.onesignal;

import kotlin.jvm.internal.m;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: OSNotificationIntentExtras.kt */
public final class c2 {

    /* renamed from: a  reason: collision with root package name */
    private JSONArray f27581a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f27582b;

    public c2(JSONArray jSONArray, JSONObject jSONObject) {
        this.f27581a = jSONArray;
        this.f27582b = jSONObject;
    }

    public final JSONArray a() {
        return this.f27581a;
    }

    public final JSONObject b() {
        return this.f27582b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return m.a(this.f27581a, c2Var.f27581a) && m.a(this.f27582b, c2Var.f27582b);
    }

    public int hashCode() {
        JSONArray jSONArray = this.f27581a;
        int i10 = 0;
        int hashCode = (jSONArray == null ? 0 : jSONArray.hashCode()) * 31;
        JSONObject jSONObject = this.f27582b;
        if (jSONObject != null) {
            i10 = jSONObject.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "OSNotificationIntentExtras(dataArray=" + this.f27581a + ", jsonData=" + this.f27582b + ')';
    }
}
