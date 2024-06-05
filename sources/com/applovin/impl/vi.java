package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.google.android.gms.common.api.a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class vi {

    /* renamed from: d  reason: collision with root package name */
    private static JSONObject f12749d;

    /* renamed from: a  reason: collision with root package name */
    protected final k f12750a;

    /* renamed from: b  reason: collision with root package name */
    protected final String f12751b;
    /* access modifiers changed from: protected */

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f12752c = PreferenceManager.getDefaultSharedPreferences(k.k());

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f12753a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f12754b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final JSONObject f12755c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final JSONObject f12756d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final JSONObject f12757e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final JSONObject f12758f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final JSONObject f12759g;

        /* renamed from: com.applovin.impl.vi$a$a  reason: collision with other inner class name */
        public static class C0142a {

            /* renamed from: a  reason: collision with root package name */
            private JSONObject f12760a;

            /* renamed from: b  reason: collision with root package name */
            private JSONObject f12761b;

            /* renamed from: c  reason: collision with root package name */
            private JSONObject f12762c;

            /* renamed from: d  reason: collision with root package name */
            private JSONObject f12763d;

            /* renamed from: e  reason: collision with root package name */
            private JSONObject f12764e;

            /* renamed from: f  reason: collision with root package name */
            private JSONObject f12765f;

            /* renamed from: g  reason: collision with root package name */
            private JSONObject f12766g;

            C0142a() {
            }

            public C0142a a(JSONObject jSONObject) {
                this.f12760a = jSONObject;
                return this;
            }

            public C0142a b(JSONObject jSONObject) {
                this.f12761b = jSONObject;
                return this;
            }

            public C0142a c(JSONObject jSONObject) {
                this.f12766g = jSONObject;
                return this;
            }

            public C0142a d(JSONObject jSONObject) {
                this.f12764e = jSONObject;
                return this;
            }

            public String toString() {
                return "S2SApiService.Extensions.Builder(bidRequestExtObject=" + this.f12760a + ", impExtObject=" + this.f12761b + ", appExtObject=" + this.f12762c + ", deviceExtObject=" + this.f12763d + ", userExtObject=" + this.f12764e + ", sourceExtObject=" + this.f12765f + ", regsExtObject=" + this.f12766g + ")";
            }

            public a a() {
                return new a(this.f12760a, this.f12761b, this.f12762c, this.f12763d, this.f12764e, this.f12765f, this.f12766g);
            }
        }

        a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, JSONObject jSONObject6, JSONObject jSONObject7) {
            this.f12753a = jSONObject;
            this.f12754b = jSONObject2;
            this.f12755c = jSONObject3;
            this.f12756d = jSONObject4;
            this.f12757e = jSONObject5;
            this.f12758f = jSONObject6;
            this.f12759g = jSONObject7;
        }

        public static C0142a a() {
            return new C0142a();
        }
    }

    protected vi(String str, k kVar) {
        this.f12751b = str;
        this.f12750a = kVar;
    }

    private JSONObject a(Bundle bundle, JSONObject jSONObject, Context context) {
        JSONObject a10 = a(context);
        JsonUtils.putString(a10, "domain", bundle.getString("domain", MaxReward.DEFAULT_LABEL));
        JsonUtils.putString(a10, "storeurl", bundle.getString("storeurl", MaxReward.DEFAULT_LABEL));
        JsonUtils.putJSONObjectIfValid(a10, "ext", jSONObject);
        return a10;
    }

    /* access modifiers changed from: protected */
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        Boolean c10 = c();
        if (c10 != null && c10.booleanValue()) {
            JsonUtils.putBoolean(jSONObject, "did_consent", y3.b().b(k.k()).booleanValue());
            JsonUtils.putString(jSONObject, "consent", this.f12750a.m0().k());
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public Boolean c() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(k.k());
        String a10 = qj.f11014r.a();
        if (!defaultSharedPreferences.contains(a10)) {
            return null;
        }
        boolean z10 = false;
        String str = (String) sj.a(a10, MaxReward.DEFAULT_LABEL, String.class, defaultSharedPreferences, false);
        if (StringUtils.isValidString(str)) {
            if (str.equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) || str.equalsIgnoreCase("true")) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        Integer num = (Integer) sj.a(a10, Integer.valueOf(a.e.API_PRIORITY_OTHER), Integer.class, defaultSharedPreferences, false);
        if (num == null || num.intValue() == Integer.MAX_VALUE) {
            Long l10 = (Long) sj.a(a10, Long.MAX_VALUE, Long.class, defaultSharedPreferences, false);
            if (l10 == null || l10.longValue() == Long.MAX_VALUE) {
                return (Boolean) sj.a(a10, Boolean.FALSE, Boolean.class, defaultSharedPreferences, false);
            }
            if (l10.longValue() > 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
        if (num.intValue() > 0) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private JSONArray a(Bundle bundle, MaxAdFormat maxAdFormat, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putDouble(jSONObject2, "bidfloor", bundle.getDouble("bidfloor", 0.0d));
        if (maxAdFormat.isAdViewAd()) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putInt(jSONObject3, "w", bundle.getInt("width", maxAdFormat.getSize().getWidth()));
            JsonUtils.putInt(jSONObject3, "h", bundle.getInt("height", maxAdFormat.getSize().getHeight()));
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(3);
            jSONArray2.put(5);
            jSONArray2.put(6);
            JsonUtils.putJsonArray(jSONObject3, "api", jSONArray2);
            JsonUtils.putJSONObject(jSONObject2, "banner", jSONObject3);
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        jSONArray.put(jSONObject2);
        return jSONArray;
    }

    private JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public JSONObject a() {
        Map map;
        JSONObject jSONObject = new JSONObject();
        if (this.f12750a.y() != null) {
            map = this.f12750a.y().b();
        } else {
            map = this.f12750a.x().A();
        }
        JsonUtils.putObject(jSONObject, "gdpr", map.get("IABTCF_gdprApplies"));
        Boolean b10 = y3.a().b(k.k());
        if (b10 != null) {
            JsonUtils.putString(jSONObject, "us_privacy", b10.booleanValue() ? "1YY-" : "1YN-");
        }
        return jSONObject;
    }

    public com.applovin.impl.sdk.network.a a(String str, String str2, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, a aVar, Map map, boolean z10, k kVar) {
        Map map2;
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            String str3 = this.f12751b;
            L.a(str3, "Creating OpenRTB request with " + str2);
        }
        Bundle customParameters = maxAdapterResponseParameters.getCustomParameters();
        Context k10 = k.k();
        if (kVar.y() != null) {
            map2 = kVar.y().d();
        } else {
            map2 = kVar.x().a(false);
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "id", str2);
        JsonUtils.putBoolean(jSONObject, "test", maxAdapterResponseParameters.isTesting());
        JsonUtils.putJsonArrayIfValid(jSONObject, "imp", a(customParameters, maxAdFormat, aVar.f12754b));
        JsonUtils.putJSONObjectIfValid(jSONObject, "app", a(customParameters, aVar.f12755c, k10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "device", a(aVar.f12756d, map2, kVar));
        JsonUtils.putJSONObjectIfValid(jSONObject, "user", b(aVar.f12757e));
        JsonUtils.putJSONObjectIfValid(jSONObject, "source", a(aVar.f12758f));
        JsonUtils.putJSONObjectIfValid(jSONObject, "regs", a(aVar.f12759g, k10));
        JsonUtils.putJSONObjectIfValid(jSONObject, "format", a(map2));
        JsonUtils.putJSONObjectIfValid(jSONObject, "ext", aVar.f12753a);
        return com.applovin.impl.sdk.network.a.a(kVar).b(str).c("POST").a(map).a(jSONObject).a((Object) new JSONObject()).a(false).b(z10).a();
    }

    private JSONObject a(JSONObject jSONObject, Map map, k kVar) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ua", String.valueOf(map.get("ua")));
        JsonUtils.putBoolean(jSONObject2, "dnt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putBoolean(jSONObject2, "lmt", ((Boolean) map.get("dnt")).booleanValue());
        JsonUtils.putString(jSONObject2, "ifa", String.valueOf(map.get("idfa")));
        JsonUtils.putString(jSONObject2, "make", String.valueOf(map.get("brand_name")));
        JsonUtils.putString(jSONObject2, "model", String.valueOf(map.get("model")));
        JsonUtils.putString(jSONObject2, "os", "android");
        JsonUtils.putString(jSONObject2, "osv", String.valueOf(map.get("os")));
        JsonUtils.putInt(jSONObject2, "devicetype", 1);
        JsonUtils.putInt(jSONObject2, "connectiontype", c4.h(kVar));
        JsonUtils.putInt(jSONObject2, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject2, "h", ((Integer) map.get("dy")).intValue());
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, Context context) {
        JSONObject jSONObject2 = new JSONObject();
        Boolean b10 = y3.c().b(context);
        if (b10 != null) {
            JsonUtils.putBoolean(jSONObject2, "coppa", b10.booleanValue());
        }
        JsonUtils.putJSONObjectIfValid(jSONObject2, "ext", jSONObject);
        return jSONObject2;
    }

    private JSONObject a(Map map) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "w", ((Integer) map.get("dx")).intValue());
        JsonUtils.putInt(jSONObject, "h", ((Integer) map.get("dy")).intValue());
        return jSONObject;
    }

    private static JSONObject a(Context context) {
        JSONObject jSONObject = f12749d;
        if (jSONObject != null) {
            return jSONObject;
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, MediationMetaData.KEY_NAME, packageManager.getApplicationLabel(applicationInfo).toString());
        JsonUtils.putString(jSONObject2, "bundle", applicationInfo.packageName);
        JsonUtils.putString(jSONObject2, "ver", packageInfo != null ? packageInfo.versionName : MaxReward.DEFAULT_LABEL);
        f12749d = jSONObject2;
        return jSONObject2;
    }
}
