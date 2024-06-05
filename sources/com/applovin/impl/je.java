package com.applovin.impl;

import com.applovin.impl.mediation.ads.a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

public abstract class je implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, a.C0126a {

    /* renamed from: a  reason: collision with root package name */
    private final a.C0126a f8742a;

    public je(a.C0126a aVar) {
        this.f8742a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        bc.a((MaxAdListener) this.f8742a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        bc.b((MaxAdListener) this.f8742a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        bc.a((MaxAdListener) this.f8742a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        bc.c((MaxAdListener) this.f8742a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        bc.d((MaxAdListener) this.f8742a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        bc.e(this.f8742a, maxAd);
    }

    public void onAdRequestStarted(String str) {
        bc.a((MaxAdRequestListener) this.f8742a, str);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        bc.a((MaxAdRevenueListener) this.f8742a, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        bc.g(this.f8742a, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        bc.h(this.f8742a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        bc.a((MaxAdListener) this.f8742a, maxAd, maxReward);
    }
}
