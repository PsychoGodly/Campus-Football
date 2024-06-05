package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class fb {

    /* renamed from: a  reason: collision with root package name */
    public final Map f7704a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b  reason: collision with root package name */
    protected final k f7705b;

    /* renamed from: c  reason: collision with root package name */
    protected final AppLovinAdServiceImpl f7706c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public AppLovinAd f7707d;

    /* renamed from: e  reason: collision with root package name */
    private String f7708e;

    /* renamed from: f  reason: collision with root package name */
    private SoftReference f7709f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f7710g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private volatile String f7711h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f7712i = false;

    class a implements AppLovinAdRewardListener {
        a() {
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.f7705b.L();
            if (t.a()) {
                t L = fb.this.f7705b.L();
                L.b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.f7705b.L();
            if (t.a()) {
                t L = fb.this.f7705b.L();
                L.b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.f7705b.L();
            if (t.a()) {
                t L = fb.this.f7705b.L();
                L.a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            fb.this.f7705b.L();
            if (t.a()) {
                t L = fb.this.f7705b.L();
                L.b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    public fb(String str, AppLovinSdk appLovinSdk) {
        this.f7705b = appLovinSdk.a();
        this.f7706c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f7708e = str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f7709f;
        if (softReference != null && (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    public String c() {
        return this.f7708e;
    }

    public boolean d() {
        return this.f7707d != null;
    }

    private class b implements AppLovinAdLoadListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinAdLoadListener f7714a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f7714a = appLovinAdLoadListener;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f7714a.adReceived(appLovinAd);
            } catch (Throwable th) {
                t.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                fb.this.f7705b.B().a("IncentivizedAdController", "adLoaded", th);
            }
        }

        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinAd unused = fb.this.f7707d = appLovinAd;
            if (this.f7714a != null) {
                AppLovinSdkUtils.runOnUiThread(new zw(this, appLovinAd));
            }
        }

        public void failedToReceiveAd(int i10) {
            if (this.f7714a != null) {
                AppLovinSdkUtils.runOnUiThread(new yw(this, i10));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f7714a.failedToReceiveAd(i10);
            } catch (Throwable th) {
                t.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                fb.this.f7705b.B().a("IncentivizedAdController", "adLoadFailed", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f7710g) {
            str = this.f7711h;
        }
        return str;
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, lb lbVar) {
        this.f7705b.F().c(aa.f6353o);
        bc.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        bc.a((AppLovinAdDisplayListener) lbVar, str);
    }

    private class c implements lb, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final AppLovinAd f7716a;

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdDisplayListener f7717b;

        /* renamed from: c  reason: collision with root package name */
        private final AppLovinAdClickListener f7718c;

        /* renamed from: d  reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f7719d;

        /* renamed from: f  reason: collision with root package name */
        private final AppLovinAdRewardListener f7720f;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f7716a = appLovinAd;
            this.f7717b = appLovinAdDisplayListener;
            this.f7718c = appLovinAdClickListener;
            this.f7719d = appLovinAdVideoPlaybackListener;
            this.f7720f = appLovinAdRewardListener;
        }

        private void a(com.applovin.impl.sdk.ad.b bVar) {
            String str;
            int i10;
            fb.this.f7705b.L();
            if (t.a()) {
                fb.this.f7705b.L().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String a10 = fb.this.b();
            if (!StringUtils.isValidString(a10) || !fb.this.f7712i) {
                fb.this.f7705b.L();
                if (t.a()) {
                    t L = fb.this.f7705b.L();
                    L.b("IncentivizedAdController", "Invalid reward state - result: " + a10 + " and wasFullyEngaged: " + fb.this.f7712i);
                }
                fb.this.f7705b.L();
                if (t.a()) {
                    fb.this.f7705b.L().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.b();
                if (fb.this.f7712i) {
                    fb.this.f7705b.L();
                    if (t.a()) {
                        fb.this.f7705b.L().b("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    fb.this.f7705b.L();
                    if (t.a()) {
                        fb.this.f7705b.L().b("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                bVar.a(ch.a(str));
                fb.this.f7705b.L();
                if (t.a()) {
                    fb.this.f7705b.L().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                bc.a(this.f7720f, (AppLovinAd) bVar, i10);
            }
            if (!bVar.D0().getAndSet(true)) {
                fb.this.f7705b.L();
                if (t.a()) {
                    fb.this.f7705b.L().a("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                fb.this.f7705b.l0().a((xl) new fn(bVar, fb.this.f7705b), sm.b.OTHER);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            bc.a(this.f7718c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            bc.a(this.f7717b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd e10 = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).e() : appLovinAd;
            if (e10 instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) e10);
            } else {
                if (e10 == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + e10;
                }
                fb.this.f7705b.L();
                if (t.a()) {
                    fb.this.f7705b.L().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            fb.this.a(e10);
            fb.this.f7705b.L();
            if (t.a()) {
                fb.this.f7705b.L().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            bc.b(this.f7717b, appLovinAd);
        }

        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAd = this.f7716a;
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAd = ((com.applovin.impl.sdk.ad.c) appLovinAd).e();
            }
            boolean z10 = this.f7717b instanceof lb;
            if (appLovinAd instanceof com.applovin.impl.sdk.ad.b) {
                a((com.applovin.impl.sdk.ad.b) appLovinAd);
            } else {
                if (appLovinAd == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAd;
                }
                fb.this.f7705b.L();
                if (t.a()) {
                    t L = fb.this.f7705b.L();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received `");
                    sb2.append(z10 ? "adDisplayFailed" : "adHidden");
                    sb2.append("` callback for ");
                    sb2.append(str2);
                    L.b("IncentivizedAdController", sb2.toString());
                }
            }
            fb.this.a(appLovinAd);
            if (z10) {
                bc.a(this.f7717b, str);
            } else {
                bc.b(this.f7717b, this.f7716a);
            }
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            fb.this.a("quota_exceeded");
            bc.b(this.f7720f, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            fb.this.a("rejected");
            bc.a(this.f7720f, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            fb.this.a("accepted");
            bc.c(this.f7720f, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            fb.this.a("network_timeout");
            bc.a(this.f7720f, appLovinAd, i10);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            bc.a(this.f7719d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            bc.a(this.f7719d, appLovinAd, d10, z10);
            boolean unused = fb.this.f7712i = z10;
        }

        /* synthetic */ c(fb fbVar, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7705b.L();
        if (t.a()) {
            this.f7705b.L().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f7709f = new SoftReference(appLovinAdLoadListener);
        if (d()) {
            t.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f7707d);
                return;
            }
            return;
        }
        a((AppLovinAdLoadListener) new b(appLovinAdLoadListener));
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f7707d;
        }
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        if (appLovinAdImpl2 != null) {
            a(appLovinAdImpl2, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        e();
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, iVar, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f7707d;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, iVar, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        t.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        e();
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, (a) null);
        AppLovinAd a10 = zp.a((AppLovinAd) appLovinAdImpl, this.f7705b);
        String a11 = a(a10, (AppLovinAd) appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f7705b.v0(), context);
        for (String str : this.f7704a.keySet()) {
            create.setExtraInfo(str, this.f7704a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        create.showAndRender(a10);
        a((com.applovin.impl.sdk.ad.b) a10, (AppLovinAdRewardListener) cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, i iVar, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, (a) null);
        AppLovinAd a10 = zp.a((AppLovinAd) appLovinAdImpl, this.f7705b);
        String a11 = a(a10, (AppLovinAd) appLovinAdImpl);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAdImpl, a11, cVar, cVar);
            return;
        }
        Context context2 = context;
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f7705b.v0(), context);
        for (String str : this.f7704a.keySet()) {
            create.setExtraInfo(str, this.f7704a.get(str));
        }
        create.setAdDisplayListener(cVar);
        create.setAdVideoPlaybackListener(cVar);
        create.setAdClickListener(cVar);
        ViewGroup viewGroup2 = viewGroup;
        i iVar2 = iVar;
        create.showAndRender(a10, viewGroup, iVar);
        a((com.applovin.impl.sdk.ad.b) a10, (AppLovinAdRewardListener) cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f7705b.l0().a((xl) new ln(bVar, appLovinAdRewardListener, this.f7705b), sm.b.OTHER);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7706c.loadNextIncentivizedAd(this.f7708e, appLovinAdLoadListener);
    }

    /* access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f7707d;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof com.applovin.impl.sdk.ad.c) {
                com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
                if (cVar.e() == null || appLovinAd == cVar.e()) {
                    this.f7707d = null;
                }
            } else if (appLovinAd == appLovinAd2) {
                this.f7707d = null;
            }
        }
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            t.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        } else if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED || appLovinAd2.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            return null;
        } else {
            t.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
            return "Attempting to display ad with invalid ad type";
        }
    }

    public void a(String str, Object obj) {
        this.f7704a.put(str, obj);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f7710g) {
            this.f7711h = str;
        }
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }
}
