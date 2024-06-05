package com.startapp;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class f8 {

    /* renamed from: b  reason: collision with root package name */
    public static final f8 f15820b = new f8(new JSONObject());

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f15821a;

    public f8() {
        this(new JSONObject());
    }

    public final void a(int i10, Object obj) {
        try {
            this.f15821a.put(String.valueOf(i10), obj);
        } catch (JSONException unused) {
        }
    }

    public final String b(int i10) {
        Object opt = this.f15821a.opt(String.valueOf(i10));
        if (opt != null) {
            return opt.toString();
        }
        return null;
    }

    public f8(JSONObject jSONObject) {
        this.f15821a = jSONObject;
    }

    public final int a(int i10) {
        Object opt = this.f15821a.opt(String.valueOf(i10));
        if (opt instanceof Number) {
            return ((Number) opt).intValue();
        }
        return 0;
    }
}
