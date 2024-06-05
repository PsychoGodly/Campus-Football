package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.bc;
import com.applovin.impl.ee;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.x3;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class MaxNativeAdLoaderImpl extends a implements a.C0136a, v.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f9479a = new c(this, (a) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f9480b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f9481c;

    /* renamed from: d  reason: collision with root package name */
    private d.b f9482d = d.b.PUBLISHER_INITIATED;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Object f9483e = new Object();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public MaxNativeAdListener f9484f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f9485g = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final Set f9486h = new HashSet();

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f9487a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f9488b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f9489c;

        a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f9487a = maxNativeAd;
            this.f9488b = list;
            this.f9489c = viewGroup;
        }

        public void run() {
            if (!this.f9487a.prepareForInteraction(this.f9488b, this.f9489c)) {
                t.h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f9491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ee f9492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f9493c;

        b(MaxNativeAdView maxNativeAdView, ee eeVar, MaxNativeAd maxNativeAd) {
            this.f9491a = maxNativeAdView;
            this.f9492b = eeVar;
            this.f9493c = maxNativeAd;
        }

        public void run() {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                t tVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                tVar2.a(str, "Rendering native ad view: " + this.f9491a);
            }
            this.f9491a.render(this.f9492b, MaxNativeAdLoaderImpl.this.f9479a, MaxNativeAdLoaderImpl.this.sdk);
            this.f9493c.setNativeAdView(this.f9491a);
            if (!this.f9493c.prepareForInteraction(this.f9491a.getClickableViews(), this.f9491a)) {
                this.f9493c.prepareViewForInteraction(this.f9491a);
            }
        }
    }

    private class c implements a.C0126a {
        private c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            ee eeVar = (ee) maxAd;
            eeVar.g(MaxNativeAdLoaderImpl.this.f9480b);
            eeVar.f(MaxNativeAdLoaderImpl.this.f9481c);
            MaxNativeAdLoaderImpl.this.sdk.v().d((Object) eeVar);
            synchronized (MaxNativeAdLoaderImpl.this.f9483e) {
                MaxNativeAdLoaderImpl.this.f9486h.add(eeVar);
            }
            MaxNativeAdView a10 = MaxNativeAdLoaderImpl.this.a(eeVar.L());
            if (a10 == null) {
                t tVar2 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.a(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                }
                String o02 = eeVar.o0();
                if (StringUtils.isValidString(o02)) {
                    t tVar3 = MaxNativeAdLoaderImpl.this.logger;
                    if (t.a()) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                        t tVar4 = maxNativeAdLoaderImpl3.logger;
                        String str = maxNativeAdLoaderImpl3.tag;
                        tVar4.a(str, "Using template: " + o02 + "...");
                    }
                    a10 = new MaxNativeAdView(o02, k.k());
                }
            }
            if (a10 == null) {
                t tVar5 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl4.logger.a(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                t tVar6 = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl5 = MaxNativeAdLoaderImpl.this;
                    t tVar7 = maxNativeAdLoaderImpl5.logger;
                    String str2 = maxNativeAdLoaderImpl5.tag;
                    tVar7.a(str2, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9484f);
                }
                bc.a(MaxNativeAdLoaderImpl.this.f9484f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.a(eeVar);
                return;
            }
            a(a10);
            MaxNativeAdLoaderImpl.this.a(a10, eeVar, eeVar.getNativeAd());
            t tVar8 = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl6 = MaxNativeAdLoaderImpl.this;
                t tVar9 = maxNativeAdLoaderImpl6.logger;
                String str3 = maxNativeAdLoaderImpl6.tag;
                tVar9.a(str3, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + a10 + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9484f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9484f, a10, maxAd, true);
            MaxNativeAdLoaderImpl.this.a(eeVar);
            MaxNativeAdLoaderImpl.this.a(a10);
        }

        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                t tVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                tVar2.a(str, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f9484f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9484f, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdView unused = MaxNativeAdLoaderImpl.this.a(((MaxErrorImpl) maxError).getLoadTag());
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                t tVar2 = maxNativeAdLoaderImpl.logger;
                String str2 = maxNativeAdLoaderImpl.tag;
                tVar2.a(str2, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f9484f);
            }
            bc.a(MaxNativeAdLoaderImpl.this.f9484f, str, maxError, true);
        }

        public void onAdLoaded(MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new s(this, maxAd));
        }

        public void onAdRequestStarted(String str) {
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxNativeAdLoaderImpl.this.logger;
            if (t.a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                t tVar2 = maxNativeAdLoaderImpl.logger;
                String str = maxNativeAdLoaderImpl.tag;
                tVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            bc.a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }

        /* synthetic */ c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, a aVar) {
            this();
        }

        private void a(MaxNativeAdView maxNativeAdView) {
            ee b10;
            b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker != null && (b10 = adViewTracker.b()) != null) {
                t tVar = MaxNativeAdLoaderImpl.this.logger;
                if (t.a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl.logger.a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
                }
                MaxNativeAdLoaderImpl.this.destroy(b10);
            }
        }
    }

    public MaxNativeAdLoaderImpl(String str, k kVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", kVar);
        kVar.h().a((v.b) this);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            tVar.a(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    public void destroy() {
        this.f9484f = null;
        this.sdk.h().b((v.b) this);
        synchronized (this.f9483e) {
            this.f9485g.clear();
            this.f9486h.clear();
        }
        super.destroy();
    }

    public String getPlacement() {
        return this.f9480b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((ee) maxAd).getNativeAd();
        if (nativeAd != null) {
            b adViewTracker = nativeAd.getAdViewTracker();
            if (adViewTracker != null) {
                adViewTracker.c();
            } else if (t.a()) {
                this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
            }
        } else if (t.a()) {
            this.logger.b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f9479a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        a(lowerCase, maxNativeAdView);
        this.sdk.S().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f9482d, this.localExtraParameters, this.extraParameters, k.k(), this.f9479a);
    }

    public void onAdExpired(h8 h8Var) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (t.a()) {
            t tVar2 = this.logger;
            String str2 = this.tag;
            tVar2.a(str2, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + h8Var + "), listener=" + this.f9484f);
        }
        bc.b(this.f9484f, (MaxAd) (ee) h8Var, true);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        ee eeVar;
        Iterator it = this.f9486h.iterator();
        while (true) {
            if (!it.hasNext()) {
                eeVar = null;
                break;
            }
            eeVar = (ee) it.next();
            if (eeVar.Q().equalsIgnoreCase(str)) {
                break;
            }
        }
        if (eeVar != null) {
            eeVar.h(str2);
            bc.b(this.adReviewListener, str2, (MaxAd) eeVar);
            synchronized (this.f9483e) {
                this.f9486h.remove(eeVar);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        ee eeVar = (ee) maxAd;
        MaxNativeAd nativeAd = eeVar.getNativeAd();
        if (nativeAd != null) {
            eeVar.a(viewGroup);
            this.sdk.v().d((Object) eeVar);
            a(eeVar);
            nativeAd.setClickableViews(list);
            nativeAd.setAdViewTracker(new b(eeVar, viewGroup, this.f9479a, this.sdk));
            a aVar = new a(nativeAd, list, viewGroup);
            if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
                AppLovinSdkUtils.runOnUiThread(aVar);
            } else {
                this.sdk.l0().a((xl) new kn(this.sdk, "renderMaxNativeAd", aVar), sm.b.MEDIATION);
            }
        } else if (t.a()) {
            this.logger.b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof ee)) {
            t.h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            t.h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            ee eeVar = (ee) maxAd;
            MaxNativeAd nativeAd = eeVar.getNativeAd();
            if (nativeAd == null) {
                if (t.a()) {
                    this.logger.b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                }
                return false;
            } else if (!nativeAd.isExpired() || ((Boolean) this.sdk.a(qe.f10975m7)).booleanValue()) {
                a(maxNativeAdView, eeVar, nativeAd);
                a(maxNativeAdView);
                return true;
            } else {
                t.h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
                return false;
            }
        }
    }

    public void setCustomData(String str) {
        zp.b(str, this.tag);
        this.f9481c = str;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof d.b)) {
            this.f9482d = (d.b) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f9484f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f9480b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + '\'' + ", nativeAdListener=" + this.f9484f + ", revenueListener=" + this.revenueListener + '}';
    }

    /* access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView, ee eeVar, MaxNativeAd maxNativeAd) {
        eeVar.a(maxNativeAdView);
        a(eeVar);
        b bVar = new b(maxNativeAdView, eeVar, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            this.sdk.l0().a((xl) new kn(this.sdk, "renderMaxNativeAd", bVar), sm.b.MEDIATION);
        }
    }

    /* access modifiers changed from: private */
    public void a(ee eeVar) {
        if (!eeVar.n0().get()) {
            this.sdk.f().a(eeVar, this);
        }
    }

    public void destroy(MaxAd maxAd) {
        b adViewTracker;
        if (maxAd instanceof ee) {
            ee eeVar = (ee) maxAd;
            if (!eeVar.r0()) {
                synchronized (this.f9483e) {
                    this.f9486h.remove(eeVar);
                }
                MaxNativeAdView l02 = eeVar.l0();
                if (!(l02 == null || (adViewTracker = l02.getAdViewTracker()) == null || !maxAd.equals(adViewTracker.b()))) {
                    l02.recycle();
                }
                MaxNativeAd nativeAd = eeVar.getNativeAd();
                if (!(nativeAd == null || nativeAd.getAdViewTracker() == null)) {
                    nativeAd.getAdViewTracker().a();
                }
                this.sdk.f().a((h8) eeVar);
                this.sdk.S().destroyAd(eeVar);
                this.sdk.M().c(this.adUnitId, eeVar.L());
            } else if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Native ad (" + eeVar + ") has already been destroyed");
            }
        } else if (t.a()) {
            t tVar2 = this.logger;
            String str2 = this.tag;
            tVar2.a(str2, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    private void a(String str, MaxNativeAdView maxNativeAdView) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f9483e) {
                this.f9485g.put(str, maxNativeAdView);
            }
        }
    }

    /* access modifiers changed from: private */
    public MaxNativeAdView a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f9483e) {
            maxNativeAdView = (MaxNativeAdView) this.f9485g.remove(str);
        }
        return maxNativeAdView;
    }

    /* access modifiers changed from: private */
    public void a(MaxNativeAdView maxNativeAdView) {
        b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null) {
            return;
        }
        if (x3.e()) {
            if (maxNativeAdView.isAttachedToWindow()) {
                adViewTracker.c();
            }
        } else if (maxNativeAdView.getParent() != null) {
            adViewTracker.c();
        }
    }
}
