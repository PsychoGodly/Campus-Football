package com.applovin.impl.sdk.ad;

import android.os.Bundle;
import com.applovin.impl.h0;
import com.applovin.impl.ig;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;
import org.json.JSONObject;

public final class c extends AppLovinAdImpl {

    /* renamed from: f  reason: collision with root package name */
    private AppLovinAd f11517f;

    /* renamed from: g  reason: collision with root package name */
    private final h0 f11518g;

    public c(h0 h0Var, k kVar) {
        super(new JSONObject(), new JSONObject(), kVar);
        this.f11518g = h0Var;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.g().f(this.f11518g);
    }

    private String d() {
        h0 adZone = getAdZone();
        if (adZone == null || adZone.i()) {
            return null;
        }
        return adZone.e();
    }

    public void a(AppLovinAd appLovinAd) {
        this.f11517f = appLovinAd;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f11517f;
        return appLovinAd != null ? appLovinAd : c();
    }

    public AppLovinAd e() {
        return this.f11517f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.equals(obj);
        }
        return super.equals(obj);
    }

    public ig getAdEventTracker() {
        return null;
    }

    public long getAdIdNumber() {
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.getAdIdNumber();
        }
        return 0;
    }

    public h0 getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null ? appLovinAdImpl.getAdZone() : this.f11518g;
    }

    public long getCreatedAtMillis() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getCreatedAtMillis();
        }
        return 0;
    }

    public Bundle getDirectDownloadParameters() {
        return new Bundle();
    }

    public String getDirectDownloadToken() {
        return null;
    }

    public String getOpenMeasurementContentUrl() {
        return null;
    }

    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    public List getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    public JSONObject getOriginalFullResponse() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getOriginalFullResponse();
        }
        return null;
    }

    public AppLovinAdSize getSize() {
        return getAdZone().f();
    }

    public AppLovinAdType getType() {
        return getAdZone().g();
    }

    public String getZoneId() {
        if (this.f11518g.i()) {
            return null;
        }
        return this.f11518g.e();
    }

    public int hashCode() {
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return super.hashCode();
    }

    public boolean isDirectDownloadEnabled() {
        return false;
    }

    public boolean isExpired() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        return appLovinAdImpl != null && appLovinAdImpl.isExpired();
    }

    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    public boolean isVideoAd() {
        AppLovinAd b10 = b();
        return b10 != null && b10.isVideoAd();
    }

    public String toString() {
        return "AppLovinAd{ #" + getAdIdNumber() + ", adType=" + getType() + ", adSize=" + getSize() + ", zoneId='" + d() + '\'' + '}';
    }
}
