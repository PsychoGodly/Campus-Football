package com.applovin.applovin_max;

import android.content.Context;
import android.view.View;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import java.util.HashMap;
import java.util.Map;
import lc.c;
import lc.j;
import lc.k;

public class AppLovinMAXAdView implements f, MaxAdViewAdListener, MaxAdRevenueListener {
    private static final Map<String, MaxAdView> adViewInstances = new HashMap(2);
    /* access modifiers changed from: private */
    public final MaxAdView adView;
    private final k channel;

    public AppLovinMAXAdView(int i10, String str, MaxAdFormat maxAdFormat, boolean z10, String str2, String str3, Map<String, Object> map, Map<String, Object> map2, c cVar, AppLovinSdk appLovinSdk, Context context) {
        k kVar = new k(cVar, "applovin_max/adview_" + i10);
        this.channel = kVar;
        kVar.e(new k.c() {
            public void onMethodCall(j jVar, k.d dVar) {
                if ("startAutoRefresh".equals(jVar.f36116a)) {
                    AppLovinMAXAdView.this.adView.startAutoRefresh();
                    dVar.success((Object) null);
                } else if ("stopAutoRefresh".equals(jVar.f36116a)) {
                    AppLovinMAXAdView.this.adView.stopAutoRefresh();
                    dVar.success((Object) null);
                } else {
                    dVar.notImplemented();
                }
            }
        });
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, appLovinSdk, context);
        this.adView = maxAdView;
        maxAdView.setListener(this);
        maxAdView.setRevenueListener(this);
        maxAdView.setPlacement(str2);
        maxAdView.setCustomData(str3);
        maxAdView.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                this.adView.setExtraParameter((String) next.getKey(), (String) next.getValue());
            }
        }
        if (map2 != null) {
            for (Map.Entry next2 : map2.entrySet()) {
                this.adView.setLocalExtraParameter((String) next2.getKey(), next2.getValue());
            }
        }
        this.adView.loadAd();
        if (!z10) {
            this.adView.stopAutoRefresh();
        }
        adViewInstances.put(str, this.adView);
    }

    public static MaxAdView getInstance(String str) {
        return adViewInstances.get(str);
    }

    private void sendEvent(String str, MaxAd maxAd) {
        AppLovinMAX.getInstance().fireCallback(str, maxAd, this.channel);
    }

    public void dispose() {
        MaxAdView maxAdView = this.adView;
        if (maxAdView != null) {
            adViewInstances.remove(maxAdView.getAdUnitId());
            this.adView.destroy();
            this.adView.setListener((MaxAdViewAdListener) null);
            this.adView.setRevenueListener((MaxAdRevenueListener) null);
        }
        k kVar = this.channel;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
    }

    public View getView() {
        return this.adView;
    }

    public void onAdClicked(MaxAd maxAd) {
        sendEvent("OnAdViewAdClickedEvent", maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        sendEvent("OnAdViewAdCollapsedEvent", maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
    }

    public void onAdDisplayed(MaxAd maxAd) {
    }

    public void onAdExpanded(MaxAd maxAd) {
        sendEvent("OnAdViewAdExpandedEvent", maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AppLovinMAX.getInstance().fireCallback("OnAdViewAdLoadFailedEvent", AppLovinMAX.getInstance().getAdLoadFailedInfo(str, maxError), this.channel);
    }

    public void onAdLoaded(MaxAd maxAd) {
        sendEvent("OnAdViewAdLoadedEvent", maxAd);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        sendEvent("OnAdViewAdRevenuePaidEvent", maxAd);
    }

    public void onFlutterViewAttached(View view) {
    }

    public void onFlutterViewDetached() {
    }

    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        e.c(this);
    }

    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        e.d(this);
    }
}
