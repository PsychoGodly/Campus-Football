package com.applovin.mediation.adapters;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.util.ArrayList;
import java.util.List;

public class AppLovinAdapterNativeAd extends MaxNativeAd {
    private final AppLovinMediationAdapter parentAdapter;

    public AppLovinAdapterNativeAd(AppLovinMediationAdapter appLovinMediationAdapter, MaxNativeAd.Builder builder) {
        super(builder);
        this.parentAdapter = appLovinMediationAdapter;
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad views: native ad is null");
            return false;
        }
        appLovinMediationAdapter.d("Preparing views for interaction: " + list + " with container: " + viewGroup);
        appLovinNativeAdImpl.registerViewsForInteraction(list, viewGroup);
        return true;
    }

    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
        AppLovinMediationAdapter appLovinMediationAdapter = this.parentAdapter;
        AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) appLovinMediationAdapter.loadedNativeAd;
        if (appLovinNativeAdImpl == null) {
            appLovinMediationAdapter.e("Failed to register native ad view for interaction. Native ad is null");
            return;
        }
        appLovinMediationAdapter.d("Preparing view for interaction: " + maxNativeAdView);
        ArrayList arrayList = new ArrayList(5);
        if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter2 = this.parentAdapter;
            appLovinMediationAdapter2.d("Adding title TextView: " + maxNativeAdView.getTitleTextView());
            arrayList.add(maxNativeAdView.getTitleTextView());
        }
        if (StringUtils.isValidString(getAdvertiser()) && maxNativeAdView.getAdvertiserTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter3 = this.parentAdapter;
            appLovinMediationAdapter3.d("Adding advertiser TextView: " + maxNativeAdView.getAdvertiserTextView());
            arrayList.add(maxNativeAdView.getAdvertiserTextView());
        }
        if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter4 = this.parentAdapter;
            appLovinMediationAdapter4.d("Adding body TextView: " + maxNativeAdView.getBodyTextView());
            arrayList.add(maxNativeAdView.getBodyTextView());
        }
        if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
            AppLovinMediationAdapter appLovinMediationAdapter5 = this.parentAdapter;
            appLovinMediationAdapter5.d("Adding CTA button: " + maxNativeAdView.getCallToActionButton());
            AppLovinMediationAdapter appLovinMediationAdapter6 = this.parentAdapter;
            appLovinMediationAdapter6.d("CTA button is clickable: " + maxNativeAdView.getCallToActionButton().isClickable());
            AppLovinMediationAdapter appLovinMediationAdapter7 = this.parentAdapter;
            appLovinMediationAdapter7.d("CTA button is enabled: " + maxNativeAdView.getCallToActionButton().isEnabled());
            AppLovinMediationAdapter appLovinMediationAdapter8 = this.parentAdapter;
            appLovinMediationAdapter8.d("CTA button has onClickListeners: " + maxNativeAdView.getCallToActionButton().hasOnClickListeners());
            arrayList.add(maxNativeAdView.getCallToActionButton());
        }
        if (!(getIcon() == null || maxNativeAdView.getIconImageView() == null)) {
            AppLovinMediationAdapter appLovinMediationAdapter9 = this.parentAdapter;
            appLovinMediationAdapter9.d("Adding icon image view: " + maxNativeAdView.getIconImageView());
            arrayList.add(maxNativeAdView.getIconImageView());
        }
        appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
    }
}
