package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.bc;
import com.applovin.impl.be;
import com.applovin.impl.de;
import com.applovin.impl.gf;
import com.applovin.impl.h8;
import com.applovin.impl.kn;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.impl.v;
import com.applovin.impl.xl;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class MaxFullscreenAdImpl extends a implements a.C0136a, v.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f9454a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f9455b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.mediation.b f9456c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Object f9457d = new Object();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public de f9458e = null;

    /* renamed from: f  reason: collision with root package name */
    private d f9459f = d.IDLE;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public de f9460g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f9461h = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f9462i = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    private boolean f9463j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f9464k;

    /* renamed from: l  reason: collision with root package name */
    private WeakReference f9465l = new WeakReference((Object) null);
    protected final c listenerWrapper;

    /* renamed from: m  reason: collision with root package name */
    private WeakReference f9466m = new WeakReference((Object) null);

    /* renamed from: n  reason: collision with root package name */
    private WeakReference f9467n = new WeakReference((Object) null);

    public interface b {
        Activity getActivity();
    }

    private class c implements MaxAdListener, MaxRewardedAdListener, MaxAdRevenueListener, a.C0126a {
        private c() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, de deVar, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (z10 || !deVar.r0() || !MaxFullscreenAdImpl.this.sdk.M().d(MaxFullscreenAdImpl.this.adUnitId)) {
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    t tVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                return;
            }
            AppLovinSdkUtils.runOnUiThread(true, new q(this));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f9464k) {
                MaxFullscreenAdImpl.this.e();
                return;
            }
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdClicked(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            boolean b10 = MaxFullscreenAdImpl.this.f9464k;
            boolean unused = MaxFullscreenAdImpl.this.f9464k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, (e) new o(this, maxAd, b10, (de) maxAd, maxError));
        }

        public void onAdDisplayed(MaxAd maxAd) {
            de deVar = (de) maxAd;
            de unused = MaxFullscreenAdImpl.this.f9460g = deVar;
            boolean unused2 = MaxFullscreenAdImpl.this.f9464k = false;
            MaxFullscreenAdImpl.this.sdk.f().a((h8) deVar);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onAdHidden(MaxAd maxAd) {
            boolean unused = MaxFullscreenAdImpl.this.f9464k = false;
            MaxFullscreenAdImpl.this.a(d.IDLE, (e) new n(this, maxAd));
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(d.IDLE, (e) new p(this, str, maxError));
        }

        public void onAdLoaded(MaxAd maxAd) {
            de d10;
            synchronized (MaxFullscreenAdImpl.this.f9457d) {
                d10 = MaxFullscreenAdImpl.this.f9458e;
            }
            MaxFullscreenAdImpl.this.sdk.E().a(MaxFullscreenAdImpl.this.adUnitId);
            MaxFullscreenAdImpl.this.a((de) maxAd);
            if (MaxFullscreenAdImpl.this.f9461h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
                if (MaxFullscreenAdImpl.this.f9462i.compareAndSet(true, false)) {
                    MaxFullscreenAdImpl.this.e();
                }
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    t tVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    tVar2.a(str, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + d10 + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
                }
                bc.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) d10, maxAd, true);
                return;
            }
            MaxFullscreenAdImpl.this.a(d.READY, (e) new m(this, maxAd));
        }

        public void onAdRequestStarted(String str) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                tVar2.a(str2, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            bc.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            bc.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxRewardedAdListener.onRewardedVideoCompleted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.g(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxRewardedAdListener.onRewardedVideoStarted(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.h(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }

        /* synthetic */ c(MaxFullscreenAdImpl maxFullscreenAdImpl, a aVar) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str2 = maxFullscreenAdImpl.tag;
                tVar2.a(str2, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            t tVar = MaxFullscreenAdImpl.this.logger;
            if (t.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                t tVar2 = maxFullscreenAdImpl.logger;
                String str = maxFullscreenAdImpl.tag;
                tVar2.a(str, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            bc.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a() {
            boolean unused = MaxFullscreenAdImpl.this.f9464k = true;
            MaxFullscreenAdImpl.this.loadAd();
        }
    }

    public enum d {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    private interface e {
        void a();

        void a(MaxError maxError);
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, b bVar, String str2, k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f9454a = bVar;
        this.listenerWrapper = new c(this, (a) null);
        this.f9456c = new com.applovin.impl.mediation.b(kVar);
        this.f9455b = new WeakReference(context);
        kVar.h().a((v.b) this);
        t.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    public void destroy() {
        a(d.DESTROYED, (e) new g(this));
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f9457d) {
            de deVar = this.f9458e;
            z10 = deVar != null && deVar.Z() && this.f9459f == d.READY;
        }
        if (!z10) {
            this.sdk.E().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(d.b.PUBLISHER_INITIATED);
    }

    public void onAdExpired(h8 h8Var) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Ad expired " + getAdUnitId());
        }
        this.f9461h.set(true);
        b bVar = this.f9454a;
        Activity activity = bVar != null ? bVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            d();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.S().loadAd(this.adUnitId, (String) null, this.adFormat, d.b.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    public void onCreativeIdGenerated(String str, String str2) {
        de deVar = this.f9458e;
        if (deVar != null && deVar.Q().equalsIgnoreCase(str)) {
            this.f9458e.h(str2);
            bc.b(this.adReviewListener, str2, (MaxAd) this.f9458e);
        }
    }

    public void showAd(String str, String str2, Activity activity) {
        List b10 = this.sdk.n0().b();
        if (!this.sdk.n0().d() || b10 == null || b10.contains(this.f9458e.c())) {
            if (activity == null) {
                activity = this.sdk.p0();
            }
            if (a(activity, str)) {
                a(d.SHOWING, (e) new j(this, str, str2, activity));
                return;
            }
            return;
        }
        String str3 = "Attempting to show ad from <" + this.f9458e.c() + "> which is not in the list of selected ad networks " + b10;
        t.h(this.tag, str3);
        a(d.IDLE, (e) new h(this, str3));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f9454a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void a(de deVar) {
        if (this.sdk.f().a(deVar, this)) {
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "Handle ad loaded for regular ad: " + deVar);
            }
            this.f9458e = deVar;
            return;
        }
        if (t.a()) {
            this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
        }
        onAdExpired(deVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        if (this.f9462i.compareAndSet(true, false)) {
            t.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.E().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            gf gfVar = new gf(this.adUnitId, this.adFormat, this.f9458e.getPlacement());
            if (t.a()) {
                t tVar = this.logger;
                String str = this.tag;
                tVar.a(str, "MaxAdListener.onAdDisplayFailed(ad=" + gfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
            if (this.f9458e != null) {
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9458e);
            }
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        de deVar;
        if (this.f9461h.compareAndSet(true, false)) {
            synchronized (this.f9457d) {
                deVar = this.f9458e;
                this.f9458e = null;
            }
            this.sdk.S().destroyAd(deVar);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* access modifiers changed from: private */
    public void e() {
        Activity activity = (Activity) this.f9465l.get();
        if (activity == null) {
            activity = this.sdk.p0();
        }
        Activity activity2 = activity;
        if (this.f9463j) {
            showAd(this.f9458e.getPlacement(), this.f9458e.e(), (ViewGroup) this.f9466m.get(), (i) this.f9467n.get(), activity2);
            return;
        }
        showAd(this.f9458e.getPlacement(), this.f9458e.e(), activity2);
    }

    public void loadAd(d.b bVar) {
        if (t.a()) {
            t tVar = this.logger;
            String str = this.tag;
            tVar.a(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f9459f == d.DESTROYED) {
            boolean c10 = zp.c(this.sdk);
            this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToLoadDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
            if (c10) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (isReady()) {
            if (t.a()) {
                t tVar2 = this.logger;
                String str2 = this.tag;
                tVar2.a(str2, "An ad is already loaded for '" + this.adUnitId + "'");
            }
            if (t.a()) {
                t tVar3 = this.logger;
                String str3 = this.tag;
                tVar3.a(str3, "MaxAdListener.onAdLoaded(ad=" + this.f9458e + "), listener=" + this.adListener);
            }
            bc.f(this.adListener, (MaxAd) this.f9458e, true);
            return;
        }
        b bVar2 = this.f9454a;
        a(d.LOADING, (e) new a(bVar2 != null ? bVar2.getActivity() : null, (Context) this.f9455b.get(), bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.f9457d) {
            if (this.f9458e != null) {
                if (t.a()) {
                    t tVar = this.logger;
                    String str = this.tag;
                    tVar.a(str, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f9458e + "...");
                }
                this.sdk.S().destroyAd(this.f9458e);
            }
        }
        this.sdk.h().b((v.b) this);
        this.f9456c.a();
        super.destroy();
    }

    class a implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f9468a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f9469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d.b f9470c;

        a(Activity activity, Context context, d.b bVar) {
            this.f9468a = activity;
            this.f9469b = context;
            this.f9470c = bVar;
        }

        public void a() {
            Context context = this.f9468a;
            if (context == null && (context = this.f9469b) == null) {
                if (MaxFullscreenAdImpl.this.sdk.p0() != null) {
                    context = MaxFullscreenAdImpl.this.sdk.p0();
                } else {
                    context = k.k();
                }
            }
            Context context2 = context;
            MediationServiceImpl S = MaxFullscreenAdImpl.this.sdk.S();
            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
            S.loadAd(maxFullscreenAdImpl.adUnitId, (String) null, maxFullscreenAdImpl.adFormat, this.f9470c, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
        }

        public void a(MaxError maxError) {
            if (((Boolean) MaxFullscreenAdImpl.this.sdk.a(qe.L7)).booleanValue()) {
                t tVar = MaxFullscreenAdImpl.this.logger;
                if (t.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    t tVar2 = maxFullscreenAdImpl.logger;
                    String str = maxFullscreenAdImpl.tag;
                    tVar2.a(str, "MaxAdListener.onAdLoadFailed(adUnitId=" + MaxFullscreenAdImpl.this.adUnitId + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                bc.a(maxFullscreenAdImpl2.adListener, maxFullscreenAdImpl2.adUnitId, maxError, true);
            }
        }
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar, Activity activity) {
        if (viewGroup == null || iVar == null) {
            t.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
            if (t.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9458e + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            bc.a(this.adListener, (MaxAd) this.f9458e, (MaxError) maxErrorImpl, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9458e);
        } else if (viewGroup.isShown() || !((Boolean) this.sdk.a(qe.B7)).booleanValue()) {
            List b10 = this.sdk.n0().b();
            if (!this.sdk.n0().d() || b10 == null || b10.contains(this.f9458e.c())) {
                if (activity == null) {
                    activity = this.sdk.p0();
                }
                Activity activity2 = activity;
                if (a(activity2, str)) {
                    a(d.SHOWING, (e) new k(this, str, str2, activity2, viewGroup, iVar));
                    return;
                }
                return;
            }
            String str3 = "Attempting to show ad from <" + this.f9458e.c() + "> which is not in the list of selected ad networks " + b10;
            t.h(this.tag, str3);
            a(d.IDLE, (e) new i(this, str3));
        } else {
            t.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
            MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
            bc.a(this.adListener, (MaxAd) this.f9458e, (MaxError) maxErrorImpl2, true);
            this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9458e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        de deVar = this.f9458e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            tVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + deVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        de deVar = this.f9458e;
        a((MaxAd) deVar);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (t.a()) {
            t tVar = this.logger;
            String str2 = this.tag;
            tVar.a(str2, "MaxAdListener.onAdDisplayFailed(ad=" + deVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        bc.a(this.adListener, (MaxAd) deVar, (MaxError) maxErrorImpl, true);
        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, deVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f9463j = false;
        this.f9465l = new WeakReference(activity);
        this.sdk.S().showFullscreenAd(this.f9458e, activity, this.listenerWrapper);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, i iVar) {
        a(str, str2);
        this.f9463j = true;
        this.f9465l = new WeakReference(activity);
        this.f9466m = new WeakReference(viewGroup);
        this.f9467n = new WeakReference(iVar);
        this.sdk.S().showFullscreenAd(this.f9458e, viewGroup, iVar, activity, this.listenerWrapper);
    }

    private boolean a(Activity activity, String str) {
        if (activity != null || MaxAdFormat.APP_OPEN == this.adFormat) {
            if (this.f9459f == d.DESTROYED) {
                boolean c10 = zp.c(this.sdk);
                this.sdk.B().a(o.b.INTEGRATION_ERROR, "attemptingToShowDestroyedAd", (Map) CollectionUtils.hashMap("details", "debug=" + c10));
                if (c10) {
                    throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
                }
            }
            if (!isReady()) {
                String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
                t.h(this.tag, str2);
                MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
                gf gfVar = new gf(this.adUnitId, this.adFormat, str);
                if (t.a()) {
                    this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + gfVar + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
                }
                bc.a(this.adListener, (MaxAd) gfVar, (MaxError) maxErrorImpl, true);
                if (this.f9458e != null) {
                    this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f9458e);
                }
                return false;
            }
            Long l10 = (Long) this.sdk.a(qe.f10977o7);
            Long l11 = (Long) this.sdk.a(qe.f10970h7);
            if (l10.longValue() <= 0 || (this.f9458e.getTimeToLiveMillis() >= l11.longValue() && !this.f9461h.get())) {
                if (zp.a(k.k()) != 0 && this.sdk.g0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                    if (zp.c(this.sdk)) {
                        throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    } else if (((Boolean) this.sdk.a(qe.A7)).booleanValue()) {
                        t.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                        MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                        if (t.a()) {
                            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9458e + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                        }
                        bc.a(this.adListener, (MaxAd) this.f9458e, (MaxError) maxErrorImpl2, true);
                        this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f9458e);
                        return false;
                    }
                }
                if (this.sdk.E().d() || this.sdk.E().c()) {
                    t.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                    if (((Boolean) this.sdk.a(qe.K7)).booleanValue()) {
                        if (this.f9460g != null) {
                            HashMap<String, String> hashMap = CollectionUtils.hashMap("source", this.tag);
                            hashMap.put("adapter_version", this.f9460g.y());
                            hashMap.put("error_message", "Attempting to show ad when another fullscreen ad is already showing");
                            this.sdk.B().a(o.b.DISPLAY_ERROR, (Object) this.f9460g, (Map) hashMap, 0);
                        } else if (t.a()) {
                            this.logger.a(this.tag, "Unable to submit error report for previously displayed ad because it doesn't exist");
                        }
                    }
                    MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
                    if (t.a()) {
                        this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9458e + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
                    }
                    bc.a(this.adListener, (MaxAd) this.f9458e, (MaxError) maxErrorImpl3, true);
                    this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f9458e);
                    return false;
                }
                String str3 = this.sdk.g0().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
                if (((!StringUtils.isValidString(str3) || !Boolean.valueOf(str3).booleanValue()) && !((Boolean) this.sdk.a(qe.f10969g7)).booleanValue()) || activity == null || !activity.isFinishing()) {
                    return true;
                }
                t.h(this.tag, "Attempting to show ad when activity is finishing");
                MaxErrorImpl maxErrorImpl4 = new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing");
                if (t.a()) {
                    this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f9458e + ", error=" + maxErrorImpl4 + "), listener=" + this.adListener);
                }
                bc.a(this.adListener, (MaxAd) this.f9458e, (MaxError) maxErrorImpl4, true);
                this.sdk.S().processAdDisplayErrorPostbackForUserError(maxErrorImpl4, this.f9458e);
                return false;
            }
            this.f9462i.set(true);
            this.sdk.l0().a((xl) new kn(this.sdk, "handleShowOnLoadTimeoutError", new l(this)), sm.b.TIMEOUT, l10.longValue());
            return false;
        }
        throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
    }

    private void a(String str, String str2) {
        this.f9456c.e(this.f9458e);
        this.f9458e.g(str);
        this.f9458e.f(str2);
        this.sdk.v().d((Object) this.f9458e);
        if (t.a()) {
            t tVar = this.logger;
            String str3 = this.tag;
            tVar.a(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f9458e + "...");
        }
        a(this.f9458e);
    }

    private void a() {
        de deVar;
        synchronized (this.f9457d) {
            deVar = this.f9458e;
            this.f9458e = null;
        }
        this.sdk.S().destroyAd(deVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d r8, com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.e r9) {
        /*
            r7 = this;
            com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl
            r1 = -1
            r0.<init>((int) r1)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = r7.f9459f
            java.lang.Object r2 = r7.f9457d
            monitor-enter(r2)
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r3 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.IDLE     // Catch:{ all -> 0x01df }
            if (r1 != r3) goto L_0x0048
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.LOADING     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x0015
            goto L_0x012c
        L_0x0015:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x001b
            goto L_0x012c
        L_0x001b:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x0028
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "No ad is loading or loaded"
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0028:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r4.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Unable to transition to: "
            r4.append(r5)     // Catch:{ all -> 0x01df }
            r4.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01df }
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0048:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r4 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.LOADING     // Catch:{ all -> 0x01df }
            if (r1 != r4) goto L_0x009f
            if (r8 != r3) goto L_0x0050
            goto L_0x012c
        L_0x0050:
            if (r8 != r4) goto L_0x0066
            com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl     // Catch:{ all -> 0x01df }
            r1 = -26
            java.lang.String r3 = "An ad is already loading"
            r0.<init>(r1, r3)     // Catch:{ all -> 0x01df }
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0066:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x006c
            goto L_0x012c
        L_0x006c:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x0079
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "An ad is not ready to be shown yet"
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0079:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x007f
            goto L_0x012c
        L_0x007f:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r4.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Unable to transition to: "
            r4.append(r5)     // Catch:{ all -> 0x01df }
            r4.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01df }
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x009f:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r5 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.READY     // Catch:{ all -> 0x01df }
            if (r1 != r5) goto L_0x00ef
            if (r8 != r3) goto L_0x00a7
            goto L_0x012c
        L_0x00a7:
            if (r8 != r4) goto L_0x00b2
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "An ad is already loaded"
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x00b2:
            if (r8 != r5) goto L_0x00c5
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r4 = "An ad is already marked as ready"
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x00c5:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x00ca
            goto L_0x012c
        L_0x00ca:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x00cf
            goto L_0x012c
        L_0x00cf:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r4.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Unable to transition to: "
            r4.append(r5)     // Catch:{ all -> 0x01df }
            r4.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01df }
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x00ef:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r6 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.SHOWING     // Catch:{ all -> 0x01df }
            if (r1 != r6) goto L_0x014d
            if (r8 != r3) goto L_0x00f6
            goto L_0x012c
        L_0x00f6:
            if (r8 != r4) goto L_0x010c
            com.applovin.impl.mediation.MaxErrorImpl r0 = new com.applovin.impl.mediation.MaxErrorImpl     // Catch:{ all -> 0x01df }
            r1 = -27
            java.lang.String r3 = "Can not load another ad while the ad is showing"
            r0.<init>(r1, r3)     // Catch:{ all -> 0x01df }
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x01df }
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x010c:
            if (r8 != r5) goto L_0x011e
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r4 = "An ad is already showing, ignoring"
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x011e:
            if (r8 != r6) goto L_0x0128
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "The ad is already showing, not showing another one"
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0128:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r1 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED     // Catch:{ all -> 0x01df }
            if (r8 != r1) goto L_0x012e
        L_0x012c:
            r1 = 1
            goto L_0x017a
        L_0x012e:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r4.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Unable to transition to: "
            r4.append(r5)     // Catch:{ all -> 0x01df }
            r4.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01df }
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x014d:
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r3 = com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.d.DESTROYED     // Catch:{ all -> 0x01df }
            if (r1 != r3) goto L_0x0159
            java.lang.String r1 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.String r3 = "No operations are allowed on a destroyed instance"
            com.applovin.impl.sdk.t.h(r1, r3)     // Catch:{ all -> 0x01df }
            goto L_0x0179
        L_0x0159:
            boolean r1 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x0179
            com.applovin.impl.sdk.t r1 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r3 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r4.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r5 = "Unknown state: "
            r4.append(r5)     // Catch:{ all -> 0x01df }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r5 = r7.f9459f     // Catch:{ all -> 0x01df }
            r4.append(r5)     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01df }
            r1.b(r3, r4)     // Catch:{ all -> 0x01df }
        L_0x0179:
            r1 = 0
        L_0x017a:
            if (r1 == 0) goto L_0x01ac
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r3 == 0) goto L_0x01a9
            com.applovin.impl.sdk.t r3 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r5.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r6 = "Transitioning from "
            r5.append(r6)     // Catch:{ all -> 0x01df }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r6 = r7.f9459f     // Catch:{ all -> 0x01df }
            r5.append(r6)     // Catch:{ all -> 0x01df }
            java.lang.String r6 = " to "
            r5.append(r6)     // Catch:{ all -> 0x01df }
            r5.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r6 = "..."
            r5.append(r6)     // Catch:{ all -> 0x01df }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01df }
            r3.a((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01df }
        L_0x01a9:
            r7.f9459f = r8     // Catch:{ all -> 0x01df }
            goto L_0x01d4
        L_0x01ac:
            boolean r3 = com.applovin.impl.sdk.t.a()     // Catch:{ all -> 0x01df }
            if (r3 == 0) goto L_0x01d4
            com.applovin.impl.sdk.t r3 = r7.logger     // Catch:{ all -> 0x01df }
            java.lang.String r4 = r7.tag     // Catch:{ all -> 0x01df }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01df }
            r5.<init>()     // Catch:{ all -> 0x01df }
            java.lang.String r6 = "Not allowed to transition from "
            r5.append(r6)     // Catch:{ all -> 0x01df }
            com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d r6 = r7.f9459f     // Catch:{ all -> 0x01df }
            r5.append(r6)     // Catch:{ all -> 0x01df }
            java.lang.String r6 = " to "
            r5.append(r6)     // Catch:{ all -> 0x01df }
            r5.append(r8)     // Catch:{ all -> 0x01df }
            java.lang.String r8 = r5.toString()     // Catch:{ all -> 0x01df }
            r3.k(r4, r8)     // Catch:{ all -> 0x01df }
        L_0x01d4:
            monitor-exit(r2)     // Catch:{ all -> 0x01df }
            if (r1 == 0) goto L_0x01db
            r9.a()
            goto L_0x01de
        L_0x01db:
            r9.a(r0)
        L_0x01de:
            return
        L_0x01df:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01df }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.a(com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d, com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$e):void");
    }

    /* access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((h8) (de) maxAd);
        this.f9456c.a();
        a();
        this.sdk.V().a((be) maxAd);
    }
}
