package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.br;
import com.applovin.impl.cr;
import com.applovin.impl.ee;
import com.applovin.impl.h8;
import com.applovin.impl.ie;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;

public class b implements cr.a {

    /* renamed from: a  reason: collision with root package name */
    private final k f9496a;

    /* renamed from: b  reason: collision with root package name */
    private final ee f9497b;

    /* renamed from: c  reason: collision with root package name */
    private final cr f9498c;

    /* renamed from: d  reason: collision with root package name */
    private final br f9499d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0126a f9500e;

    public b(ee eeVar, ViewGroup viewGroup, a.C0126a aVar, k kVar) {
        this.f9496a = kVar;
        this.f9497b = eeVar;
        this.f9500e = aVar;
        this.f9499d = new br(viewGroup, kVar);
        cr crVar = new cr(viewGroup, kVar, this);
        this.f9498c = crVar;
        crVar.a((ie) eeVar);
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    public void a() {
        this.f9498c.b();
    }

    public ee b() {
        return this.f9497b;
    }

    public void c() {
        this.f9496a.L();
        if (t.a()) {
            this.f9496a.L().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f9497b.n0().compareAndSet(false, true)) {
            this.f9496a.L();
            if (t.a()) {
                this.f9496a.L().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f9497b.getNativeAd().isExpired()) {
                t.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f9496a.f().a((h8) this.f9497b);
            }
            this.f9496a.S().processRawAdImpression(this.f9497b, this.f9500e);
        }
    }

    public void onLogVisibilityImpression() {
        a(this.f9499d.a(this.f9497b));
    }

    private void a(long j10) {
        if (this.f9497b.p0().compareAndSet(false, true)) {
            this.f9496a.L();
            if (t.a()) {
                this.f9496a.L().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f9496a.S().processViewabilityAdImpressionPostback(this.f9497b, j10, this.f9500e);
        }
    }
}
