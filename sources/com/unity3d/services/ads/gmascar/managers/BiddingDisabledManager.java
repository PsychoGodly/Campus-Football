package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

public class BiddingDisabledManager extends BiddingBaseManager {
    public BiddingDisabledManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(false, iUnityAdsTokenListener);
    }

    public String getTokenIdentifier() {
        return null;
    }

    public void start() {
    }
}
