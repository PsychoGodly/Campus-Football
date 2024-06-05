package com.onesignal;

import org.json.JSONObject;

/* compiled from: OSSubscriptionStateChanges */
public class w2 {

    /* renamed from: a  reason: collision with root package name */
    private OSSubscriptionState f28356a;

    /* renamed from: b  reason: collision with root package name */
    private OSSubscriptionState f28357b;

    public w2(OSSubscriptionState oSSubscriptionState, OSSubscriptionState oSSubscriptionState2) {
        this.f28356a = oSSubscriptionState;
        this.f28357b = oSSubscriptionState2;
    }

    public OSSubscriptionState a() {
        return this.f28356a;
    }

    public OSSubscriptionState b() {
        return this.f28357b;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f28356a.m());
            jSONObject.put("to", this.f28357b.m());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        return c().toString();
    }
}
