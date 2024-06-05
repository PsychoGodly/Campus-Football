package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.sdk.AppLovinAdLoadListener;

public interface mb extends AppLovinAdLoadListener {
    void failedToReceiveAdV2(AppLovinError appLovinError);
}
