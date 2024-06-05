package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class yl extends xl {

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            c4.a(i10, this.f13421a);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            yl.this.a(jSONObject);
        }
    }

    yl(k kVar) {
        super("TaskApiSubmitData", kVar);
    }

    private void b(JSONObject jSONObject) {
        if (((Boolean) this.f13421a.a(oj.L4)).booleanValue()) {
            JsonUtils.putJSONObjectIfValid(jSONObject, "stats", this.f13421a.F().c());
        }
    }

    private void c(JSONObject jSONObject) {
        Map map;
        Map map2;
        if (this.f13421a.y() != null) {
            m y10 = this.f13421a.y();
            map = y10.d();
            map2 = y10.b();
        } else {
            l x10 = this.f13421a.x();
            map = x10.l();
            map2 = x10.A();
        }
        zp.a("platform", "type", map);
        zp.a("api_level", "sdk_version", map);
        JsonUtils.putObject(jSONObject, "device_info", new JSONObject(map));
        zp.a("sdk_version", "applovin_sdk_version", map2);
        zp.a("ia", "installed_at", map2);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(map2));
    }

    public void run() {
        if (t.a()) {
            this.f13423c.d(this.f13422b, "Submitting user data...");
        }
        Map c10 = c4.c(this.f13421a);
        JSONObject jSONObject = new JSONObject();
        c(jSONObject);
        b(jSONObject);
        if (((Boolean) this.f13421a.a(oj.C5)).booleanValue() || ((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c10);
            c10 = null;
        }
        a(c10, jSONObject);
    }

    /* access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f13421a.h0().a(oj.f10303g, (Object) JsonUtils.getString(jSONObject2, "device_id", MaxReward.DEFAULT_LABEL));
        this.f13421a.h0().a(oj.f10335k, (Object) JsonUtils.getString(jSONObject2, "device_token", MaxReward.DEFAULT_LABEL));
        c4.a(jSONObject2, this.f13421a);
        this.f13421a.F().b();
    }

    private void a(Map map, JSONObject jSONObject) {
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f13421a).b(c4.b("2.0/device", this.f13421a)).a(c4.a("2.0/device", this.f13421a)).b(map).a(jSONObject).c("POST").b(((Boolean) this.f13421a.a(oj.J5)).booleanValue()).a((Object) new JSONObject()).a(((Integer) this.f13421a.a(oj.f10323i3)).intValue()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10421u5)).intValue())).a(), this.f13421a);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.f13421a.l0().a((xl) aVar);
    }
}
