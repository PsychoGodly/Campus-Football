package com.applovin.applovin_max;

import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements AppLovinSdk.SdkInitializationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppLovinMAX f6010a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f6011b;

    public /* synthetic */ b(AppLovinMAX appLovinMAX, k.d dVar) {
        this.f6010a = appLovinMAX;
        this.f6011b = dVar;
    }

    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
        this.f6010a.lambda$initialize$0(this.f6011b, appLovinSdkConfiguration);
    }
}
