package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class ul extends vi {

    /* renamed from: j  reason: collision with root package name */
    public static final Uri f12610j = Uri.parse("https://api.taboola.com/");

    /* renamed from: e  reason: collision with root package name */
    private final String f12611e;

    /* renamed from: f  reason: collision with root package name */
    private final Uri f12612f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f12613g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f12614h = "init";
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String f12615i = MaxReward.DEFAULT_LABEL;

    public ul(String str, String str2, String str3, k kVar) {
        super("TaboolaApiService", kVar);
        this.f12611e = str;
        Uri parse = URLUtil.isValidUrl(str3) ? Uri.parse(str3) : f12610j;
        this.f12612f = Uri.withAppendedPath(parse, "2.0/json/" + str2);
        HashMap hashMap = new HashMap(3);
        this.f12613g = hashMap;
        hashMap.put("type", "mobile");
        hashMap.put("apiKey", str);
        hashMap.put("origin", "SERVER");
    }

    private JSONObject d() {
        Map map;
        JSONObject jSONObject = new JSONObject();
        if (this.f12750a.y() != null) {
            map = this.f12750a.y().b();
        } else {
            map = this.f12750a.x().A();
        }
        Object obj = map.get("IABTCF_gdprApplies");
        if (obj != null) {
            JsonUtils.putObject(jSONObject, "gdpr_applies", obj);
            JsonUtils.putString(jSONObject, "daisyBit", String.valueOf(map.get("IABTCF_TCString")));
        }
        return jSONObject;
    }

    class a extends en {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ MaxAdapterResponseParameters f12616n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ AppLovinNativeAdLoadListener f12617o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(com.applovin.impl.sdk.network.a aVar, k kVar, MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
            super(aVar, kVar);
            this.f12616n = maxAdapterResponseParameters;
            this.f12617o = appLovinNativeAdLoadListener;
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200 || jSONObject == null) {
                if (t.a()) {
                    t tVar = this.f13423c;
                    String str2 = this.f13422b;
                    tVar.b(str2, "Unable to fetch " + this.f12616n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
                }
                AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f12617o;
                appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject));
                return;
            }
            String unused = ul.this.f12614h = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "session", MaxReward.DEFAULT_LABEL);
            this.f13421a.l0().a((xl) new an(jSONObject, this.f12616n, MaxAdFormat.NATIVE, this.f12617o, this.f13421a));
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str3 = this.f13422b;
                tVar.b(str3, "Unable to fetch " + this.f12616n.getThirdPartyAdPlacementId() + " Taboola ad: server returned " + i10);
            }
            AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f12617o;
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(new AppLovinError(i10, "Taboola server returned with code: " + jSONObject));
        }
    }

    class b extends en {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ vl f12619n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.applovin.impl.sdk.network.a aVar, k kVar, vl vlVar) {
            super(aVar, kVar);
            this.f12619n = vlVar;
        }

        public void a(String str, JSONObject jSONObject, int i10) {
            if (i10 != 200 || jSONObject == null) {
                String str2 = "Unable to fetch user id. Server returned " + i10;
                if (t.a()) {
                    this.f13423c.b(this.f13422b, str2);
                }
                this.f12619n.onInitialized(false, str2);
                return;
            }
            String unused = ul.this.f12615i = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "user", new JSONObject()), "id", MaxReward.DEFAULT_LABEL);
            this.f13421a.b(rj.Q, ul.this.f12615i, ul.this.f12752c);
            this.f13421a.b(rj.R, Long.valueOf(System.currentTimeMillis()), ul.this.f12752c);
            this.f12619n.onInitialized(true, (String) null);
        }

        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            if (t.a()) {
                t tVar = this.f13423c;
                String str3 = this.f13422b;
                tVar.b(str3, "Unable to fetch user id. Server returned " + i10);
            }
            this.f12619n.onInitialized(false, str2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONObject c(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters r7) {
        /*
            r6 = this;
            com.applovin.impl.sdk.k r0 = r6.f12750a
            com.applovin.impl.sdk.m r0 = r0.y()
            if (r0 == 0) goto L_0x0013
            com.applovin.impl.sdk.k r0 = r6.f12750a
            com.applovin.impl.sdk.m r0 = r0.y()
            java.util.Map r0 = r0.d()
            goto L_0x001d
        L_0x0013:
            com.applovin.impl.sdk.k r0 = r6.f12750a
            com.applovin.impl.sdk.l r0 = r0.x()
            java.util.Map r0 = r0.l()
        L_0x001d:
            java.lang.String r1 = "ua"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "idfa"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = r6.f12614h
            java.util.Map r3 = r7.getLocalExtraParameters()
            java.lang.String r4 = "taboola_session"
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L_0x004a
            java.lang.Object r3 = r3.get(r4)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x004a
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
        L_0x004a:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "session"
            com.applovin.impl.sdk.utils.JsonUtils.putString(r3, r4, r2)
            java.lang.String r2 = "agent"
            com.applovin.impl.sdk.utils.JsonUtils.putString(r3, r2, r1)
            java.lang.String r1 = "device"
            com.applovin.impl.sdk.utils.JsonUtils.putString(r3, r1, r0)
            java.lang.String r0 = r6.f12615i
            java.lang.String r1 = "id"
            com.applovin.impl.sdk.utils.JsonUtils.putString(r3, r1, r0)
            android.os.Bundle r7 = r7.getServerParameters()
            java.lang.String r0 = "s2s_ip"
            java.lang.String r1 = ""
            java.lang.String r7 = r7.getString(r0, r1)
            java.lang.String r0 = "realip"
            com.applovin.impl.sdk.utils.JsonUtils.putString(r3, r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ul.c(com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters):org.json.JSONObject");
    }

    private void a(vl vlVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("app.type", "mobile");
        hashMap.put("app.apikey", this.f12611e);
        a.C0139a a10 = com.applovin.impl.sdk.network.a.a(this.f12750a);
        this.f12750a.l0().a((xl) new b(a10.b(this.f12612f.toString() + "/user.sync").c("GET").b((Map) hashMap).a((Object) new JSONObject()).a(false).b(false).a(), this.f12750a, vlVar));
    }

    private JSONObject b(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "type", maxAdapterResponseParameters.getCustomParameters().getString("source_type", MaxReward.DEFAULT_LABEL));
        JsonUtils.putString(jSONObject, "id", maxAdapterResponseParameters.getCustomParameters().getString("source_id", MaxReward.DEFAULT_LABEL));
        JsonUtils.putString(jSONObject, "url", maxAdapterResponseParameters.getCustomParameters().getString("source_url", MaxReward.DEFAULT_LABEL));
        return jSONObject;
    }

    private JSONObject d(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", a(maxAdapterResponseParameters, "taboola_view_id", MaxReward.DEFAULT_LABEL));
        return jSONObject;
    }

    private Integer a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, Integer num) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
        }
        return Integer.valueOf(maxAdapterResponseParameters.getCustomParameters().getInt(str, num.intValue()));
    }

    private String a(MaxAdapterResponseParameters maxAdapterResponseParameters, String str, String str2) {
        if (maxAdapterResponseParameters.getLocalExtraParameters().containsKey(str)) {
            Object obj = maxAdapterResponseParameters.getLocalExtraParameters().get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return maxAdapterResponseParameters.getCustomParameters().getString(str, str2);
    }

    private JSONArray a(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, MediationMetaData.KEY_NAME, maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        JsonUtils.putInt(jSONObject, "recCount", 1);
        JsonUtils.putString(jSONObject, "organicType", maxAdapterResponseParameters.getCustomParameters().getString("placement_type", "MIX"));
        Map<String, Object> localExtraParameters = maxAdapterResponseParameters.getLocalExtraParameters();
        if (localExtraParameters.containsKey("taboola_thumbnail_height") && localExtraParameters.containsKey("taboola_thumbnail_width")) {
            Integer a10 = a(maxAdapterResponseParameters, "taboola_thumbnail_height", (Integer) 0);
            Integer a11 = a(maxAdapterResponseParameters, "taboola_thumbnail_width", (Integer) 0);
            if (a10.intValue() > 0 && a11.intValue() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JsonUtils.putInt(jSONObject2, "width", a10.intValue());
                JsonUtils.putInt(jSONObject2, "height", a11.intValue());
                JsonUtils.putJSONObject(jSONObject, "thumbnail", jSONObject2);
            }
        }
        jSONArray.put(jSONObject);
        return jSONArray;
    }

    public void a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, vl vlVar) {
        String str = (String) this.f12750a.a((qj) rj.Q, (Object) null, this.f12752c);
        Long l10 = (Long) this.f12750a.a((qj) rj.R, (Object) null, this.f12752c);
        if (!StringUtils.isValidString(str) || l10 == null) {
            a(vlVar);
        } else if (maxAdapterInitializationParameters.getServerParameters().getLong("user_id_expiration_millis", TimeUnit.DAYS.toMillis(30)) - (System.currentTimeMillis() - l10.longValue()) > TimeUnit.HOURS.toMillis(1)) {
            this.f12615i = str;
            vlVar.onInitialized(true, (String) null);
        } else {
            a(vlVar);
        }
    }

    public void a(MaxAdapterResponseParameters maxAdapterResponseParameters, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJSONObject(jSONObject, "app", new JSONObject(this.f12613g));
        JsonUtils.putJSONObject(jSONObject, "consent", d());
        JsonUtils.putJSONObject(jSONObject, "user", c(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "source", b(maxAdapterResponseParameters));
        JsonUtils.putJSONObject(jSONObject, "view", d(maxAdapterResponseParameters));
        JsonUtils.putJsonArray(jSONObject, "placements", a(maxAdapterResponseParameters));
        a.C0139a a10 = com.applovin.impl.sdk.network.a.a(this.f12750a);
        com.applovin.impl.sdk.network.a a11 = a10.b(this.f12612f.toString() + "/recommendations.get").c("POST").a(jSONObject).a((Object) new JSONObject()).a(false).b(false).a();
        this.f12750a.l0().a((xl) new a(a11, this.f12750a, maxAdapterResponseParameters, appLovinNativeAdLoadListener));
    }
}
