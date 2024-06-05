package com.unity3d.services.ads.gmascar.listeners;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;

public interface IBiddingSignalsListener {
    void onSignalsFailure(String str);

    void onSignalsReady(BiddingSignals biddingSignals);
}
