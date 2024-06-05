package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.h0;
import com.applovin.impl.h8;
import com.applovin.impl.oj;
import com.applovin.impl.ql;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import n.a;
import org.json.JSONObject;

public abstract class AppLovinAdImpl extends AppLovinAdBase implements AppLovinAd, h8 {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f11481a = new Bundle();

    /* renamed from: b  reason: collision with root package name */
    private h0 f11482b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11483c;

    /* renamed from: d  reason: collision with root package name */
    private c f11484d;

    protected AppLovinAdImpl(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(jSONObject, jSONObject2, kVar);
    }

    public boolean canExpire() {
        return getSize() == AppLovinAdSize.INTERSTITIAL && a() > 0;
    }

    public boolean equals(Object obj) {
        AppLovinAd b10;
        if ((obj instanceof c) && (b10 = ((c) obj).b()) != null) {
            obj = b10;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && getAdIdNumber() == ((AppLovinAdImpl) obj).getAdIdNumber()) {
            return true;
        }
        return false;
    }

    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1);
    }

    public String getAdValue(String str) {
        return getAdValue(str, (String) null);
    }

    public h0 getAdZone() {
        h0 h0Var = this.f11482b;
        if (h0Var != null) {
            if (h0Var.f() != null && this.f11482b.g() != null) {
                return this.f11482b;
            }
            if (getSize() == null && getType() == null) {
                return this.f11482b;
            }
        }
        h0 a10 = h0.a(getSize(), getType(), getStringFromFullResponse("zone_id", (String) null), getBooleanFromFullResponse("is_bidding", false), getBooleanFromFullResponse("is_direct_sold", false));
        this.f11482b = a10;
        return a10;
    }

    public c getDummyAd() {
        return this.f11484d;
    }

    public Bundle getMAXAdValues() {
        return this.f11481a;
    }

    public abstract JSONObject getOriginalFullResponse();

    public String getRawFullResponse() {
        String jSONObject;
        ql qlVar = this.synchronizedFullResponse;
        if (qlVar != null) {
            return qlVar.toString();
        }
        synchronized (this.fullResponseLock) {
            jSONObject = this.fullResponse.toString();
        }
        return jSONObject;
    }

    public AppLovinAdSize getSize() {
        return AppLovinAdSize.fromString(getStringFromFullResponse("ad_size", (String) null));
    }

    public long getTimeToLiveMillis() {
        if (!canExpire()) {
            return Long.MAX_VALUE;
        }
        return a() - (System.currentTimeMillis() - getCreatedAtMillis());
    }

    public AppLovinAdType getType() {
        return AppLovinAdType.fromString(getStringFromFullResponse("ad_type", (String) null));
    }

    public String getZoneId() {
        if (getAdZone().i()) {
            return null;
        }
        return getStringFromFullResponse("zone_id", (String) null);
    }

    public boolean hasShown() {
        return getBooleanFromAdObject("shown", Boolean.FALSE);
    }

    public boolean hasVideoUrl() {
        this.sdk.L();
        if (!t.a()) {
            return false;
        }
        this.sdk.L().b("AppLovinAd", "Attempting to invoke hasVideoUrl() from base ad class");
        return false;
    }

    public int hashCode() {
        return (int) getAdIdNumber();
    }

    public boolean isExpired() {
        return this.f11483c;
    }

    public boolean isVideoAd() {
        if (this.adObject.has("is_video_ad")) {
            return getBooleanFromAdObject("is_video_ad", Boolean.FALSE);
        }
        return hasVideoUrl();
    }

    public void setDummyAd(c cVar) {
        this.f11484d = cVar;
    }

    public void setExpired() {
        this.f11483c = true;
    }

    public void setHasShown(boolean z10) {
        try {
            ql qlVar = this.synchronizedAdObject;
            if (qlVar != null) {
                qlVar.a("shown", (Object) Boolean.valueOf(z10));
                return;
            }
            synchronized (this.adObjectLock) {
                this.adObject.put("shown", z10);
            }
        } catch (Throwable unused) {
        }
    }

    public void setMaxAdValue(String str, Object obj) {
        BundleUtils.put(str, obj, this.f11481a);
    }

    public boolean shouldCancelHtmlCachingIfShown() {
        return getBooleanFromAdObject("chcis", Boolean.FALSE);
    }

    public String toString() {
        return "AppLovinAd{adIdNumber=" + getAdIdNumber() + ", zoneId=\"" + getZoneId() + "\"" + '}';
    }

    public String getAdValue(String str, String str2) {
        ql qlVar = this.synchronizedAdObject;
        if (qlVar != null) {
            return (String) qlVar.a((a) new d(str, str2));
        }
        return JsonUtils.getString(getJsonObjectFromAdObject("ad_values", new JSONObject()), str, str2);
    }

    private long a() {
        return getLongFromAdObject("ad_expiration_ms", ((Long) this.sdk.a(oj.f10377p1)).longValue());
    }
}
