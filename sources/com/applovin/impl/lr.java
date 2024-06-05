package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONObject;

public class lr {

    /* renamed from: a  reason: collision with root package name */
    private final String f9267a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9268b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9269c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9270d;

    /* renamed from: e  reason: collision with root package name */
    private final List f9271e;

    /* renamed from: f  reason: collision with root package name */
    private final List f9272f;

    public lr(JSONObject jSONObject) {
        this.f9267a = JsonUtils.getString(jSONObject, "user_type", "all");
        this.f9268b = JsonUtils.getString(jSONObject, "device_type", "all");
        this.f9269c = JsonUtils.getString(jSONObject, "min_age", (String) null);
        this.f9270d = JsonUtils.getString(jSONObject, "max_age", (String) null);
        this.f9271e = JsonUtils.getList(jSONObject, "gender", (List) null);
        this.f9272f = JsonUtils.getList(jSONObject, "keywords", (List) null);
    }

    public String a() {
        return this.f9267a;
    }

    public String b() {
        return this.f9268b;
    }

    public List c() {
        return this.f9271e;
    }

    public List d() {
        return this.f9272f;
    }

    public String e() {
        return this.f9270d;
    }

    public String f() {
        return this.f9269c;
    }
}
