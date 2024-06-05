package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

public abstract class le extends c4 {

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f9215e = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters", "ad_unit_signal_providers"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f9216f = {"ads", "settings", "signal_providers", "ad_unit_signal_providers"};

    public static String a(k kVar) {
        return c4.a((String) kVar.a(qe.J6), "1.0/mediate", kVar);
    }

    public static void a(JSONObject jSONObject) {
    }

    public static String b(k kVar) {
        return c4.a((String) kVar.a(qe.I6), "1.0/mediate", kVar);
    }

    public static void d(JSONObject jSONObject, k kVar) {
        if (JsonUtils.valueExists(jSONObject, "ad_unit_signal_providers")) {
            em.a(jSONObject, kVar);
        }
    }

    public static void e(JSONObject jSONObject, k kVar) {
        if (jSONObject.length() != 0) {
            if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
                JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
                JsonUtils.removeObjectsForKeys(shallowCopy, f9216f);
                kVar.b(qj.G, (Object) shallowCopy.toString());
                return;
            }
            kVar.c(qj.G);
        }
    }

    public static void f(JSONObject jSONObject, k kVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f9215e);
            kVar.b(qj.F, (Object) shallowCopy.toString());
            em.a(shallowCopy);
        }
    }

    public static String i(k kVar) {
        return c4.a((String) kVar.a(qe.J6), "1.0/mediate_debug", kVar);
    }

    public static String j(k kVar) {
        return c4.a((String) kVar.a(qe.I6), "1.0/mediate_debug", kVar);
    }
}
