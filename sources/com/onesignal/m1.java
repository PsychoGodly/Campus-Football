package com.onesignal;

import kotlin.jvm.internal.m;
import org.json.JSONObject;

/* compiled from: OSInAppMessagePage.kt */
public class m1 {

    /* renamed from: a  reason: collision with root package name */
    private String f28047a;

    /* renamed from: b  reason: collision with root package name */
    private String f28048b;

    public m1(JSONObject jSONObject) {
        m.e(jSONObject, "jsonObject");
        this.f28047a = jSONObject.optString("pageId", (String) null);
        this.f28048b = jSONObject.optString("pageIndex", (String) null);
    }

    public final String a() {
        return this.f28047a;
    }
}
