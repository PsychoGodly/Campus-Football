package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import org.json.JSONArray;
import org.json.JSONObject;

public class tm extends xl implements mb {

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f12430h;

    /* renamed from: i  reason: collision with root package name */
    private final h0 f12431i;

    /* renamed from: j  reason: collision with root package name */
    private final AppLovinAdLoadListener f12432j;

    public tm(JSONObject jSONObject, h0 h0Var, AppLovinAdLoadListener appLovinAdLoadListener, k kVar) {
        super("TaskProcessAdResponse", kVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (h0Var != null) {
            this.f12430h = jSONObject;
            this.f12431i = h0Var;
            this.f12432j = appLovinAdLoadListener;
        } else {
            throw new IllegalArgumentException("No zone specified");
        }
    }

    private void a(JSONObject jSONObject) {
        String string = JsonUtils.getString(jSONObject, "type", "undefined");
        if ("applovin".equalsIgnoreCase(string)) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Starting task for AppLovin ad...");
            }
            this.f13421a.l0().a((xl) new cn(jSONObject, this.f12430h, this, this.f13421a));
        } else if ("vast".equalsIgnoreCase(string)) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Starting task for VAST ad...");
            }
            this.f13421a.l0().a((xl) bn.a(jSONObject, this.f12430h, (AppLovinAdLoadListener) this, this.f13421a));
        } else if ("js_tag".equalsIgnoreCase(string)) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Starting task for JS tag ad...");
            }
            this.f13421a.l0().a((xl) new um(jSONObject, this.f12430h, this, this.f13421a));
        } else {
            if (t.a()) {
                t tVar = this.f13423c;
                String str = this.f13422b;
                tVar.b(str, "Unable to process ad of unknown type: " + string);
            }
            failedToReceiveAdV2(new AppLovinError(AppLovinErrorCodes.INVALID_RESPONSE, "Unknown ad type: " + string));
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f12432j;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f12432j;
        if (appLovinAdLoadListener != null) {
            if (appLovinAdLoadListener instanceof mb) {
                ((mb) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
            } else {
                appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
            }
        }
    }

    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f12430h, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (t.a()) {
                this.f13423c.a(this.f13422b, "Processing ad...");
            }
            a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        if (t.a()) {
            this.f13423c.k(this.f13422b, "No ads were returned from the server");
        }
        zp.a(this.f12431i.e(), this.f12431i.d(), this.f12430h, this.f13421a);
        failedToReceiveAdV2(AppLovinError.NO_FILL);
    }
}
