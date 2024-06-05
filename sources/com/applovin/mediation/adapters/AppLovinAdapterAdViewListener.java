package com.applovin.mediation.adapters;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.mb;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinSdkUtils;

public class AppLovinAdapterAdViewListener implements mb, AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdViewEventListener {
    private final MaxAdFormat adFormat;
    private final MaxAdViewAdapterListener listener;
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterAdViewListener(AppLovinMediationAdapter appLovinMediationAdapter, MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        this.parentAdapter = appLovinMediationAdapter;
        this.adFormat = maxAdFormat;
        this.listener = maxAdViewAdapterListener;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$adReceived$0(AppLovinAd appLovinAd) {
        this.parentAdapter.loadedAdView = new AppLovinAdView(this.parentAdapter.getWrappingSdk(), appLovinAd.getSize(), this.parentAdapter.getApplicationContext());
        this.parentAdapter.loadedAdView.setAdDisplayListener(this);
        this.parentAdapter.loadedAdView.setAdClickListener(this);
        this.parentAdapter.loadedAdView.setAdViewEventListener(this);
        this.listener.onAdViewAdLoaded(this.parentAdapter.loadedAdView);
        this.parentAdapter.loadedAdView.renderAd(appLovinAd);
    }

    public void adClicked(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad clicked");
        this.listener.onAdViewAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adClosedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad collapsed");
        this.listener.onAdViewAdCollapsed();
    }

    public void adDisplayed(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad shown");
        this.listener.onAdViewAdDisplayed();
    }

    public void adFailedToDisplay(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " failed to display with error code: " + appLovinAdViewDisplayErrorCode);
        this.listener.onAdViewAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
    }

    public void adHidden(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad hidden");
        this.listener.onAdViewAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
    }

    public void adLeftApplication(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad left application");
    }

    public void adOpenedFullscreen(AppLovinAd appLovinAd, AppLovinAdView appLovinAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad expanded");
        this.listener.onAdViewAdExpanded();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad loaded");
        AppLovinSdkUtils.runOnUiThread(new a(this, appLovinAd));
    }

    public void failedToReceiveAd(int i10) {
        failedToReceiveAdV2(new AppLovinError(i10, MaxReward.DEFAULT_LABEL));
    }

    public void failedToReceiveAdV2(AppLovinError appLovinError) {
        MaxAdapterError maxError = AppLovinMediationAdapter.toMaxError(appLovinError);
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        appLovinMediationAdapter.log(this.adFormat.getLabel() + " ad failed to load with error: " + maxError);
        this.listener.onAdViewAdLoadFailed(maxError);
    }
}
