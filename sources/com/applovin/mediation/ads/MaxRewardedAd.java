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
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class MaxRewardedAd implements MaxFullscreenAdImpl.b {

    /* renamed from: b  reason: collision with root package name */
    private static final Map f14002b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f14003c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static WeakReference f14004d = new WeakReference((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final MaxFullscreenAdImpl f14005a;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk, Context context) {
        this.f14005a = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.a(), context);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public void destroy() {
        this.f14005a.logApiCall("destroy()");
        synchronized (f14003c) {
            f14002b.remove(this.f14005a.getAdUnitId());
        }
        this.f14005a.destroy();
    }

    public Activity getActivity() {
        this.f14005a.logApiCall("getActivity()");
        return (Activity) f14004d.get();
    }

    public String getAdUnitId() {
        return this.f14005a.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f14005a.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f14005a.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f14005a.logApiCall("loadAd()");
        this.f14005a.loadAd();
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f14005a.setAdReviewListener(maxAdReviewListener);
    }

    public void setExpirationListener(MaxAdExpirationListener maxAdExpirationListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setExpirationListener(listener=" + maxAdExpirationListener + ")");
        this.f14005a.setExpirationListener(maxAdExpirationListener);
    }

    public void setExtraParameter(String str, String str2) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f14005a.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f14005a.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f14005a.setLocalExtraParameter(str, obj);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f14005a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f14005a.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd(Activity activity) {
        showAd((String) null, activity);
    }

    public String toString() {
        return MaxReward.DEFAULT_LABEL + this.f14005a;
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Context context) {
        a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", context=" + context + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (appLovinSdk != null) {
            if (context instanceof Activity) {
                f14004d = new WeakReference((Activity) context);
            }
            synchronized (f14003c) {
                Map map = f14002b;
                MaxRewardedAd maxRewardedAd = (MaxRewardedAd) map.get(str);
                if (maxRewardedAd != null) {
                    return maxRewardedAd;
                }
                MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk, context);
                map.put(str, maxRewardedAd2);
                return maxRewardedAd2;
            }
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    public void showAd(String str, Activity activity) {
        showAd(str, (String) null, activity);
    }

    public void showAd(String str, String str2, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", activity=" + activity + ")");
        zp.b(str2, "MaxRewardedAd");
        this.f14005a.showAd(str, str2, activity);
    }

    public void showAd(ViewGroup viewGroup, i iVar, Activity activity) {
        showAd((String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, ViewGroup viewGroup, i iVar, Activity activity) {
        showAd(str, (String) null, viewGroup, iVar, activity);
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, i iVar, Activity activity) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ", activity=" + activity + ")");
        this.f14005a.showAd(str, str2, viewGroup, iVar, activity);
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ")");
        zp.b(str2, "MaxRewardedAd");
        this.f14005a.showAd(str, str2, getActivity());
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
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f14005a;
        maxFullscreenAdImpl.logApiCall("showAd(placement=" + str + ", customData=" + str2 + ", containerView=" + viewGroup + ", lifecycle=" + iVar + ")");
        this.f14005a.showAd(str, str2, viewGroup, iVar, getActivity());
    }
}
