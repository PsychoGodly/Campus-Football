package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.pg;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class an extends zm {

    /* renamed from: r  reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f6557r;

    /* renamed from: s  reason: collision with root package name */
    private final pg.a f6558s = pg.o();

    /* renamed from: t  reason: collision with root package name */
    private String f6559t = MaxReward.DEFAULT_LABEL;

    /* renamed from: u  reason: collision with root package name */
    private String f6560u = MaxReward.DEFAULT_LABEL;

    /* renamed from: v  reason: collision with root package name */
    private String f6561v = MaxReward.DEFAULT_LABEL;

    /* renamed from: w  reason: collision with root package name */
    private String f6562w = null;

    public an(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, k kVar) {
        super("TaskProcessTaboolaAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f6557r = appLovinNativeAdLoadListener;
    }

    private String a(Object obj, String str, String str2) {
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = JsonUtils.getString(jSONObject, "onEvent", MaxReward.DEFAULT_LABEL);
        String string2 = JsonUtils.getString(jSONObject, "type", MaxReward.DEFAULT_LABEL);
        if (StringUtils.isValidString(str) && !str.equalsIgnoreCase(string)) {
            return null;
        }
        if (!StringUtils.isValidString(str2) || str2.equalsIgnoreCase(string2)) {
            return JsonUtils.getString(jSONObject, "value", (String) null);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public JSONObject h() {
        JSONObject a10 = a(this.f6558s.a());
        JsonUtils.putString(a10, "cache_prefix", "taboola_");
        JsonUtils.putString(a10, "type", "taboola");
        JsonUtils.putString(a10, "privacy_url", this.f6562w);
        return a10;
    }

    public void run() {
        JSONObject optJSONObject;
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f13947h, "placements", new JSONArray());
        if (jSONArray.length() == 0) {
            if (t.a()) {
                this.f13423c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f6557r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, 0, new JSONObject());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "list", new JSONArray());
        String string = JsonUtils.getString(jSONObject, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL);
        if (jSONArray2.length() == 0) {
            if (t.a()) {
                this.f13423c.k("TaskProcessTaboolaAd", "No ads were returned from the server");
            }
            this.f6557r.onNativeAdLoadFailed(AppLovinError.NO_FILL);
            return;
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray2, 0, new JSONObject());
        this.f6559t = JsonUtils.getString(jSONObject2, "id", MaxReward.DEFAULT_LABEL);
        if (t.a()) {
            t tVar = this.f13423c;
            tVar.a("TaskProcessTaboolaAd", "Processing Taboola ad (" + this.f6559t + ") for placement: " + string + "...");
        }
        this.f6560u = JsonUtils.getString(jSONObject2, "type", MaxReward.DEFAULT_LABEL);
        this.f6561v = JsonUtils.getString(jSONObject2, "origin", MaxReward.DEFAULT_LABEL);
        this.f6562w = JsonUtils.getString(jSONObject2, "discloser", (String) null);
        this.f6558s.f("Taboola_2.0");
        this.f6558s.e(JsonUtils.getString(jSONObject2, MediationMetaData.KEY_NAME, MaxReward.DEFAULT_LABEL));
        this.f6558s.a(JsonUtils.getString(jSONObject2, "branding", MaxReward.DEFAULT_LABEL));
        this.f6558s.b(JsonUtils.getString(jSONObject2, "description", MaxReward.DEFAULT_LABEL));
        this.f6558s.c(JsonUtils.getString(jSONObject2, "url", (String) null));
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject2, "thumbnail", new JSONArray());
        if (jSONArray3.length() > 0 && (optJSONObject = jSONArray3.optJSONObject(0)) != null) {
            this.f6558s.d(JsonUtils.getString(optJSONObject, "url", (String) null));
            this.f6558s.b(JsonUtils.getInt(optJSONObject, "width", 0));
            this.f6558s.a(JsonUtils.getInt(optJSONObject, "height", 0));
        }
        JSONArray jSONArray4 = JsonUtils.getJSONArray(jSONObject2, "beacons", (JSONArray) null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "events", (JSONObject) null);
        JSONArray jSONArray5 = JsonUtils.getJSONArray(JsonUtils.getJSONObject(this.f13947h, "user", (JSONObject) null), "beacons", (JSONArray) null);
        this.f6558s.a(a(jSONObject3, jSONArray4));
        this.f6558s.b(a(jSONArray4, jSONArray5));
        this.f6558s.a(a(jSONObject3, jSONArray4, jSONArray5));
        JSONObject a10 = a(h());
        if (t.a()) {
            t tVar2 = this.f13423c;
            tVar2.a("TaskProcessTaboolaAd", "Starting render task for Taboola ad: " + string + "...");
        }
        this.f13950k.l0().a((xl) new xm(a10, this.f6557r, this.f13950k), sm.b.CORE);
    }

    private JSONArray a(JSONObject jSONObject, JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        String string = JsonUtils.getString(jSONObject, "click", (String) null);
        if (StringUtils.isValidString(string)) {
            if (t.a()) {
                t tVar = this.f13423c;
                tVar.a("TaskProcessTaboolaAd", "Processed click tracking URL: " + string);
            }
            jSONArray2.put(string);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray, i10, (Object) null), "click", "pixel");
                if (!TextUtils.isEmpty(a10)) {
                    if (t.a()) {
                        t tVar2 = this.f13423c;
                        tVar2.a("TaskProcessTaboolaAd", "Processed click tracking URL: " + a10);
                    }
                    jSONArray2.put(a10);
                }
            }
        }
        return jSONArray2;
    }

    private List a(JSONObject jSONObject, JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        String string = JsonUtils.getString(jSONObject, "available", (String) null);
        if (StringUtils.isValidString(string)) {
            if (t.a()) {
                t tVar = this.f13423c;
                tVar.a("TaskProcessTaboolaAd", "Processed impression URL: " + string);
            }
            arrayList.add(string);
        }
        String string2 = JsonUtils.getString(jSONObject, "visible", (String) null);
        if (StringUtils.isValidString(string2)) {
            if (t.a()) {
                t tVar2 = this.f13423c;
                tVar2.a("TaskProcessTaboolaAd", "Processed impression URL: " + string2);
            }
            arrayList.add(string2);
        }
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i10, (Object) null);
                String a10 = a(objectAtIndex, "available", "pixel");
                if (!StringUtils.isValidString(a10)) {
                    a10 = a(objectAtIndex, "visible", "pixel");
                }
                if (!TextUtils.isEmpty(a10)) {
                    if (t.a()) {
                        t tVar3 = this.f13423c;
                        tVar3.a("TaskProcessTaboolaAd", "Processed impression URL: " + a10);
                    }
                    arrayList.add(a10);
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a11 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, (Object) null), (String) null, "pixel");
                if (!TextUtils.isEmpty(a11)) {
                    if (t.a()) {
                        t tVar4 = this.f13423c;
                        tVar4.a("TaskProcessTaboolaAd", "Processed impression URL: " + a11);
                    }
                    arrayList.add(a11);
                }
            }
        }
        return arrayList;
    }

    private List a(JSONArray jSONArray, JSONArray jSONArray2) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String a10 = a(JsonUtils.getObjectAtIndex(jSONArray, i10, (Object) null), (String) null, "script");
                if (!TextUtils.isEmpty(a10)) {
                    arrayList.add(Uri.decode(a10));
                }
            }
        }
        if (jSONArray2 != null) {
            for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                String a11 = a(JsonUtils.getObjectAtIndex(jSONArray2, i11, (Object) null), (String) null, "script");
                if (!TextUtils.isEmpty(a11)) {
                    arrayList.add(Uri.decode(a11));
                }
            }
        }
        return arrayList;
    }
}
