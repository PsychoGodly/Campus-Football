package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.l0;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class lm extends xl {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final b4.e f9253h;

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            lm.this.f9253h.a(str, i10, str2, jSONObject);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            lm.this.f9253h.a(str, jSONObject, i10);
        }
    }

    public lm(b4.e eVar, k kVar) {
        super("TaskFetchMediationDebuggerInfo", kVar, true);
        this.f9253h = eVar;
    }

    private JSONObject e() {
        l0.a aVar;
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", ve.a(this.f13421a));
        if (this.f13421a.y() != null) {
            aVar = this.f13421a.z().d();
        } else {
            aVar = this.f13421a.x().f();
        }
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVar.b().b());
        Boolean b10 = y3.c().b(a());
        if (((Boolean) this.f13421a.a(oj.S3)).booleanValue() && !Boolean.TRUE.equals(b10)) {
            JsonUtils.putStringIfValid(jSONObject, "idfa", aVar.a());
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public Map f() {
        Map map;
        Map map2;
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f13421a.a(oj.f10333j5)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f13421a.d0());
        }
        if (this.f13421a.y() != null) {
            map2 = this.f13421a.y().b();
            map = this.f13421a.y().k();
        } else {
            map2 = this.f13421a.x().A();
            map = this.f13421a.x().G();
        }
        hashMap.put("package_name", String.valueOf(map2.get("package_name")));
        hashMap.put("app_version", String.valueOf(map2.get("app_version")));
        hashMap.put("platform", String.valueOf(map.get("platform")));
        hashMap.put("os", String.valueOf(map.get("os")));
        return hashMap;
    }

    public void run() {
        Map f10 = f();
        JSONObject e10 = e();
        if (((Boolean) this.f13421a.a(oj.f10461z5)).booleanValue() || ((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
            JsonUtils.putAll(e10, (Map<String, ?>) f10);
            f10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f13421a).c("POST").b(le.j(this.f13421a)).a(le.i(this.f13421a)).b(f10).a(e10).a((Object) new JSONObject()).c(((Long) this.f13421a.a(qe.M6)).intValue()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10389q5)).intValue())).a(), this.f13421a, d());
        aVar.c(qe.I6);
        aVar.b(qe.J6);
        this.f13421a.l0().a((xl) aVar);
    }
}
