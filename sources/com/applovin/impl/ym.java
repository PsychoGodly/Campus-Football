package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ym extends zm implements AppLovinAdLoadListener {

    /* renamed from: r  reason: collision with root package name */
    private final String f13648r;

    /* renamed from: s  reason: collision with root package name */
    private final AppLovinAdLoadListener f13649s;

    /* renamed from: t  reason: collision with root package name */
    private String f13650t;

    /* renamed from: u  reason: collision with root package name */
    private JSONObject f13651u;

    /* renamed from: v  reason: collision with root package name */
    private JSONObject f13652v;

    /* renamed from: w  reason: collision with root package name */
    private String f13653w;

    public ym(JSONObject jSONObject, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, String str, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskProcessNimbusAd", jSONObject, maxAdapterResponseParameters, maxAdFormat, kVar);
        this.f13648r = str;
        this.f13649s = appLovinAdLoadListener;
    }

    private JSONObject a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                String string = jSONArray.getString(i10);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(string, MaxReward.DEFAULT_LABEL);
                }
            } catch (JSONException e10) {
                this.f13950k.L();
                if (t.a()) {
                    this.f13950k.L().a(this.f13422b, "Failed to retrieve tracking url with a non-String value.", e10);
                }
            }
        }
        return jSONObject;
    }

    private JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "Nimbus-Session-Id", this.f13648r);
        return jSONObject;
    }

    public void adReceived(AppLovinAd appLovinAd) {
        ((AppLovinAdImpl) appLovinAd).setMaxAdValue("creative_id", this.f13653w);
        this.f13649s.adReceived(appLovinAd);
    }

    public void failedToReceiveAd(int i10) {
        this.f13649s.failedToReceiveAd(i10);
    }

    /* access modifiers changed from: protected */
    public JSONObject h() {
        JSONObject a10 = a(this.f13650t, this.f13652v, this.f13651u);
        JsonUtils.putString(a10, "cache_prefix", "nimbus");
        JsonUtils.putString(a10, "type", "nimbus");
        JsonUtils.putJSONObject(a10, "http_headers_for_postbacks", i());
        return a10;
    }

    public void run() {
        String string = JsonUtils.getString(this.f13947h, "markup", MaxReward.DEFAULT_LABEL);
        this.f13650t = string;
        if (TextUtils.isEmpty(string)) {
            this.f13649s.failedToReceiveAd(204);
            return;
        }
        String string2 = JsonUtils.getString(this.f13947h, "position", MaxReward.DEFAULT_LABEL);
        String string3 = JsonUtils.getString(this.f13947h, "placement_id", MaxReward.DEFAULT_LABEL);
        String string4 = JsonUtils.getString(this.f13947h, "auction_id", MaxReward.DEFAULT_LABEL);
        if (t.a()) {
            t tVar = this.f13423c;
            tVar.a("TaskProcessNimbusAd", "Processing Nimbus ad (" + string2 + ") for placement: " + string3 + " with auction id: " + string4 + "...");
        }
        this.f13953n = JsonUtils.getString(this.f13947h, "network", MaxReward.DEFAULT_LABEL);
        this.f13653w = JsonUtils.getString(this.f13947h, "crid", (String) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f13947h, "trackers", new JSONObject());
        this.f13652v = a(JsonUtils.getJSONArray(jSONObject, "click_trackers", (JSONArray) null));
        this.f13651u = a(JsonUtils.getJSONArray(jSONObject, "impression_trackers", (JSONArray) null));
        JSONObject h10 = h();
        JSONObject a10 = a(h10);
        if (t.a()) {
            t tVar2 = this.f13423c;
            tVar2.a("TaskProcessNimbusAd", "Starting render task for Nimbus ad: " + string2 + "...");
        }
        this.f13950k.l0().a((xl) new cn(h10, a10, this.f13649s, this.f13950k), sm.b.CORE);
    }
}
