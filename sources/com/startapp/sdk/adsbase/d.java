package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public interface d {
    void a(boolean z10);

    boolean a();

    @Deprecated
    boolean a(String str);

    Long b();

    Long c();

    boolean d();

    Ad.AdState getState();

    boolean isBelowMinCPM();

    boolean isReady();

    void load(AdPreferences adPreferences, AdEventListener adEventListener);

    void setActivityExtra(ActivityExtra activityExtra);

    void setContext(Context context);
}
