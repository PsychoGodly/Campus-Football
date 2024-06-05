package com.applovin.sdk;

public interface AppLovinAdService {
    void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener);

    String getBidToken();

    void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener);

    void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener);
}
