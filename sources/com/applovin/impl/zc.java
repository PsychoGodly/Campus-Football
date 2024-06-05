package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.impl.mediation.d;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.LinkedList;
import java.util.Queue;

public class zc extends MaxNativeAdListener implements MaxAdRevenueListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f13820a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxNativeAdLoader f13821b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue f13822c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f13823d = false;

    /* renamed from: f  reason: collision with root package name */
    private final Object f13824f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private a f13825g;

    public interface a {
        void onAdRevenuePaid(MaxAd maxAd);

        void onNativeAdClicked(MaxAd maxAd);

        void onNativeAdLoadFailed(String str, MaxError maxError);

        void onNativeAdLoaded();
    }

    public zc(MaxAdPlacerSettings maxAdPlacerSettings, Context context, a aVar) {
        this.f13820a = maxAdPlacerSettings.getMaxPreloadedAdCount();
        this.f13825g = aVar;
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(maxAdPlacerSettings.getAdUnitId(), context);
        this.f13821b = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(this);
        maxNativeAdLoader.setRevenueListener(this);
        maxNativeAdLoader.setPlacement(maxAdPlacerSettings.getPlacement());
        maxNativeAdLoader.setLocalExtraParameter(MaxNativeAdLoaderImpl.KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE, d.b.NATIVE_AD_PLACER);
    }

    public void a() {
        synchronized (this.f13824f) {
            for (MaxAd a10 : this.f13822c) {
                a(a10);
            }
            this.f13822c.clear();
        }
    }

    public MaxAd b() {
        MaxAd maxAd;
        synchronized (this.f13824f) {
            maxAd = null;
            while (!this.f13822c.isEmpty() && (maxAd == null || maxAd.getNativeAd().isExpired())) {
                maxAd = (MaxAd) this.f13822c.remove();
            }
            e();
        }
        return maxAd;
    }

    public void c() {
        this.f13825g = null;
        a();
        this.f13821b.destroy();
    }

    public boolean d() {
        boolean z10;
        synchronized (this.f13824f) {
            z10 = !this.f13822c.isEmpty();
        }
        return z10;
    }

    public void e() {
        synchronized (this.f13824f) {
            if (!this.f13823d && this.f13822c.size() < this.f13820a) {
                this.f13823d = true;
                this.f13821b.loadAd();
            }
        }
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        a aVar = this.f13825g;
        if (aVar != null) {
            aVar.onAdRevenuePaid(maxAd);
        }
    }

    public void onNativeAdClicked(MaxAd maxAd) {
        a aVar = this.f13825g;
        if (aVar != null) {
            aVar.onNativeAdClicked(maxAd);
        }
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        a aVar = this.f13825g;
        if (aVar != null) {
            aVar.onNativeAdLoadFailed(str, maxError);
        }
    }

    public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        synchronized (this.f13824f) {
            this.f13822c.add(maxAd);
            this.f13823d = false;
            e();
        }
        a aVar = this.f13825g;
        if (aVar != null) {
            aVar.onNativeAdLoaded();
        }
    }

    public void a(MaxAd maxAd) {
        this.f13821b.destroy(maxAd);
    }

    public boolean a(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        return this.f13821b.render(maxNativeAdView, maxAd);
    }
}
