package com.applovin.impl;

import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.mediation.g;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class ee extends ie implements h8 {

    /* renamed from: v  reason: collision with root package name */
    private final AtomicBoolean f7414v = new AtomicBoolean();

    /* renamed from: w  reason: collision with root package name */
    private final AtomicBoolean f7415w = new AtomicBoolean();

    public ee(int i10, Map map, JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        super(i10, map, jSONObject, jSONObject2, (g) null, kVar);
    }

    private long k0() {
        long a10 = a("ad_expiration_ms", -1);
        return a10 < 0 ? b("ad_expiration_ms", ((Long) this.f8971a.a(qe.f10974l7)).longValue()) : a10;
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.f6686o.a(maxNativeAdView);
    }

    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - J());
    }

    public MaxNativeAdView l0() {
        return this.f6686o.f();
    }

    public ViewGroup m0() {
        return this.f6686o.h();
    }

    public AtomicBoolean n0() {
        return this.f7414v;
    }

    public String o0() {
        return BundleUtils.getString("template", MaxReward.DEFAULT_LABEL, l());
    }

    public AtomicBoolean p0() {
        return this.f7415w;
    }

    public boolean q0() {
        return a("inacc", (Boolean) this.f8971a.a(qe.D7)).booleanValue();
    }

    public boolean r0() {
        return this.f6686o == null;
    }

    public void setExpired() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f6686o.a(viewGroup);
    }

    public be a(g gVar) {
        return new ee(this, gVar);
    }

    private ee(ee eeVar, g gVar) {
        super(eeVar.I(), eeVar.i(), eeVar.a(), eeVar.g(), gVar, eeVar.f8971a);
    }
}
