package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.Ad;

/* compiled from: Sta */
public interface AdEventListener {
    void onFailedToReceiveAd(Ad ad2);

    void onReceiveAd(Ad ad2);
}
