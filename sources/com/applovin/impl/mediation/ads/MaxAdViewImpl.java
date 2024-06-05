package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.ar;
import com.applovin.impl.bc;
import com.applovin.impl.br;
import com.applovin.impl.ce;
import com.applovin.impl.cr;
import com.applovin.impl.e0;
import com.applovin.impl.ie;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MaxAdViewImpl extends a implements d.a, cr.a, v.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9424a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxAdView f9425b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9426c = UUID.randomUUID().toString().toLowerCase(Locale.US);

    /* renamed from: d  reason: collision with root package name */
    private final View f9427d;

    /* renamed from: e  reason: collision with root package name */
    private long f9428e = Long.MAX_VALUE;

    /* renamed from: f  reason: collision with root package name */
    private ce f9429f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f9430g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f9431h;

    /* renamed from: i  reason: collision with root package name */
    private final b f9432i;

    /* renamed from: j  reason: collision with root package name */
    private final d f9433j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final com.applovin.impl.sdk.d f9434k;

    /* renamed from: l  reason: collision with root package name */
    private final br f9435l;

    /* renamed from: m  reason: collision with root package name */
    private final cr f9436m;

    /* renamed from: n  reason: collision with root package name */
    private final Object f9437n = new Object();
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public ce f9438o = null;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9439p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f9440q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f9441r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f9442s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public boolean f9443t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f9444u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f9445v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f9446w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public boolean f9447x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f9448y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f9449z;

    private class b extends c {
        private b() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                tVar2.a(str2, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            bc.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.a()) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
                return;
            }
            ce ceVar = (ce) maxAd;
            ceVar.g(MaxAdViewImpl.this.f9430g);
            ceVar.f(MaxAdViewImpl.this.f9431h);
            if (ceVar.x() != null) {
                if (ceVar.p0()) {
                    long k02 = ceVar.k0();
                    MaxAdViewImpl.this.sdk.L();
                    if (t.a()) {
                        t L = MaxAdViewImpl.this.sdk.L();
                        String str2 = MaxAdViewImpl.this.tag;
                        L.a(str2, "Scheduling banner ad refresh " + k02 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                    }
                    MaxAdViewImpl.this.f9434k.a(k02);
                    if (MaxAdViewImpl.this.f9434k.g() || MaxAdViewImpl.this.f9440q) {
                        t tVar3 = MaxAdViewImpl.this.logger;
                        if (t.a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f9434k.j();
                    }
                }
                t tVar4 = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    t tVar5 = maxAdViewImpl3.logger;
                    String str3 = maxAdViewImpl3.tag;
                    tVar5.a(str3, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.f(MaxAdViewImpl.this.adListener, maxAd, true);
                MaxAdViewImpl.this.d(ceVar);
                return;
            }
            MaxAdViewImpl.this.sdk.S().destroyAd(ceVar);
            onAdLoadFailed(ceVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    private abstract class c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.C0126a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f9451a;

        private c() {
        }

        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                if ((MaxAdViewImpl.this.f9438o.q0() || MaxAdViewImpl.this.f9447x) && this.f9451a) {
                    this.f9451a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                if ((MaxAdViewImpl.this.f9438o.q0() || MaxAdViewImpl.this.f9447x) && !MaxAdViewImpl.this.f9434k.g()) {
                    this.f9451a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f9438o)) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                bc.e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        public void onAdRequestStarted(String str) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                tVar2.a(str2, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            bc.a(MaxAdViewImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str = maxAdViewImpl.tag;
                tVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            bc.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    private class d extends c {
        private d() {
            super();
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            t tVar = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                t tVar2 = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                tVar2.a(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.a(maxError);
        }

        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f9443t) {
                t tVar = MaxAdViewImpl.this.logger;
                if (t.a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    t tVar2 = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    tVar2.a(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.S().destroyAd(maxAd);
                return;
            }
            t tVar3 = MaxAdViewImpl.this.logger;
            if (t.a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.a(maxAdViewImpl2.tag, "Successfully pre-cached ad for refresh");
            }
            MaxAdViewImpl.this.a(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, k kVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", kVar);
        if (context != null) {
            this.f9424a = context.getApplicationContext();
            this.f9425b = maxAdView;
            this.f9427d = view;
            this.f9432i = new b();
            this.f9433j = new d();
            this.f9434k = new com.applovin.impl.sdk.d(kVar, this);
            this.f9435l = new br(maxAdView, kVar);
            this.f9436m = new cr(maxAdView, kVar, this);
            kVar.h().a((v.b) this);
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                tVar.a(str2, "Created new MaxAdView (" + this + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No context specified");
    }

    private void c(ce ceVar) {
        int height = this.f9425b.getHeight();
        int width = this.f9425b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.f9424a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f9424a, width);
            MaxAdFormat format = ceVar.getFormat();
            int height2 = (this.f9449z ? format.getAdaptiveSize(pxToDp2, this.f9425b.getContext()) : format.getSize()).getHeight();
            int min = Math.min(format.getSize().getWidth(), x3.b(this.f9424a).x);
            if (pxToDp < height2 || pxToDp2 < min) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n**************************************************\n`MaxAdView` size ");
                sb2.append(pxToDp2);
                sb2.append("x");
                sb2.append(pxToDp);
                sb2.append(" dp smaller than required ");
                sb2.append(this.f9449z ? "adaptive " : MaxReward.DEFAULT_LABEL);
                sb2.append("size: ");
                sb2.append(min);
                sb2.append("x");
                sb2.append(height2);
                sb2.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String sb3 = sb2.toString();
                if (t.a()) {
                    this.logger.b("AppLovinSdk", sb3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void d(ce ceVar) {
        AppLovinSdkUtils.runOnUiThread(new d(this, ceVar));
    }

    public void destroy() {
        e();
        if (this.f9429f != null) {
            this.sdk.S().destroyAd(this.f9429f);
        }
        synchronized (this.f9437n) {
            this.f9443t = true;
        }
        this.f9434k.a();
        this.sdk.h().b((v.b) this);
        this.sdk.M().c(this.adUnitId, this.f9426c);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f9430g;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    public void onAdRefresh() {
        this.f9441r = false;
        if (this.f9429f != null) {
            f();
        } else if (!b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Refreshing ad from network...");
            }
            loadAd(d.b.REFRESH);
        } else if (this.f9439p) {
            if (t.a()) {
                this.logger.a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(d.b.REFRESH);
        } else {
            if (t.a()) {
                this.logger.b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f9441r = true;
        }
    }

    public void onCreativeIdGenerated(String str, String str2) {
        ce ceVar = this.f9438o;
        if (ceVar == null || !ceVar.Q().equalsIgnoreCase(str)) {
            ce ceVar2 = this.f9429f;
            if (ceVar2 != null && ceVar2.Q().equalsIgnoreCase(str)) {
                this.f9429f.h(str2);
                return;
            }
            return;
        }
        this.f9438o.h(str2);
        bc.b(this.adReviewListener, str2, (MaxAd) this.f9438o);
    }

    public void onLogVisibilityImpression() {
        a(this.f9438o, this.f9435l.a(this.f9438o));
    }

    public void onWindowVisibilityChanged(int i10) {
        if (((Boolean) this.sdk.a(qe.Y6)).booleanValue() && this.f9434k.h()) {
            if (ar.b(i10)) {
                if (t.a()) {
                    this.logger.a(this.tag, "Ad view visible");
                }
                this.f9434k.d();
                return;
            }
            if (t.a()) {
                this.logger.a(this.tag, "Ad view hidden");
            }
            this.f9434k.c();
        }
    }

    public void setCustomData(String str) {
        if (this.f9438o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            tVar.k(str2, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        zp.b(str, this.tag);
        this.f9431h = str;
    }

    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f9438o != null && t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            tVar.k(str2, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f9430g = str;
    }

    public void setPublisherBackgroundColor(int i10) {
        this.f9428e = (long) i10;
    }

    public void startAutoRefresh() {
        this.f9440q = false;
        if (this.f9434k.g()) {
            this.f9434k.m();
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Resumed auto-refresh with remaining time: " + this.f9434k.b() + "ms");
            }
        } else if (t.a()) {
            this.logger.a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
        }
    }

    public void stopAutoRefresh() {
        if (this.f9438o != null) {
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Pausing auto-refresh with remaining time: " + this.f9434k.b() + "ms");
            }
            this.f9434k.j();
        } else if (this.f9444u || ((Boolean) this.sdk.a(qe.f10963a7)).booleanValue()) {
            this.f9440q = true;
        } else {
            t.j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MaxAdView{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9425b) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", isDestroyed=");
        sb2.append(a());
        sb2.append('}');
        return sb2.toString();
    }

    private void a(View view, ce ceVar) {
        int i10;
        int o02 = ceVar.o0();
        int m02 = ceVar.m0();
        int i11 = -1;
        if (o02 == -1) {
            i10 = -1;
        } else {
            i10 = AppLovinSdkUtils.dpToPx(view.getContext(), o02);
        }
        if (m02 != -1) {
            i11 = AppLovinSdkUtils.dpToPx(view.getContext(), m02);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(i10, i11);
        } else {
            layoutParams.width = i10;
            layoutParams.height = i11;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (t.a()) {
                this.logger.a(this.tag, "Pinning ad view to MAX ad view with width: " + i10 + " and height: " + i11 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int addRule : ar.a(this.f9425b.getGravity(), 10, 14)) {
                layoutParams2.addRule(addRule);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(ce ceVar) {
        View x10 = ceVar.x();
        String str = x10 == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f9425b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (t.a()) {
                this.logger.b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (t.a()) {
                t tVar = this.logger;
                String str2 = this.tag;
                tVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + ceVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) ceVar, (MaxError) maxErrorImpl, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, ceVar);
            return;
        }
        e();
        a(ceVar);
        if (ceVar.j0()) {
            this.f9436m.a((ie) ceVar);
        }
        maxAdView.setDescendantFocusability(393216);
        if (ceVar.l0() != Long.MAX_VALUE) {
            this.f9427d.setBackgroundColor((int) ceVar.l0());
        } else {
            long j10 = this.f9428e;
            if (j10 != Long.MAX_VALUE) {
                this.f9427d.setBackgroundColor((int) j10);
            } else {
                this.f9427d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(x10);
        a(x10, ceVar);
        this.sdk.v().d((Object) ceVar);
        c(ceVar);
        synchronized (this.f9437n) {
            this.f9438o = ceVar;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.S().processRawAdImpression(ceVar, this.f9432i);
        if (StringUtils.isValidString(this.f9438o.getAdReviewCreativeId())) {
            bc.a(this.adReviewListener, this.f9438o.getAdReviewCreativeId(), (MaxAd) this.f9438o, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new e(this, ceVar), ceVar.n0());
    }

    private void e() {
        ce ceVar;
        MaxAdView maxAdView;
        MaxAdView maxAdView2;
        Boolean bool = (Boolean) this.sdk.a(qe.P7);
        if (bool.booleanValue() && (maxAdView2 = this.f9425b) != null) {
            e0.a(maxAdView2, this.f9427d);
        }
        this.f9436m.b();
        synchronized (this.f9437n) {
            ceVar = this.f9438o;
        }
        if (ceVar != null) {
            this.sdk.S().destroyAd(ceVar);
        }
        if (!bool.booleanValue() && (maxAdView = this.f9425b) != null) {
            e0.a(maxAdView, this.f9427d);
        }
    }

    private void f() {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Rendering for cached ad: " + this.f9429f + "...");
        }
        this.f9432i.onAdLoaded(this.f9429f);
        this.f9429f = null;
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, MaxReward.DEFAULT_LABEL + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z10 = this.f9444u || ((Boolean) this.sdk.a(qe.f10963a7)).booleanValue();
        if (z10 && !this.f9434k.g() && this.f9434k.h()) {
            String str2 = this.tag;
            t.h(str2, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f9434k.b()) + " seconds.");
        } else if (!z10) {
            if (t.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, (a.C0126a) this.f9432i);
        } else if (this.f9429f != null) {
            if (t.a()) {
                this.logger.a(this.tag, "Rendering cached ad");
            }
            f();
        } else if (this.f9442s) {
            if (t.a()) {
                this.logger.a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f9441r = true;
        } else {
            if (t.a()) {
                this.logger.a(this.tag, "Loading ad...");
            }
            a(bVar, (a.C0126a) this.f9432i);
        }
    }

    private void d() {
        if (b()) {
            if (t.a()) {
                this.logger.a(this.tag, "Scheduling refresh precache request now");
            }
            this.f9442s = true;
            this.sdk.l0().a((xl) new kn(this.sdk, "loadMaxAdForPrecacheRequest", new c(this)), sm.b.MEDIATION);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (t.a()) {
            this.logger.a(this.tag, "Loading ad for pre-cache request...");
        }
        a(d.b.SEQUENTIAL_OR_PRECACHE, (a.C0126a) this.f9433j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ce ceVar) {
        long a10 = this.f9435l.a(ceVar);
        if (!ceVar.j0()) {
            a(ceVar, a10);
        }
        a(a10);
    }

    private void a(d.b bVar, a.C0126a aVar) {
        if (a()) {
            boolean c10 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAdView", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
            if (!c10) {
                t.h(this.tag, "Failed to load new ad - this instance is already destroyed");
                return;
            }
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
        AppLovinSdkUtils.runOnUiThread(true, new f(this, aVar, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a.C0126a aVar, d.b bVar) {
        ce ceVar = this.f9438o;
        if (ceVar != null) {
            long a10 = this.f9435l.a(ceVar);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f9438o.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(a10));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f9425b.getContext(), this.f9425b.getWidth());
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f9425b.getContext(), this.f9425b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f9434k.g() || this.f9440q));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f9445v));
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + aVar + "...");
        }
        this.sdk.S().loadAd(this.adUnitId, this.f9426c, this.adFormat, bVar, this.localExtraParameters, this.extraParameters, this.f9424a, aVar);
    }

    private boolean b() {
        if (this.f9446w) {
            return false;
        }
        return ((Boolean) this.sdk.a(qe.f10968f7)).booleanValue();
    }

    private void a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (t.a()) {
                t tVar = this.logger;
                String str3 = this.tag;
                tVar.a(str3, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f9444u = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (t.a()) {
                t tVar2 = this.logger;
                String str4 = this.tag;
                tVar2.a(str4, "Updated disable auto-retries to: " + str2);
            }
            this.f9445v = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (t.a()) {
                t tVar3 = this.logger;
                String str5 = this.tag;
                tVar3.a(str5, "Updated precached disabled to: " + str2);
            }
            this.f9446w = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (t.a()) {
                t tVar4 = this.logger;
                String str6 = this.tag;
                tVar4.a(str6, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f9447x = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (t.a()) {
                t tVar5 = this.logger;
                String str7 = this.tag;
                tVar5.a(str7, "Updated force precache to: " + str2);
            }
            this.f9448y = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (t.a()) {
                t tVar6 = this.logger;
                String str8 = this.tag;
                tVar6.a(str8, "Updated is adaptive banner to: " + str2);
            }
            this.f9449z = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (a()) {
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
            }
        } else if (this.sdk.c(qe.U6).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.L();
            if (t.a()) {
                t L = this.sdk.L();
                String str2 = this.tag;
                L.a(str2, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f9440q || this.f9434k.g()) {
            if (this.f9442s) {
                if (t.a()) {
                    this.logger.a(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                }
                this.f9442s = false;
            }
            if (this.f9441r) {
                if (t.a()) {
                    t tVar2 = this.logger;
                    String str3 = this.tag;
                    tVar2.a(str3, "Refresh pre-cache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
                }
                bc.a(this.adListener, this.adUnitId, maxError, true);
            }
        } else {
            this.f9439p = true;
            this.f9442s = false;
            long longValue = ((Long) this.sdk.a(qe.T6)).longValue();
            if (longValue >= 0) {
                this.sdk.L();
                if (t.a()) {
                    t L2 = this.sdk.L();
                    String str4 = this.tag;
                    L2.a(str4, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f9434k.a(longValue);
            }
        }
    }

    private void a(ce ceVar, long j10) {
        if (t.a()) {
            this.logger.a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.S().processViewabilityAdImpressionPostback(ceVar, j10, this.f9432i);
    }

    private void a(long j10) {
        if (!zp.a(j10, ((Long) this.sdk.a(qe.f10967e7)).longValue()) || this.f9448y) {
            if (t.a()) {
                this.logger.a(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f9439p = false;
            d();
            return;
        }
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Undesired flags matched - current: " + Long.toBinaryString(j10) + ", undesired: " + Long.toBinaryString(j10));
        }
        if (t.a()) {
            this.logger.a(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f9439p = true;
    }

    /* access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.f9442s = false;
        if (this.f9441r) {
            this.f9441r = false;
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f9432i.onAdLoaded(maxAd);
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Saving pre-cache ad...");
        }
        ce ceVar = (ce) maxAd;
        this.f9429f = ceVar;
        ceVar.g(this.f9430g);
        this.f9429f.f(this.f9431h);
    }

    /* access modifiers changed from: private */
    public boolean a() {
        boolean z10;
        synchronized (this.f9437n) {
            z10 = this.f9443t;
        }
        return z10;
    }
}
