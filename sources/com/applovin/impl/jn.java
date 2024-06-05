package com.applovin.impl;

import com.applovin.impl.b4;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

public abstract class jn extends xl {

    class a extends en {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b4.e f8790n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, k kVar, b4.e eVar) {
            super(aVar, kVar);
            this.f8790n = eVar;
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f8790n.a(str, i10, str2, jSONObject);
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            this.f8790n.a(str, jSONObject, i10);
        }
    }

    protected jn(String str, k kVar) {
        super(str, kVar);
    }

    /* access modifiers changed from: protected */
    public void a(int i10) {
        c4.a(i10, this.f13421a);
    }

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        String c10 = this.f13421a.t0().c();
        if (((Boolean) this.f13421a.a(oj.L3)).booleanValue() && StringUtils.isValidString(c10)) {
            JsonUtils.putString(jSONObject, "cuid", c10);
        }
        if (((Boolean) this.f13421a.a(oj.N3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f13421a.p());
        }
        if (((Boolean) this.f13421a.a(oj.P3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f13421a.c0());
        }
        a(jSONObject);
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public abstract String f();

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, b4.e eVar) {
        Map c10 = c4.c(this.f13421a);
        if (((Boolean) this.f13421a.a(oj.D5)).booleanValue() || ((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) c10);
            c10 = null;
        }
        a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f13421a).b(c4.b(f(), this.f13421a)).a(c4.a(f(), this.f13421a)).b(c10).a(jSONObject).c("POST").b(((Boolean) this.f13421a.a(oj.M5)).booleanValue()).a((Object) new JSONObject()).a(g()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10429v5)).intValue())).a(), this.f13421a, eVar);
        aVar.c(oj.K0);
        aVar.b(oj.L0);
        this.f13421a.l0().a((xl) aVar);
    }
}
