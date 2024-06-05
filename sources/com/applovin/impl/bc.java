package com.applovin.impl;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

public abstract class bc {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f6681a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f6682b = true;

    public static void a(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdClickListener != null) {
            AppLovinSdkUtils.runOnUiThread(new cv(appLovinAdClickListener, appLovinAd));
        }
    }

    public static void b(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new ev(appLovinAdDisplayListener, appLovinAd));
        }
    }

    public static void c(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new wt(appLovinAdRewardListener, appLovinAd, map));
        }
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd) {
        d(maxAdListener, maxAd, false);
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd) {
        e(maxAdListener, maxAd, false);
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd) {
        f(maxAdListener, maxAd, false);
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd) {
        g(maxAdListener, maxAd, false);
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd) {
        h(maxAdListener, maxAd, false);
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new dv(appLovinAdDisplayListener, appLovinAd));
        }
    }

    public static void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new vt(appLovinAdRewardListener, appLovinAd, map));
        }
    }

    public static void c(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new ou(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
        }
    }

    public static void d(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z10, new gu(z10, maxAdListener, maxAd));
        }
    }

    public static void e(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new ju(z10, maxAdListener, maxAd));
        }
    }

    public static void f(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new mu(z10, maxAdListener, maxAd));
        }
    }

    public static void g(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z10, new lu(z10, maxAdListener, maxAd));
        }
    }

    public static void h(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z10, new nu(z10, maxAdListener, maxAd));
        }
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new xt(appLovinAdRewardListener, appLovinAd, map));
        }
    }

    public static void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new st(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd) {
        c(maxAdListener, maxAd, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userOverQuota(a(appLovinAd), map);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardVerified(a(appLovinAd), map);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
        }
    }

    public static void a(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i10) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new ut(appLovinAdRewardListener, appLovinAd, i10));
        }
    }

    public static void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new au(appLovinBidTokenCollectionListener, str));
        }
    }

    public static void c(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new hu(z10, maxAdListener, maxAd));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adHidden(a(appLovinAd));
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
            c("adHidden", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
            } catch (Throwable th) {
                a("onRewardedVideoCompleted", th, z10);
            }
        } else {
            ((MaxRewardedAdListener) maxAdListener).onRewardedVideoCompleted(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
            } catch (Throwable th) {
                a("onRewardedVideoStarted", th, z10);
            }
        } else {
            ((MaxRewardedAdListener) maxAdListener).onRewardedVideoStarted(maxAd);
        }
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new yt(appLovinAdVideoPlaybackListener, appLovinAd));
        }
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd) {
        b(maxAdListener, maxAd, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdDisplayListener.adDisplayed(a(appLovinAd));
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
            c("adDisplayed", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adLeftApplication(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adOpenedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
        }
    }

    public static void a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d10, boolean z10) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new zt(appLovinAdVideoPlaybackListener, appLovinAd, d10, z10));
        }
    }

    public static void b(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z10, new ku(z10, maxAdListener, maxAd));
        }
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new du(appLovinAdViewEventListener, appLovinAd, appLovinAdView));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, Map map) {
        try {
            appLovinAdRewardListener.userRewardRejected(a(appLovinAd), map);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdHidden(maxAd);
            } catch (Throwable th) {
                a("onAdHidden", th, z10);
                c("maxAdHidden", th);
            }
        } else {
            maxAdListener.onAdHidden(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdLoaded(maxAd);
            } catch (Throwable th) {
                a("onAdLoaded", th, z10);
                c("maxAdLoaded", th);
            }
        } else {
            maxAdListener.onAdLoaded(maxAd);
        }
    }

    public static void a(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new yu(appLovinAdViewEventListener, appLovinAd, appLovinAdView, appLovinAdViewDisplayErrorCode));
        }
    }

    public static void b(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new vu(z10, maxNativeAdListener, maxAd));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollected(str);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about successful bid token collection", th);
            c("onBidTokenCollected", th);
        }
    }

    public static void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        if (appLovinBidTokenCollectionListener != null) {
            AppLovinSdkUtils.runOnUiThread(new bu(appLovinBidTokenCollectionListener, str));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdClickListener appLovinAdClickListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdClickListener.adClicked(a(appLovinAd));
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
            c("adClicked", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        try {
            appLovinAdViewEventListener.adClosedFullscreen(a(appLovinAd), appLovinAdView);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
        }
    }

    public static void a(AppLovinAdDisplayListener appLovinAdDisplayListener, String str) {
        if (appLovinAdDisplayListener instanceof lb) {
            AppLovinSdkUtils.runOnUiThread(new tt(appLovinAdDisplayListener, str));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdDisplayed(maxAd);
            } catch (Throwable th) {
                a("onAdDisplayed", th, z10);
                c("maxAdDisplayed", th);
            }
        } else {
            maxAdListener.onAdDisplayed(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener, String str) {
        try {
            appLovinBidTokenCollectionListener.onBidTokenCollectionFailed(str);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify bid token listener about bid token collection failure", th);
            c("onBidTokenCollectionFailed", th);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd) {
        a(maxAdListener, maxAd, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAd appLovinAd, int i10) {
        try {
            appLovinAdRewardListener.validationRequestFailed(a(appLovinAd), i10);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new iu(z10, maxAdListener, maxAd));
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        a(maxAdListener, maxAd, maxError, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackBegan(a(appLovinAd));
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
            } catch (Throwable th) {
                a("onAdExpanded", th, z10);
            }
        } else {
            ((MaxAdViewAdListener) maxAdListener).onAdExpanded(maxAd);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError, boolean z10) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new pu(z10, maxAdListener, maxAd, maxError));
        }
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        a(maxAdListener, str, maxError, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d10, boolean z10) {
        try {
            appLovinAdVideoPlaybackListener.videoPlaybackEnded(a(appLovinAd), d10, z10);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
        }
    }

    private static boolean c(boolean z10) {
        return z10 ? f6681a : f6682b;
    }

    public static void a(MaxAdListener maxAdListener, String str, MaxError maxError, boolean z10) {
        if (str != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new ru(z10, maxAdListener, str, maxError));
        }
    }

    private static void c(String str, Throwable th) {
        k kVar = k.A0;
        if (kVar != null) {
            kVar.B().a("ListenerCallbackInvoker", str, th);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str) {
        a(maxAdRequestListener, str, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinAdViewEventListener appLovinAdViewEventListener, AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        try {
            appLovinAdViewEventListener.adFailedToDisplay(a(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
        }
    }

    public static void a(MaxAdRequestListener maxAdRequestListener, String str, boolean z10) {
        if (str != null && maxAdRequestListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new su(z10, maxAdRequestListener, str));
        }
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        a(maxAdRevenueListener, maxAd, false);
    }

    public static void a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxAdRevenueListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new tu(z10, maxAdRevenueListener, maxAd));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
            } catch (Throwable th) {
                a("onAdCollapsed", th, z10);
            }
        } else {
            ((MaxAdViewAdListener) maxAdListener).onAdCollapsed(maxAd);
        }
    }

    public static void a(MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2, boolean z10) {
        if (maxAd != null && maxAd2 != null && maxAdExpirationListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new fu(z10, maxAdExpirationListener, maxAd, maxAd2));
        }
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new uu(z10, maxNativeAdListener, maxAd));
        }
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError, boolean z10) {
        if (str != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new xu(z10, maxNativeAdListener, str, maxError));
        }
    }

    public static void a(MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd, boolean z10) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new wu(z10, maxNativeAdListener, maxNativeAdView, maxAd));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdExpired(maxAd);
            } catch (Throwable th) {
                a("onNativeAdExpired", th, z10);
                c("maxNativeAdExpired", th);
            }
        } else {
            maxNativeAdListener.onNativeAdExpired(maxAd);
        }
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        a(maxAdListener, maxAd, maxReward, false);
    }

    public static void a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward, boolean z10) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z10, new qu(z10, maxAdListener, maxAd, maxReward));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str, int i10) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new eu(appLovinPostbackListener, str, i10));
        }
    }

    public static void a(AppLovinPostbackListener appLovinPostbackListener, String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new cu(appLovinPostbackListener, str));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str, int i10) {
        try {
            appLovinPostbackListener.onPostbackFailure(str, i10);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i10 + "):", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdListener.onAdClicked(maxAd);
            } catch (Throwable th) {
                a("onAdClicked", th, z10);
                c("maxAdClicked", th);
            }
        } else {
            maxAdListener.onAdClicked(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(AppLovinPostbackListener appLovinPostbackListener, String str) {
        try {
            appLovinPostbackListener.onPostbackSuccess(str);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
        }
    }

    public static void b(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        a(maxAdReviewListener, str, maxAd, false);
    }

    public static void b(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new zu(appLovinNativeAdEventListener, appLovinNativeAd));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        if (c(z10)) {
            try {
                maxAdListener.onAdDisplayFailed(maxAd, maxError);
            } catch (Throwable th) {
                a("onAdDisplayFailed", th, z10);
                c("maxAdDisplayFailed", th);
            }
        } else {
            maxAdListener.onAdDisplayFailed(maxAd, maxError);
        }
    }

    public static void b(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new av(appLovinNativeAdLoadListener, appLovinError));
        }
    }

    public static void b(boolean z10) {
        f6681a = z10;
    }

    private static void b(String str, Throwable th) {
        t.c("ListenerCallbackInvoker", "Error in publisher callback '" + str + "'", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, String str, MaxError maxError) {
        if (c(z10)) {
            try {
                maxAdListener.onAdLoadFailed(str, maxError);
            } catch (Throwable th) {
                a("onAdLoadFailed", th, z10);
                c("maxAdLoadFailed", th);
            }
        } else {
            maxAdListener.onAdLoadFailed(str, maxError);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdRequestListener maxAdRequestListener, String str) {
        if (c(z10)) {
            try {
                maxAdRequestListener.onAdRequestStarted(str);
            } catch (Throwable th) {
                a("onAdRequestStarted", th, z10);
                c("maxAdRequestStarted", th);
            }
        } else {
            maxAdRequestListener.onAdRequestStarted(str);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxAdRevenueListener.onAdRevenuePaid(maxAd);
            } catch (Throwable th) {
                a("onAdRevenuePaid", th, z10);
                c("maxAdPaidRevenue", th);
            }
        } else {
            maxAdRevenueListener.onAdRevenuePaid(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdExpirationListener maxAdExpirationListener, MaxAd maxAd, MaxAd maxAd2) {
        if (c(z10)) {
            try {
                maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
            } catch (Throwable th) {
                a("onExpiredAdReloaded", th, z10);
                c("maxExpiredAdReloaded", th);
            }
        } else {
            maxAdExpirationListener.onExpiredAdReloaded(maxAd, maxAd2);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdClicked(maxAd);
            } catch (Throwable th) {
                a("onNativeAdClicked", th, z10);
                c("maxNativeAdClicked", th);
            }
        } else {
            maxNativeAdListener.onNativeAdClicked(maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, String str, MaxError maxError) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
            } catch (Throwable th) {
                a("onNativeAdLoadFailed", th, z10);
                c("maxNativeAdLoadFailed", th);
            }
        } else {
            maxNativeAdListener.onNativeAdLoadFailed(str, maxError);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxNativeAdListener maxNativeAdListener, MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (c(z10)) {
            try {
                maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
            } catch (Throwable th) {
                a("onNativeAdLoaded", th, z10);
                c("maxNativeAdLoaded", th);
            }
        } else {
            maxNativeAdListener.onNativeAdLoaded(maxNativeAdView, maxAd);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(boolean z10, MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        if (c(z10)) {
            try {
                ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
            } catch (Throwable th) {
                a("onUserRewarded", th, z10);
                c("maxRewardedUser", th);
            }
        } else {
            ((MaxRewardedAdListener) maxAdListener).onUserRewarded(maxAd, maxReward);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        try {
            maxAdReviewListener.onCreativeIdGenerated(str, maxAd);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
            c("adReviewCreativeIdGenerated", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AppLovinNativeAdEventListener appLovinNativeAdEventListener, AppLovinNativeAd appLovinNativeAd) {
        try {
            appLovinNativeAdEventListener.onNativeAdClicked(appLovinNativeAd);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
            c("nativeAdClicked", th);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, AppLovinError appLovinError) {
        try {
            appLovinNativeAdLoadListener.onNativeAdLoadFailed(appLovinError);
        } catch (Throwable th) {
            t.c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
            c("nativeAdLoadFailed", th);
        }
    }

    private static void a(String str, Throwable th, boolean z10) {
        if (z10) {
            b(str, th);
        } else {
            a(str, th);
        }
    }

    public static void a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd, boolean z10) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z10, new bv(maxAdReviewListener, str, maxAd));
        }
    }

    private static AppLovinAd a(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    public static void a(boolean z10) {
        f6682b = z10;
    }

    private static void a(String str, Throwable th) {
        t.b("ListenerCallbackInvoker", "Error in internal callback '" + str + "'", th);
    }
}
