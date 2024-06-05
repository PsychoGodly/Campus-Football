package com.applovin.impl;

import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class zm extends xl {

    /* renamed from: o  reason: collision with root package name */
    private static JSONObject f13944o;

    /* renamed from: p  reason: collision with root package name */
    private static JSONObject f13945p;

    /* renamed from: q  reason: collision with root package name */
    private static JSONObject f13946q;

    /* renamed from: h  reason: collision with root package name */
    protected final JSONObject f13947h;

    /* renamed from: i  reason: collision with root package name */
    protected final MaxAdapterResponseParameters f13948i;

    /* renamed from: j  reason: collision with root package name */
    protected final MaxAdFormat f13949j;

    /* renamed from: k  reason: collision with root package name */
    protected final k f13950k;

    /* renamed from: l  reason: collision with root package name */
    private final AppLovinAdSize f13951l;

    /* renamed from: m  reason: collision with root package name */
    private final AppLovinAdType f13952m;

    /* renamed from: n  reason: collision with root package name */
    protected String f13953n;

    public zm(String str, JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, k kVar) {
        super(str, kVar);
        this.f13947h = jSONObject;
        this.f13948i = maxAdapterResponseParameters;
        this.f13949j = maxAdFormat;
        this.f13950k = kVar;
        this.f13951l = a(maxAdFormat);
        this.f13952m = b(maxAdFormat);
    }

    private static AppLovinAdType b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd() || MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.REGULAR;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdType.NATIVE;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            return AppLovinAdType.INCENTIVIZED;
        }
        if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            return AppLovinAdType.AUTO_INCENTIVIZED;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            return AppLovinAdType.APP_OPEN;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private JSONArray c(pg pgVar) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putInt(jSONObject, "id", 1);
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "text", pgVar.y());
        JsonUtils.putJSONObject(jSONObject, "title", jSONObject2);
        jSONArray.put(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putInt(jSONObject3, "id", 8);
        JSONObject jSONObject4 = new JSONObject();
        JsonUtils.putString(jSONObject4, "value", pgVar.p());
        JsonUtils.putJSONObject(jSONObject3, JsonStorageKeyNames.DATA_KEY, jSONObject4);
        jSONArray.put(jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JsonUtils.putInt(jSONObject5, "id", 4);
        JSONObject jSONObject6 = new JSONObject();
        JsonUtils.putString(jSONObject6, "value", pgVar.q());
        JsonUtils.putJSONObject(jSONObject5, JsonStorageKeyNames.DATA_KEY, jSONObject6);
        jSONArray.put(jSONObject5);
        if (StringUtils.isValidString(pgVar.w())) {
            JSONObject jSONObject7 = new JSONObject();
            JsonUtils.putInt(jSONObject7, "id", 2);
            JSONObject jSONObject8 = new JSONObject();
            JsonUtils.putString(jSONObject8, "url", pgVar.w());
            JsonUtils.putInt(jSONObject8, "w", pgVar.x());
            JsonUtils.putInt(jSONObject8, "h", pgVar.v());
            JsonUtils.putJSONObject(jSONObject7, "img", jSONObject8);
            jSONArray.put(jSONObject7);
        }
        return jSONArray;
    }

    private JSONArray d(pg pgVar) {
        JSONArray jSONArray = new JSONArray();
        for (String putString : pgVar.t()) {
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putString(jSONObject, "url", putString);
            JsonUtils.putInt(jSONObject, "event", 1);
            JsonUtils.putInt(jSONObject, "method", 1);
            jSONArray.put(jSONObject);
        }
        for (String putString2 : pgVar.u()) {
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "url", putString2);
            JsonUtils.putInt(jSONObject2, "type", 1);
            JsonUtils.putInt(jSONObject2, "method", 2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    private JSONObject e() {
        JSONObject jSONObject = f13944o;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putString(jSONObject2, "base_url", "file://");
        JsonUtils.putString(jSONObject2, "graphic_background_color", "#000000");
        JsonUtils.putBoolean(jSONObject2, "lock_current_orientation", true);
        JsonUtils.putBoolean(jSONObject2, "omsdk_enabled", false);
        JsonUtils.putBoolean(jSONObject2, "playback_requires_user_action", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putBoolean(jSONObject2, "unhide_adview_on_render", true);
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        f13944o = jSONObject2;
        return jSONObject2;
    }

    private JSONObject f() {
        JSONObject jSONObject = f13945p;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putInt(jSONObject2, "ad_id", 0);
        JsonUtils.putBoolean(jSONObject2, "uerp", true);
        JsonUtils.putString(jSONObject2, "presentation_mode", "activity");
        JsonUtils.putJSONObject(jSONObject2, "web_view_settings", g());
        f13945p = jSONObject2;
        return jSONObject2;
    }

    private static JSONObject g() {
        JSONObject jSONObject = f13946q;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putBoolean(jSONObject2, "allow_file_access", true);
        f13946q = jSONObject2;
        return jSONObject2;
    }

    /* access modifiers changed from: protected */
    public JSONObject a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject e10 = e();
        JsonUtils.putAll(e10, JsonUtils.deserialize(this.f13948i.getServerParameters().getString("ad_object")));
        JsonUtils.putString(e10, "html", str);
        JsonUtils.putJSONObject(e10, "click_tracking_urls", jSONObject);
        JsonUtils.putJSONObject(e10, "imp_urls", jSONObject2);
        return e10;
    }

    /* access modifiers changed from: protected */
    public JSONObject a(pg pgVar) {
        JSONObject f10 = f();
        JsonUtils.putAll(f10, JsonUtils.deserialize(this.f13948i.getServerParameters().getString("ad_object")));
        JsonUtils.putJSONObject(f10, "ortb_response", b(pgVar));
        return f10;
    }

    private JSONObject b(pg pgVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArray(jSONObject, "assets", c(pgVar));
        JsonUtils.putJSONObject(jSONObject, "link", e(pgVar));
        JsonUtils.putJsonArray(jSONObject, "eventtrackers", d(pgVar));
        JsonUtils.putString(jSONObject, "ver", pgVar.z());
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putJSONObject(jSONObject2, "native", jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        JsonUtils.putString(jSONObject3, "version", pgVar.z());
        JsonUtils.putJSONObject(jSONObject3, "value", jSONObject2);
        return jSONObject3;
    }

    private static AppLovinAdSize a(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isFullscreenAd()) {
            return AppLovinAdSize.INTERSTITIAL;
        }
        if (MaxAdFormat.BANNER == maxAdFormat) {
            return AppLovinAdSize.BANNER;
        }
        if (MaxAdFormat.LEADER == maxAdFormat) {
            return AppLovinAdSize.LEADER;
        }
        if (MaxAdFormat.MREC == maxAdFormat) {
            return AppLovinAdSize.MREC;
        }
        if (MaxAdFormat.NATIVE == maxAdFormat) {
            return AppLovinAdSize.NATIVE;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private JSONObject e(pg pgVar) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "url", pgVar.r());
        JsonUtils.putJsonArray(jSONObject, "clicktrackers", pgVar.s());
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "ad_size", this.f13951l.toString());
        JsonUtils.putString(jSONObject2, "ad_type", this.f13952m.toString());
        JsonUtils.putString(jSONObject2, "dsp_name", this.f13953n);
        JsonUtils.putInt(jSONObject2, "status", 200);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        JsonUtils.putJsonArray(jSONObject2, "ads", jSONArray);
        return jSONObject2;
    }
}
