package com.applovin.impl;

import com.applovin.impl.qi;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public abstract class gm extends xl {

    /* renamed from: h  reason: collision with root package name */
    protected final h0 f8045h;

    /* renamed from: i  reason: collision with root package name */
    private final String f8046i;

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            gm.this.a(i10, str2);
            this.f13421a.B().a("fetchAd", str, i10, (HashMap) CollectionUtils.hashMap("error_message", str2));
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f7482m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f7482m.b());
                gm.this.b(jSONObject);
                return;
            }
            gm.this.a(i10, MaxAdapterError.NO_FILL.getErrorMessage());
            this.f13421a.B().a("fetchAd", str, i10);
        }
    }

    public gm(h0 h0Var, String str, k kVar) {
        super(str, kVar);
        this.f8045h = h0Var;
        this.f8046i = kVar.b();
    }

    private void a(ba baVar) {
        aa aaVar = aa.f6345g;
        long b10 = baVar.b(aaVar);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b10 > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f13421a.a(oj.B3)).intValue())) {
            baVar.b(aaVar, currentTimeMillis);
            baVar.a(aa.f6346h);
            baVar.a(aa.f6347i);
        }
    }

    private Map g() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f8045h.e());
        if (this.f8045h.f() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f8045h.f().getLabel());
        }
        if (this.f8045h.g() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f8045h.g().getLabel());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract xl a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public void b(JSONObject jSONObject) {
        c4.c(jSONObject, this.f13421a);
        c4.b(jSONObject, this.f13421a);
        c4.a(jSONObject, this.f13421a);
        h0.a(jSONObject);
        this.f13421a.l0().a(a(jSONObject));
    }

    /* access modifiers changed from: protected */
    public abstract String e();

    /* access modifiers changed from: protected */
    public abstract String f();

    /* access modifiers changed from: protected */
    public Map h() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f8045h.e());
        if (this.f8045h.f() != null) {
            hashMap.put("size", this.f8045h.f().getLabel());
        }
        if (this.f8045h.g() != null) {
            hashMap.put("require", this.f8045h.g().getLabel());
        }
        return hashMap;
    }

    public void run() {
        qi.a aVar;
        Map map;
        Map map2;
        Map map3;
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Fetching next ad of zone: " + this.f8045h);
        }
        if (((Boolean) this.f13421a.a(oj.f10269b4)).booleanValue() && zp.j() && t.a()) {
            this.f13423c.a(this.f13422b, "User is connected to a VPN");
        }
        ba F = this.f13421a.F();
        F.c(aa.f6342d);
        aa aaVar = aa.f6345g;
        if (F.b(aaVar) == 0) {
            F.b(aaVar, System.currentTimeMillis());
        }
        JSONObject jSONObject = null;
        try {
            JSONObject andResetCustomPostBody = this.f13421a.i().getAndResetCustomPostBody();
            String str2 = "POST";
            if (((Boolean) this.f13421a.a(oj.f10387q3)).booleanValue()) {
                qi.a a10 = qi.a.a(((Integer) this.f13421a.a(oj.f10397r5)).intValue());
                if (this.f13421a.y() != null) {
                    map3 = this.f13421a.y().a(h(), false, true);
                } else {
                    map3 = this.f13421a.x().a(h(), false, true);
                }
                JSONObject jSONObject2 = new JSONObject(map3);
                map = new HashMap();
                if (!((Boolean) this.f13421a.a(oj.A5)).booleanValue() && !((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f13421a.a(oj.f10333j5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f13421a.d0());
                }
                JsonUtils.putAll(jSONObject2, andResetCustomPostBody);
                JSONObject jSONObject3 = jSONObject2;
                aVar = a10;
                jSONObject = jSONObject3;
            } else {
                aVar = qi.a.a(((Integer) this.f13421a.a(oj.f10405s5)).intValue());
                if (this.f13421a.y() != null) {
                    map2 = this.f13421a.y().a(h(), false, false);
                } else {
                    map2 = this.f13421a.x().a(h(), false, false);
                }
                Map a11 = zp.a(map2);
                if (andResetCustomPostBody != null) {
                    jSONObject = andResetCustomPostBody;
                } else {
                    str2 = "GET";
                }
                map = a11;
            }
            if (zp.f(a())) {
                map.putAll(this.f13421a.i().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f8046i)) {
                map.put("sts", this.f8046i);
            }
            a(F);
            a.C0139a f10 = com.applovin.impl.sdk.network.a.a(this.f13421a).b(f()).a(e()).b(map).c(str2).a(g()).a((Object) new JSONObject()).a(((Integer) this.f13421a.a(oj.f10299f3)).intValue()).c(((Boolean) this.f13421a.a(oj.f10307g3)).booleanValue()).d(((Boolean) this.f13421a.a(oj.f10315h3)).booleanValue()).c(((Integer) this.f13421a.a(oj.f10291e3)).intValue()).a(aVar).f(true);
            if (jSONObject != null) {
                f10.a(jSONObject);
                f10.b(((Boolean) this.f13421a.a(oj.K5)).booleanValue());
            }
            a aVar2 = new a(f10.a(), this.f13421a);
            aVar2.c(oj.I0);
            aVar2.b(oj.J0);
            this.f13421a.l0().a((xl) aVar2);
        } catch (Throwable th) {
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str3 = this.f13422b;
                tVar2.a(str3, "Unable to fetch ad " + this.f8045h, th);
            }
            a(0, th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i10, String str) {
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.b(str2, "Unable to fetch " + this.f8045h + " ad: server returned " + i10);
        }
        if (i10 == -800) {
            this.f13421a.F().c(aa.f6351m);
        }
    }
}
