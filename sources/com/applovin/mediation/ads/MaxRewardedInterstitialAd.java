package com.applovin.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAdExpirationListener;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b  reason: collision with root package name */
    private static WeakReference f14006b = new WeakReference((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final MaxFullscreenAdImpl f14007a;

    public MaxRewardedInterstitialAd(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public void destroy() {
        this.f14007a.logApiCall("destroy()");
        this.f14007a.destroy();
    }

    public Activity getActivity() {
        this.f14007a.logApiCall("getActivity()");
        return (Activity) f14006b.get();
    }

    public boolean isReady() {
        boolean isReady = this.f14007a.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f14007a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f14007a.logApiCall("loadAd()");
        this.f14007a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f14007a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f14007a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f14007a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f14007a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f14007a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f14007a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f14007a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return MaxReward.DEFAULT_LABEL + this.f14007a;
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (appLovinSdk != null) {
            if (context instanceof Activity) {
                f14006b = new WeakReference((Activity) context);
            }
            this.f14007a = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.a(), context);
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        this.f14007a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, i iVar, Activity activity) {
        showAd((String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar, Activity activity) {
        showAd(str, (String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ", activity=" + activity + ")");
        this.f14007a.showAd(str, str2, viewGroup, iVar, activity);
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        this.f14007a.showAd(str, str2, getActivity());
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14007a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f14007a.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
