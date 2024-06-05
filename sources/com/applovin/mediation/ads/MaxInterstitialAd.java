package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

public class MaxInterstitialAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference f14000b = new WeakReference((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final MaxFullscreenAdImpl f14001a;

    public MaxInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f14001a.logApiCall("destroy()");
        this.f14001a.destroy();
    }

    public Activity getActivity() {
        this.f14001a.logApiCall("getActivity()");
        return (Activity) f14000b.get();
    }

    public String getAdUnitId() {
        return this.f14001a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f14001a.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f14001a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f14001a.logApiCall("loadAd()");
        this.f14001a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f14001a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f14001a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f14001a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f14001a.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f14001a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f14001a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f14001a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return MaxReward.DEFAULT_LABEL + this.f14001a;
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (appLovinSdk != null) {
            if (context instanceof Activity) {
                f14000b = new WeakReference((Activity) context);
            }
            this.f14001a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.a(), context);
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        zp.b(str2, "MaxInterstitialAd");
        this.f14001a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, i iVar, Activity activity) {
        showAd((String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar, Activity activity) {
        showAd(str, (String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ", activity=" + activity + ")");
        this.f14001a.showAd(str, str2, viewGroup, iVar, activity);
    }

    @Deprecated
    public void showAd() {
        showAd((String) null);
    }

    @Deprecated
    public void showAd(String str) {
        showAd(str, (String) null);
    }

    @Deprecated
    public void showAd(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        zp.b(str2, "MaxInterstitialAd");
        this.f14001a.showAd(str, str2, getActivity());
    }

    @Deprecated
    public void showAd(ViewGroup viewGroup, i iVar) {
        showAd((String) null, viewGroup, iVar);
    }

    @Deprecated
    public void showAd(String str, ViewGroup viewGroup, i iVar) {
        showAd(str, (String) null, viewGroup, iVar);
    }

    @Deprecated
    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14001a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f14001a.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
