package com.applovin.mediation;

import android.os.Bundle;

public interface MaxNetworkResponseInfo {

    public enum AdLoadState {
        AD_LOAD_NOT_ATTEMPTED,
        AD_LOADED,
        FAILED_TO_LOAD
    }

    AdLoadState getAdLoadState();

    Bundle getCredentials();

    MaxError getError();

    long getLatencyMillis();

    MaxMediatedNetworkInfo getMediatedNetwork();

    boolean isBidding();
}
