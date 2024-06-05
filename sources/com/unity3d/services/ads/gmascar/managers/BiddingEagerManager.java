package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.ads.IUnityAdsTokenListener;

public class BiddingEagerManager extends BiddingBaseManager {
    public BiddingEagerManager(boolean z10, IUnityAdsTokenListener iUnityAdsTokenListener) {
        super(z10, iUnityAdsTokenListener);
    }

    public void start() {
        permitSignalsUpload();
        fetchSignals();
    }
}
