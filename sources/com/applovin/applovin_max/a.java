package com.applovin.applovin_max;

import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinCmpService;
import lc.k;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements AppLovinCmpService.OnCompletedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.d f6009a;

    public /* synthetic */ a(k.d dVar) {
        this.f6009a = dVar;
    }

    public final void onCompleted(AppLovinCmpError appLovinCmpError) {
        AppLovinMAX.lambda$showCmpForExistingUser$2(this.f6009a, appLovinCmpError);
    }
}
