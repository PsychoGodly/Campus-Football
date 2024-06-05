package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinAppOpenAd;
import com.applovin.impl.adview.AppLovinRewardedInterstitialAd;
import com.applovin.impl.mb;
import com.applovin.impl.qe;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxInterstitialAdapter, MaxRewardedAdapter, MaxRewardedInterstitialAdapter, MaxAdViewAdapter {
    protected AppLovinAdView loadedAdView;
    protected AppLovinAd loadedAppOpenAd;
    protected AppLovinAd loadedInterstitialAd;
    protected AppLovinNativeAd loadedNativeAd;
    protected AppLovinAd loadedRewardedAd;
    protected AppLovinAd loadedRewardedInterstitialAd;

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    protected static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle("ad_values", ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Object obj) {
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), (mb) obj);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, (mb) obj);
        } else {
            log("Loading mediated " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, (mb) obj);
        }
    }

    protected static MaxAdapterError toMaxError(AppLovinError appLovinError) {
        MaxAdapterError maxAdapterError;
        if (appLovinError.getCode() == -1009) {
            maxAdapterError = MaxAdapterError.NO_CONNECTION;
        } else if (appLovinError.getCode() == 204) {
            maxAdapterError = MaxAdapterError.NO_FILL;
        } else if (appLovinError.getCode() == -1) {
            maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
        } else if (appLovinError.getCode() >= 500) {
            maxAdapterError = MaxAdapterError.SERVER_ERROR;
        } else {
            maxAdapterError = MaxAdapterError.UNSPECIFIED;
        }
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), appLovinError.getCode(), appLovinError.getMessage());
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, final MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        if (((Boolean) getWrappingSdk().a().a(qe.M7)).booleanValue()) {
            getWrappingSdk().getAdService().collectBidToken(new AppLovinBidTokenCollectionListener() {
                public void onBidTokenCollected(String str) {
                    AppLovinMediationAdapter.this.log("Signal collection successful");
                    maxSignalCollectionListener.onSignalCollected(str);
                }

                public void onBidTokenCollectionFailed(String str) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Signal collection failed with error: " + str);
                    maxSignalCollectionListener.onSignalCollectionFailed(str);
                }
            });
        } else {
            maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
        }
    }

    public String getAdapterVersion() {
        return getSdkVersion();
    }

    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AppLovinAdapterAdViewListener appLovinAdapterAdViewListener = new AppLovinAdapterAdViewListener(this, maxAdFormat, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdapterAdViewListener);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, appLovinAdapterAdViewListener);
        } else {
            AppLovinAdSize appLovinAdSize = null;
            if (maxAdFormat == MaxAdFormat.BANNER) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            } else if (maxAdFormat == MaxAdFormat.MREC) {
                appLovinAdSize = AppLovinAdSize.MREC;
            } else if (maxAdFormat == MaxAdFormat.LEADER) {
                appLovinAdSize = AppLovinAdSize.LEADER;
            }
            if (appLovinAdSize != null) {
                log("Loading regular " + maxAdFormat.getLabel() + " ad...");
                getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, appLovinAdapterAdViewListener);
                return;
            }
            log("Failed to load ad for format: " + maxAdFormat);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
        }
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        loadFullscreenAd("inter_appopen", maxAdapterResponseParameters, MaxAdFormat.APP_OPEN, new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener));
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        d("Loading bidding native ad...");
        getWrappingSdk().a().W().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinAdapterNativeListener(maxAdapterResponseParameters, this, maxNativeAdAdapterListener));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener));
    }

    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, MaxAdFormat.REWARDED_INTERSTITIAL, new AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener));
    }

    public void onDestroy() {
        this.loadedInterstitialAd = null;
        this.loadedAppOpenAd = null;
        this.loadedRewardedAd = null;
        this.loadedRewardedInterstitialAd = null;
        AppLovinAdView appLovinAdView = this.loadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.loadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        log("Showing app open ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinAppOpenAd appLovinAppOpenAd = new AppLovinAppOpenAd(getWrappingSdk());
        AppLovinAdapterAppOpenListener appLovinAdapterAppOpenListener = new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener);
        appLovinAppOpenAd.setAdDisplayListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.setAdClickListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.show(this.loadedAppOpenAd);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        create.show(this.loadedRewardedAd, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinAdapterRewardedInterstitialListener appLovinAdapterRewardedInterstitialListener = new AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener);
        if (this.loadedRewardedInterstitialAd.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.show(this.loadedRewardedInterstitialAd, activity, appLovinAdapterRewardedInterstitialListener);
            return;
        }
        log("Rewarded interstitial is regular interstitial");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        create.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
        create.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
        create.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
        create.showAndRender(this.loadedRewardedInterstitialAd);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        create.show(this.loadedRewardedAd, viewGroup, iVar, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, i iVar, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd, viewGroup, iVar);
    }
}
