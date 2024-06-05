package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.qi;
import com.applovin.impl.sdk.e;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.u;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class km extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final String f9052h;

    /* renamed from: i  reason: collision with root package name */
    private final MaxAdFormat f9053i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f9054j;

    /* renamed from: k  reason: collision with root package name */
    private final Map f9055k;

    /* renamed from: l  reason: collision with root package name */
    private final Map f9056l;

    /* renamed from: m  reason: collision with root package name */
    private final JSONArray f9057m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f9058n;

    /* renamed from: o  reason: collision with root package name */
    private final a.C0126a f9059o;

    class a extends en {
        a(com.applovin.impl.sdk.network.a aVar, k kVar) {
            super(aVar, kVar);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            km.this.a(i10, str2);
            this.f13421a.B().a("fetchMediatedAd", str, i10, (HashMap) CollectionUtils.hashMap("error_message", str2));
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 == 200) {
                JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f7482m.a());
                JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f7482m.b());
                km.this.b(jSONObject);
                return;
            }
            km.this.a(i10, (String) null);
            this.f13421a.B().a("fetchMediatedAd", str, i10);
        }
    }

    public km(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, JSONArray jSONArray, Context context, k kVar, a.C0126a aVar) {
        super("TaskFetchMediatedAd", kVar, str);
        this.f9052h = str;
        this.f9053i = maxAdFormat;
        this.f9054j = map;
        this.f9055k = map2;
        this.f9056l = map3;
        this.f9057m = jSONArray;
        this.f9058n = context;
        this.f9059o = aVar;
    }

    /* access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            c4.c(jSONObject, this.f13421a);
            c4.b(jSONObject, this.f13421a);
            c4.a(jSONObject, this.f13421a);
            le.f(jSONObject, this.f13421a);
            le.d(jSONObject, this.f13421a);
            le.e(jSONObject, this.f13421a);
            le.a(jSONObject);
            e.b(this.f13421a);
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", (String) null));
            String str = "UNKNOWN";
            if (!((Boolean) this.f13421a.a(oj.f10350l6)).booleanValue()) {
                if (this.f9053i != formatFromString) {
                    if (formatFromString != null) {
                        str = formatFromString.getLabel();
                    }
                    t.h(this.f13422b, "Ad format requested (" + this.f9053i.getLabel() + ") does not match ad format for ad unit id " + this.f9052h + " (" + str + ")");
                }
                a(jSONObject);
            } else if (zp.a(this.f9053i, formatFromString)) {
                a(jSONObject);
            } else {
                if (formatFromString != null) {
                    str = formatFromString.getLabel();
                }
                String str2 = "Requested ad format " + this.f9053i.getLabel() + " is not compatible with received ad format " + str;
                t.h(this.f13422b, str2);
                this.f9059o.onAdLoadFailed(this.f9052h, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str2));
                HashMap<String, String> hashMap = CollectionUtils.hashMap("ad_unit_id", this.f9052h);
                CollectionUtils.putStringIfValid(MediationMetaData.KEY_NAME, this.f9053i.getLabel(), hashMap);
                CollectionUtils.putStringIfValid("details", str, hashMap);
                this.f13421a.B().a(o.b.INTEGRATION_ERROR, "incompatible_ad_format", (Map) hashMap);
            }
        } catch (Throwable th) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Unable to process mediated ad response for ad unit " + this.f9052h, th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f13421a.S().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && zp.f(k.k())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    private void d(JSONObject jSONObject) {
        if (((Boolean) this.f13421a.a(oj.M4)).booleanValue()) {
            te T = this.f13421a.T();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            re reVar = re.f11178c;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) T.a(reVar, se.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) T.a(reVar, se.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) T.a(re.f11179d, se.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return le.a(this.f13421a);
    }

    private String f() {
        return le.b(this.f13421a);
    }

    private JSONObject g() {
        Map map;
        if (this.f13421a.y() != null) {
            map = this.f13421a.y().a((Map) null, false, true);
        } else {
            map = this.f13421a.x().a((Map) null, false, true);
        }
        map.putAll(this.f9056l);
        JSONObject jSONObject = new JSONObject(map);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private void h(JSONObject jSONObject) {
        JSONArray jSONArray = this.f9057m;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    public void run() {
        if (t.a()) {
            t tVar = this.f13423c;
            String str = this.f13422b;
            tVar.a(str, "Fetching next ad for " + this.f9053i.getLabel() + " ad unit " + this.f9052h);
        }
        r.a();
        if (((Boolean) this.f13421a.a(oj.f10269b4)).booleanValue() && zp.j() && t.a()) {
            this.f13423c.a(this.f13422b, "User is connected to a VPN");
        }
        if (((Boolean) this.f13421a.a(oj.M4)).booleanValue()) {
            te T = this.f13421a.T();
            re reVar = re.f11178c;
            T.a(reVar, se.a(this.f9052h));
            T.a(reVar, se.a(this.f9053i));
        }
        ba F = this.f13421a.F();
        F.c(aa.f6357s);
        aa aaVar = aa.f6345g;
        if (F.b(aaVar) == 0) {
            F.b(aaVar, System.currentTimeMillis());
        }
        try {
            JSONObject g10 = g();
            HashMap hashMap = new HashMap();
            if (!((Boolean) this.f13421a.a(oj.f10453y5)).booleanValue() && !((Boolean) this.f13421a.a(oj.f10437w5)).booleanValue()) {
                hashMap.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f13421a.a(oj.f10333j5)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f13421a.d0());
            }
            if (this.f13421a.n0().c()) {
                hashMap.put("test_mode", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            List b10 = this.f13421a.n0().b();
            String str2 = this.f13421a.g0().getExtraParameters().get("fan");
            if (b10 != null) {
                if (!b10.isEmpty()) {
                    String a10 = jt.a(",", b10);
                    hashMap.put("filter_ad_network", a10);
                    if (!this.f13421a.n0().c()) {
                        hashMap.put("fhkZsVqYC7", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                    }
                    if (this.f13421a.n0().d()) {
                        hashMap.put("force_ad_network", a10);
                    }
                    a(F);
                    a aVar = new a(com.applovin.impl.sdk.network.a.a(this.f13421a).c("POST").a(h()).b(f()).a(e()).b((Map) hashMap).a(g10).b(((Boolean) this.f13421a.a(qe.N7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f13421a.a(qe.L6)).intValue()).a(((Integer) this.f13421a.a(oj.f10299f3)).intValue()).b(((Long) this.f13421a.a(qe.K6)).intValue()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10381p5)).intValue())).f(true).a(), this.f13421a);
                    aVar.c(qe.I6);
                    aVar.b(qe.J6);
                    this.f13421a.l0().a((xl) aVar);
                }
            }
            if (StringUtils.isValidString(str2)) {
                hashMap.put("filter_ad_network", str2);
            }
            a(F);
            a aVar2 = new a(com.applovin.impl.sdk.network.a.a(this.f13421a).c("POST").a(h()).b(f()).a(e()).b((Map) hashMap).a(g10).b(((Boolean) this.f13421a.a(qe.N7)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f13421a.a(qe.L6)).intValue()).a(((Integer) this.f13421a.a(oj.f10299f3)).intValue()).b(((Long) this.f13421a.a(qe.K6)).intValue()).a(qi.a.a(((Integer) this.f13421a.a(oj.f10381p5)).intValue())).f(true).a(), this.f13421a);
            aVar2.c(qe.I6);
            aVar2.b(qe.J6);
            this.f13421a.l0().a((xl) aVar2);
        } catch (Throwable th) {
            if (t.a()) {
                t tVar2 = this.f13423c;
                String str3 = this.f13422b;
                tVar2.a(str3, "Unable to fetch ad for ad unit " + this.f9052h, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }

    private void e(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f9052h);
        jSONObject2.put("ad_format", this.f9053i.getLabel());
        Map map = CollectionUtils.map(this.f9055k);
        u.a a10 = this.f13421a.V().a(this.f9052h);
        if (a10 != null) {
            if (Boolean.parseBoolean(this.f13421a.g0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", a10.a());
                map.put("previous_winning_network_name", a10.c());
                CollectionUtils.putStringIfValid("second_previous_winning_network", a10.d(), map);
                CollectionUtils.putStringIfValid("second_previous_winning_network_name", a10.e(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f13421a.O().a()));
            jSONObject2.put("installed", ve.a(this.f13421a));
            jSONObject2.put("initialized", this.f13421a.N().b());
            jSONObject2.put("initialized_classnames", new JSONArray(this.f13421a.N().a().keySet()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f13421a.O().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f13421a.O().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e10) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Failed to populate adapter classNames", e10);
            }
            throw new RuntimeException("Failed to populate classNames: " + e10);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r10v1, types: [com.applovin.impl.wm] */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.applovin.impl.vm] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r19) {
        /*
            r18 = this;
            r0 = r18
            com.applovin.impl.sdk.k r1 = r0.f13421a
            com.applovin.impl.oj r2 = com.applovin.impl.qe.E7
            com.applovin.mediation.MaxAdFormat r3 = r0.f9053i
            boolean r1 = r1.a((com.applovin.impl.oj) r2, (com.applovin.mediation.MaxAdFormat) r3)
            if (r1 == 0) goto L_0x0023
            com.applovin.impl.vm r1 = new com.applovin.impl.vm
            java.lang.String r3 = r0.f9052h
            com.applovin.mediation.MaxAdFormat r4 = r0.f9053i
            java.util.Map r5 = r0.f9054j
            android.content.Context r7 = r0.f9058n
            com.applovin.impl.sdk.k r8 = r0.f13421a
            com.applovin.impl.mediation.ads.a$a r9 = r0.f9059o
            r2 = r1
            r6 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x003b
        L_0x0023:
            com.applovin.impl.wm r1 = new com.applovin.impl.wm
            java.lang.String r11 = r0.f9052h
            com.applovin.mediation.MaxAdFormat r12 = r0.f9053i
            java.util.Map r13 = r0.f9054j
            android.content.Context r15 = r0.f9058n
            com.applovin.impl.sdk.k r2 = r0.f13421a
            com.applovin.impl.mediation.ads.a$a r3 = r0.f9059o
            r10 = r1
            r14 = r19
            r16 = r2
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
        L_0x003b:
            r5 = r1
            r1 = -1
            java.lang.String r3 = "process_waterfall_delay_ms"
            r4 = r19
            long r7 = com.applovin.impl.sdk.utils.JsonUtils.getLong(r4, r3, r1)
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0059
            com.applovin.impl.sdk.k r1 = r0.f13421a
            com.applovin.impl.sm r4 = r1.l0()
            com.applovin.impl.sm$b r6 = com.applovin.impl.sm.b.MEDIATION
            r9 = 1
            r4.a(r5, r6, r7, r9)
            goto L_0x0062
        L_0x0059:
            com.applovin.impl.sdk.k r1 = r0.f13421a
            com.applovin.impl.sm r1 = r1.l0()
            r1.a((com.applovin.impl.xl) r5)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.km.a(org.json.JSONObject):void");
    }

    private Map h() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f9052h);
        hashMap.put("AppLovin-Ad-Format", this.f9053i.getLabel());
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", this.f9055k.get("retry_attempt"), hashMap);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", this.f9055k.get("retry_delay_sec"), hashMap);
        return hashMap;
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

    private void g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f13421a.g0().getExtraParameters()));
    }

    /* access modifiers changed from: private */
    public void a(int i10, String str) {
        MaxErrorImpl maxErrorImpl;
        if (t.a()) {
            t tVar = this.f13423c;
            String str2 = this.f13422b;
            tVar.b(str2, "Unable to fetch ad for ad unit " + this.f9052h + ": server returned " + i10);
        }
        if (i10 == -800) {
            this.f13421a.F().c(aa.f6358t);
        }
        if (i10 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str);
        } else if (i10 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str);
        } else if (StringUtils.isValidString(str)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        bc.a((MaxAdListener) this.f9059o, this.f9052h, (MaxError) maxErrorImpl);
    }
}
